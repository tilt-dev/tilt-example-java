#!/bin/bash

url=http://localhost:8080/hello

while true
do 
curl $url
echo " "
sleep 5
done
