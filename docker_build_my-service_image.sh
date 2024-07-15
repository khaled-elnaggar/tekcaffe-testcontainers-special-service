#! /usr/bin/bash
echo "Removing image special/my-special-service"
docker image rm -f special/my-special-service

echo "Building image special/my-special-service"
docker build -t special/my-special-service .
