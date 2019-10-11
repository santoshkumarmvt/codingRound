#1. My comments on existing code (all are incorporated)
Make use of consistent pattern
	- One class is using page factory pattern and others are not.
	
Bifurcate classes in separate classes as page object class and test class.

Create one base class and put driver initialization and path setting in that.

Create utility classes and put common methods in them eg: waitFor(), isElementPresent().

Prepare TestNG.xml file to run all tests in one go.

Add validation for HotelSearch also.

Add description in tests to get clear testng report.

Remove classes from default package to avoid not being able create object of these class in other packages.

Create one properties file(config.properties) to keep config related stuffs eg.: appURL etc.

Proper exception handling, not just e.printstacktrace().

Use selenium waits as much as possible.

#2. Below fixes are done
For all tests WebDriver was being initialized with ChromeDriver before setting the path for chromeDriver.

In signInTest
	Need to switch to frame before clicking on signInButton.

FlightSearchTest
	Xpath for Textbox of "To"(destination) was in small case (correct one is in capital case).

#3. Assumption Made
Chrome browser is in scope