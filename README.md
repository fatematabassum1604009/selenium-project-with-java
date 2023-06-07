# selenium-project-with-java
This repository contains an example of how to build a selenium project with java on the website [Gadget & Gear](https://gadgetandgear.com/).

## Technologies:
- Selenium WebDriver
- Java
- Maven
---

### Dependencies
* selenium-java
* webdrivermanager 
* testng
* allure-testng
---

## Reports
* To view report of test, access the file: *[/allure-report/index.html](https://fatematabassum1604009.github.io/selenium-project-with-java/allure-report/index.html)*

---
## Installation
### Clone

- Clone this repository to your local machine using the command below:
```
	$ git clone https://github.com/willysalazar/selenium-webdriver-java-example.git
```

---

### Execution

> Access project root

```
	$ cd /diretorio/selenium-webdriver-java-example
```
> Execute the command to run all tests in the project

```
	$ mvn clean test
```
> Execute the command to run only one test class in the project

```
	$ mvn clean test -Dtest=<WelcomeTest>
```

---

