# Java Page Object Model Example

## Overview
The following repo contains a barebone example for Selenium/Java test automation framework.

## Guidelines
Run the example tests by:

1. Clone this repository

2. Load the release directory in IntelliJ

3. Run the /src/com/tests/tests_pages.java file

## Structure and content
```
.
└── src
    ├── demo                # demo classes
    └── com                 # Component files
        ├── custom          # Custom libraries
        ├── pages           # Pages descriptions
        └── tests           # Tests files
```
     

## Web driver setup
Selected web driver by default is Chrome and it can be changed:

```java
@BeforeTest
public void loadTheHomePage() throws InterruptedException {
        pageHome = new page_home();
        pageElements = new page_elements();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        }
```


## Practical task

### Task 1

#### Description
The main task is to build similar framework, but for another web app with different structure and business logic i.e. you will have to:

1. Explore the web app and make notes for its properties
2. Think about the business logic, note what is important to test
3. Prepare a list of test cases to be automated
4. Build a framework to run the web tests
5. Upload the solution in Git
6. ~~Configure* the framework to be run from CI/CD tool i.e. Jenkins~~
7. ~~Provide a report - tests descriptions, run results, etc.~~

```
Mind that in order to configure a framework to be ran from CI/CD, it has to be uploaded in a Git repo.
Also you will have to install a local Jenkins instance, and then to configure it to run the repo.
```

#### Details
- Level of difficulty: low
- Login data provided i.e. no need of registration and login tests
- Web app to be automated: https://robotsparebinindustries.com/

### Task 2

In progress...

## Note
Please note that this is a demo project which is not yet complete <br> i.e. there are broken things in it!
