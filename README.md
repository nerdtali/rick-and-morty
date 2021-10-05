# Microservicio que consume API's de Rick and Morty

Microservicio compilado con OpenJDK-11

Para ejecutarlo, dentro de la carpeta del proyecto ejecute el siguiente comando:

    $mvn compile package

Una vez terminado el build, ejecute el siguiente comando para iniciar el microservicio:

    $java -jar target/characters-0.0.1-SNAPSHOT.jar


Para consumir la API consuma la siguiente URI con método GET: 

     http://localhost:8080/api/nmc/rick-and-morty/v1/character/1/location
