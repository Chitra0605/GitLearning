 # Project GitLearning
## Description
This project is to learn about how to create our own Maven Project in IntelliJ, clone the project to Github, create BDD Framework in a Maven Project.

## Table of Contents
1. ***Getting Started with GitHub***
2. ***Getting Started with IntelliJ***
3. ***Add Dependencies***
4. ***BDD Framework***
5. ***Create Cucumber JUnit TestRunner class***
6. ***Create "ContantUtils" class to add all constants***
7. ***Create Webconnector class to initialise the WebDriver***
8. ***Create CucumberHooks class***
9. ***Create manual BDD scenarios for Login feature for "standard_user" username***
10. ***Automate the BDD scenarios for the Login page for "standard_user" username***

  ## 1. Getting Started with GitHub:
  1. Create a Github account  [ https://github.com/join.]
  2. Install Git in your local PC [https://www.youtube.com/watch?v=uUzRMOCBorg]
  3. Create a repository in the Github
  4. Clone the repository to your PC

 <img width="952" alt="Create Repository" src="https://github.com/Chitra0605/GitLearning/assets/137562175/5883e274-9b66-4008-b9a1-2316aa699226">

     
<img width="675" alt="Clone Repository" src="https://github.com/Chitra0605/GitLearning/assets/137562175/58bd68d3-558b-4308-86ca-778a1fd0e8fe">


  ## 2. Getting Started with IntelliJ:
  
  * Create a Maven project in IntelliJ and save it to the cloned Git repository
  * Push the code to GitHub

## 3. Add Dependencies in pom.xml file in your project [https://mvnrepository.com/ ]

* Selenium
* Cucumber
* Cucumber JUnit
  
  <img width="606" alt="pom xml" src="https://github.com/Chitra0605/GitLearning/assets/137562175/b0892006-f26d-45b3-9f02-f5b90b4eb0db">

## 4. BDD Framework
Create the below java packages in IntelliJ Project under src/test/java

1. browserControl
2. features
3. pageObjects
4. stepDefinitions
5. utilities
<img width="147" alt="BDD2" src="https://github.com/Chitra0605/GitLearning/assets/137562175/65160445-1d14-4b81-b328-b7e361785bb5">

## 5. Create Cucumber JUnit TestRunner class to run the BDD tests
[https://cucumber.io/docs/cucumber/api/?lang=java#running-cucumber]
<img width="971" alt="TestRunnerclass" src="https://github.com/Chitra0605/GitLearning/assets/137562175/bfa45c1e-a673-4ef2-ab70-4ae251670dc7">

## 6. Create "ContantUtils" class to add all constants
Create a class called “ConstantUtils” in the ‘utilities’ package to add all the constants.

<img width="962" alt="Constantutils" src="https://github.com/Chitra0605/GitLearning/assets/137562175/a3cf5e6e-d97c-4cbb-983b-2a2be96f124a">

## 7. Create Webconnector class to initialise the WebDriver
1. Create Webconnector class in browserControl package.
2. Create a method to open browser the given browser
3. Create a method to close/quit the browser

<img width="799" alt="WebConnector" src="https://github.com/Chitra0605/GitLearning/assets/137562175/ea9126c2-3486-401e-9fcd-d80a2411094a">

## 8. Create CucumberHooks class
1. Create “CucucumberHooks” class in browserControl package.
2. Create a class called “CucucumberHooks” that contains @Before and @After annotations.
3. Create setup method with @Before annotation that open the browser
4. Create teardown method with @After annotation that closes the browser
<img width="914" alt="CucumberHooks" src="https://github.com/Chitra0605/GitLearning/assets/137562175/4a2475df-22e3-4960-a64f-dff291bd084b">

## 9. Create manual BDD scenarios for Login feature for "standard_user" username
Create manual BDD scenarios (Positive and Negative) for the "standard_user"  user on the following login page.
[https://www.saucedemo.com/]

**Scenario 1**: Verify swag Labs with **valid credentials**

**GIVEN** the user navigate to [https://www.saucedemo.com/]

**WHEN** the user enter valid username (standard_user) & valid password(secret_sauce)

**AND** the user click on login button

**THEN** the user should see the **Products page**

<img width="944" alt="product page" src="https://github.com/Chitra0605/GitLearning/assets/137562175/27b58b58-024d-4d22-99ef-b7443470da44">


**Scenario 2** : Verify swag Labs with **in-valid credentials**

**GIVEN** the user navigate to [https://www.saucedemo.com/]

**WHEN** the user enter valid username (standard_user) & invalid password(secret-sauce)

**AND** the user click on login button

**THEN** the user should see the following message **"Epic sadface: Username and password do not match any user in this service"**

![image](https://github.com/Chitra0605/GitLearning/assets/137562175/d5900beb-fdd7-4ea2-b1f8-66532e465d0d)


**Scenario 3**: Verify swag Labs with **in-valid credentials**

**GIVEN** the user navigate to [https://www.saucedemo.com/] 

**WHEN** the user enter valid username (standard_user) & No password

**AND** the user click on login button

**THEN** the user should see the following message **"Epic sadface: Password is required"**

![image](https://github.com/Chitra0605/GitLearning/assets/137562175/e6f40bfe-a9cd-4d90-b5a5-2bf4a60086c8)


**Scenario 4**: Verify swag Labs with **in-valid credentials**

**GIVEN** the user navigate to [https://www.saucedemo.com/]

**WHEN** the user enter no username & Valid password(secret_sauce)

**AND** the user click on login button

**THEN** the user should see the following message **"Epic sadface: Username is required"**

![image](https://github.com/Chitra0605/GitLearning/assets/137562175/456739f4-41bc-4d7b-979b-2b3d5eaabf86)

## 10. Automate the BDD scenarios for the Login page for "standard_user" username
Automate all the manual BDD scenarios you have previously written for the “standard_user” user on the following login page [https://www.saucedemo.com/]
**1. Add the BDD scenarios into a feature file**
   
<img width="752" alt="1" src="https://github.com/Chitra0605/GitLearning/assets/137562175/d11d86ab-9a63-404a-affa-1ba0a97e6873">

   
**2. Create Stepdefitions class**

<img width="770" alt="2" src="https://github.com/Chitra0605/GitLearning/assets/137562175/019a1192-141e-4d33-9466-23d717bcf0c2">

   
**3. Create PageObject class if required**
   
<img width="752" alt="3" src="https://github.com/Chitra0605/GitLearning/assets/137562175/7d023cf9-563d-4164-9352-b9b7448d3f40">
