# Hello World for PulpoCon23

# Requirements
## Recommended
 * Have IntelliJ or a Java IDE with refactoring capabilities
 * Have [SDKMan](https://sdkman.io/) installed and available in your CLI
 * Have [Postman](https://www.postman.com/) installed

## Required
 * Java SDK 8

## Setup with SDKMan
Once you've installed SDKMan, and it's available in your command line, go to the project's root folder and execute

    sdk env install

It will automatically install the required version. From now on, each time you visit this folder, it will change the Java SDK to the one specified at `.sdkmanrc`

## First steps
Run the following command to build the application, so we can at least check whether it builds/compiles correctly

    ./gradlew clean build


## Using Docker to simplify MySQL dependency

You can use Docker to improve your development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a mysql database in a docker container, run:

    docker-compose -f src/main/docker/mysql.yml up -d

To stop it and remove the container, run:

    docker-compose -f src/main/docker/mysql.yml down

### MySQL troubleshooting on ARM architecture
Please refer to the [following link](https://betterprogramming.pub/mysql-5-7-does-not-have-an-official-docker-image-on-arm-m1-mac-e55cbe093d4c?gi=523fd75b7f32)

## Preparing database structure
Execute `./gradlew liquibaseUpdate` while having the database running. It will run liquibase and prepare your environment

## Development

Run the following commands in a terminal to create a blissful development experience.

    ./gradlew

(Or you can opt to run this from your IDE, by running the class HelloWorldApp.java)

And visit `http://localhost:8080/api/hello`

## Testing

To launch your application's tests, run:

    ./gradlew test

## Additional resources
If you're not familiar with Java, or come from a non-Spring background, the quick examples in the folder

    src/test/java/com/example/JavaTestExample

can give you a brief overview on how to create a simple test, how to assert and how to verify on a mock.
