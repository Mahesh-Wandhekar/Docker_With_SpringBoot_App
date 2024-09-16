FROM OpenJDK : 11

COPY target/sp-app.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "sp-app.jar"]