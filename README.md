```
mvn clean package
docker build -t mymicro/eurekaservices-config-server ./config-server
docker build -t mymicro/eurekaservices-discovery-server ./discovery-server
docker build -t mymicro/eurekaservices-hits-service ./hits-service
docker-compose up
```