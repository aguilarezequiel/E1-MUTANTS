FROM openjdk:17-alpine as build

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17-alpine

WORKDIR /app
EXPOSE 2524

COPY --from=build /app/build/libs/inicial1-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-jar", "./app.jar"]
