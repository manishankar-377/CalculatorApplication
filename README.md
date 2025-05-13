# CalculatorApplication

### This microservice does addition, substraction, multiplicaiton and division.

It has two endpoints **/calculate/get** and **/calculate/post**

## /calculate/get

It takes params num1, num2 and operator "http://localhost:8080/calculate/get?num1=20&num2=5&operator=/"

## /calculate/post

It takes {  "num1": 10,  "num2": 5,  "operator": "/"} in this format

## Health check

#TODO in future this service get health check and in future UI will be added to this