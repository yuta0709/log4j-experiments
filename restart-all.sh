#! /bin/bash

if [ "$EUID" -ne 0 ]; then
    echo "please run as root"
    exit
fi

if [ -n `ip a | grep sw0` ]; then
    ovs-vsctl del-br sw0
fi

docker-compose down
docker-compose up -d


ovs-docker add-port sw0 eth0 attacker-http --ipaddress='10.0.1.10/24'
ovs-docker add-port sw0 eth0 attacker-ldap --ipaddress='10.0.1.20/24'
ovs-docker add-port sw0 eth0 attacker-shell --ipaddress='10.0.1.90/24'

ifconfig eth0 0.0.0.0
ifconfig sw0 10.0.1.30 netmask 255.255.255.0

ovs-vsctl add-port sw0 eth0
