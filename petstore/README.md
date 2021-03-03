# petstore

This is an example of usage karate framework for bdd based api testing
for https://github.com/swagger-api/swagger-petstore Petstore Petstore - OpenAPI 3.0

Based on https://github.com/intuit/karate

Feature file is in /src/test/resources/service/

This feature represent the CRUD check for "/pet" endpoint 

before run change in  Environment.csv to /src/test/resources/ :

baseUri - Base URI of the service.

Required
Java 8
_______________________________________________________________________

to run tests please execute in the command promt:" ./gradlew test "

You can find run report in /target/surefire-reports/karate-summary.html


