FROM openjdk:17

COPY target/employee-management.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "employee-management.jar"]