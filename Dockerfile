# Etapa de construcción
FROM ubuntu:latest AS build

# Actualizar e instalar JDK 17
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Crear un directorio de trabajo
WORKDIR /app
@@ -26,7 +26,7 @@ WORKDIR /app
EXPOSE 2524

# Copiar el archivo JAR generado desde la etapa de compilación
COPY --from=build /app/build/demo-1.jar ./app.jar
COPY --from=build /app/build/libs/primer-parcial-0.0.1-SNAPSHOT.jar ./app.jar

# Comando de inicio
ENTRYPOINT ["java", "-jar", "./app.jar"]
