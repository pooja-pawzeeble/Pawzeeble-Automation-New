package pooja.cucumber.demo.utils;

import java.io.*;
import java.util.Properties;


public class ConfigReader {    
	 /** 
     * @param propName : Property name to retrieve value from environment.properties located in Config folder
     * @return String : Value of property in environment.properties located in Config folder
     */
    public static String getProperty(String propName) {
    	Properties properties = new Properties();
        try {        	  
        	InputStream input = new FileInputStream(
                    System.getProperty("user.dir") + File.separator + "Config" + File.separator + "environment.properties");
            properties.load(input);
            return properties.getProperty(propName);            
        } catch (Exception ex) {
            ex.printStackTrace();
            return "File/property not found";
        }        
    }

    /**
     * @param fileName : File name to located in Config folder
     * @param propName : Property name to retrieve value from fileName
     * @return String : Value of property in config.properties
     */
    public static String getProperty(String fileName, String propName) {    	
    	try {          
    		Properties properties = new Properties();
            InputStream input = new FileInputStream(
                    System.getProperty("user.dir") + File.separator + "Config" + File.separator + fileName);
            properties.load(input);
            return properties.getProperty(propName);
        } catch (Exception ex) {
            ex.printStackTrace();
            return "File/property not found";
        }
        
    }
}
