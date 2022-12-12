#! /bin/bash

if [ "$EUID" -ne 0 ]; then
    echo "please run as root"
    exit
fi

apt-get update

apt-get install -y docker.io docker-compose 

systemctl enable docker
systemctl start docker

apt-get install -y openvswitch-switch openvswitch-common

/usr/share/openvswitch/scripts/ovs-ctl start




