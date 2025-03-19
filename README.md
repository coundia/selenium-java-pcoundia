
mvn versions:use-latest-versions


docker compose up -d

docker compose down



curl -s http://localhost:4444/status | jq


## See sesssions , 

http://localhost:4444/ui/#/sessions
 

`mvn spring-boot:test-run`


`mvn test -Dspring.profiles.active=test`
