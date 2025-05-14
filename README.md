# CalculatorApplication

## Description
This is a simple calculator application built using Spring Boot. It provides a RESTful API for performing basic arithmetic operations such as addition, subtraction, multiplication, and division.

### This microservice does addition, substraction, multiplicaiton and division.

It has two endpoints **/calculate/get** and **/calculate/post**

## /calculate/get

It takes params num1, num2 and operator "http://localhost:8080/calculate/get?num1=20&num2=5&operator=/"

## /calculate/post

It takes {  "num1": 10,  "num2": 5,  "operator": "/"} in this format and made sure Content-Type is application/json.

## Health check

"http://localhost:8080/system/health" and "http://localhost:8080/system/version" has been added for health check and version check respectively.

## Github Actions

Added CI to check the build of the project and run the test cases. The workflow is defined in the .github/workflows/ci.yml file. It will run on every push and pull request to the main branch.


##TODO
- Add more operations like square root, power, etc.
- Add more test cases
- Add logging
- Add exception handling
- Add Swagger documentation
- Add Dockerfile
- Add Kubernetes deployment
- Add Prometheus and Grafana for monitoring
- Add Redis for caching
- Add RabbitMQ for messaging
- Add Spring Security for authentication and authorization
- Add Spring Cloud for microservices architecture
- Add Spring Boot Admin for monitoring
- Add Spring Actuator for production-ready features
- Add Spring Data JPA for database access
- Add Spring Batch for batch processing
- Add Spring Integration for messaging
- Add Spring WebFlux for reactive programming
- Add Spring Cloud Config for externalized configuration
- Add Spring Cloud Gateway for API gateway
- Add integration tests
- Add unit tests
- Add performance tests
- Add functional tests