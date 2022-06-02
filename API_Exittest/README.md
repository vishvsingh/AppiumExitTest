# API Demo Application Testing with Appium & Cucumber

This test suite test different functionality of API Demos application.


## How to Run Tests

- To run the suite from command line in the project folder.

```bash
  mvn clean test
```
- To run the suite from batch file open the project in system explorer and double click on `TestRunner.bat` file.

## How to Run Tests in Headless Mode

- Step 1- Change `Headless = False` to `Headless = True` in `Base_Class` 





## How to Run Tests in Group

 To run test in group use those tag given below in `TestRunner.java` class
 
- `@App__ActionBar` - To test App functionality
- `@Content_Assets` - To test content functionality
- `@animation_reversing` - To test animation functionality
- `@Graphics_Arc_` - To test graphics functionality
- `@Media_video` - To test media functionality
- `@Tag` - To test all functionality

##	Integrate Test Suite with Jenkins and GitHub for CI/CD
To build this test suite in Jenkins use this github repository 

## `src.main.java` Packages Description
 
- `Base`
 - `Base_Class.java` - Setup driver and Appium server

 
- `screens`

 - `Animation_screen.java` - Animation screen locator and action method
 - `App_Screen.java` - App screen locator and action method
 - `Content_Screen.java` - Content screen locator and action method
 - `Graphics_Screen.java` - Graphics screen locator and action method
 - `Media_Screen.java` - Media screen locator and action method
 
- `Resources`
  -`extent.properties` - Has all the properties related to extent report
  -`log4j2.properties` - Has all the properties related to logging 



### `src.test.java` Packages Description :
- `features` - Has all the feature file 
- `hooks` - Has all the hooks file
- `runner` - Has all the runner file
- `stepdefinition` - Has all the steps file



### Other File Description :

- `pom.xml` - Has all required dependency

### Reports and Logs :
- Extent report gets generated after the run under `\Reports\ExtentReport\report.html`
- Screenshots gets placed under ``\screenshots` folder 
- Logs generate as `Testlogs.log` under `\logs\Testlogs.log` folder
