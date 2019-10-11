package com.cleartrip.base;

import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    /*
    This class is for Common set up
     */

    public WebDriver driver;

    @BeforeMethod
    protected void getApplicationOnBrowser() {
        setDriverPath();
        initializeBrowser();
        driver.get(Utilities.getProperty("config.properties", "appURL"));
        WebElementUtility.waitFor(2000);
    }

    private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }

    private void initializeBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
