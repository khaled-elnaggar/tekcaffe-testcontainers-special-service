#! /usr/bin/bash
echo "Stopping container my-service"
docker rm -f my-service

echo "Running new container my-service"
docker run -p 9876:9876 --name my-service -d special/my-special-service
