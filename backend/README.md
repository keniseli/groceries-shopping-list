# Development
* Starting the database: `docker run -e MYSQL_DATABASE=groceries-db -e MYSQL_USER=groceries-db-user -e MYSQL_PASSWORD=groceries-db-password -e MYSQL_RANDOM_ROOT_PASSWORD=true -p 3306:3306 -d mysql:5.7`
* Starting the application: `./gradlew bootRun`

# Deployment
