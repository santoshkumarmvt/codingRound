package com.cleartrip.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
	
	/*
	 * This class is for frequently used utility methods
	 * e.g. 
	 * property file reading
	 * Random password of different types
	 * Date Utility
	 * etc.
	 */
	
	public static String getProperty(String fileName, String key) {
		try {
			FileInputStream file = new FileInputStream(new File(fileName));
			Properties pr = new Properties();
			pr.load(file);
			return pr.getProperty(key);
			
		} catch (FileNotFoundException e) {
			throw new GenericException(fileName + " file is not found", e);
		} catch (IOException e) {
			throw new GenericException("Issue with loading file", e);
		}
	}

}
