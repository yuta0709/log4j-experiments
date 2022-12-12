#! /bin/bash

if [ "$EUID" -ne 0 ]; then
    echo "please run as root"
    exit
fi

docker-compose down

ovs-vsctl del-br sw0

route delete default
dhclient
