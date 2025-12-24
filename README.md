# GreenGrow – QA Automation Framework

## Overview
GreenGrow is a Selenium-based QA Automation framework created to validate core user flows
of a web application. The framework focuses on **functional, smoke, and regression testing**
and follows the **Page Object Model (POM)** design pattern.

This project demonstrates hands-on experience with Selenium automation using
**Java, TestNG, and Maven**, similar to real-world QA automation projects.

---

## Technology Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Eclipse IDE
- Google Chrome

---

## Project Structure
greengrow-qa-automation
│
├── src/test/java
│ ├── base – WebDriver setup and teardown
│ ├── pages – Page Object classes
│ ├── tests – Test cases
│ └── utilities – Reusable helper classes
│
├── pom.xml
├── testng.xml
└── README.md

---

## Automated Test Coverage

### UI Automation
- Application navigation validation
- Login functionality testing
- Page interactions using Page Object Model
- Explicit waits for stable execution

---

## How to Run Tests

### Run from Eclipse
1. Right-click the test class  
2. Select **Run As → TestNG Test**

### Run using Maven
```bash
mvn clean test
