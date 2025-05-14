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

Added CI to check the build of the project
#TODO will add CI to even check the test cases