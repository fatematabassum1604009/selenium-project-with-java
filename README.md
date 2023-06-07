# selenium-project-with-java
This repository contains an example of how to build a selenium project using POM(Page Object Model) with java on the website [Gadget & Gear](https://gadgetandgear.com/).

## Technologies:
- Selenium WebDriver
- Java
- Maven
---

### Dependencies
* *[selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)*
* *[webdrivermanager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)* 
* *[testng](https://mvnrepository.com/artifact/org.testng/testng)*
* *[allure-testng](https://mvnrepository.com/artifact/io.qameta.allure/allure-testng)* 
---

## Reports
* To view report of test, access the file: *[/allure-report/index.html](https://fatematabassum1604009.github.io/selenium-project-with-java/allure-report/index.html)*

---
## Installation
### Clone

- Clone this repository to your local machine using the command below:
```
	$ git clone https://github.com/fatematabassum1604009/selenium-project-with-java.git
```

---

### Execution


> Execute the command to run all tests in the project

```
	$ mvn test
```
> Execute the command to run only one test class in the project

```
	$ mvn test -DtestFileName=LoginPageTest.java>
```

---

