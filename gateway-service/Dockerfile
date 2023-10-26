FROM openjdk:17
EXPOSE 8060
ADD target/gateway-service.jar gateway-service.jar
ENTRYPOINT [ "java","-jar","/gateway-service.jar" ]