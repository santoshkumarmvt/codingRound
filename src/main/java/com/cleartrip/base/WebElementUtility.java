package com.cleartrip.base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class WebElementUtility {
	
	/*
	 * WebElement related utility methods could come here
	 */
	
	private WebElementUtility(){}

    /**
     *
     * @param durationInMilliSeconds
     */
	public static void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
        	throw new GenericException(e);
        }
    }

    /**
     *
     * @param driver
     * @param by
     * @return
     */
    public static boolean isElementPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
