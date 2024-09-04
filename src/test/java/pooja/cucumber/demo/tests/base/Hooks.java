package pooja.cucumber.demo.tests.base;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import pooja.cucumber.demo.utils.ConfigReader;
import pooja.cucumber.demo.utils.Log;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {	
	@Before("@e2e")	
	public void setup() {		
        Configuration.timeout = Long.parseLong(ConfigReader.getProperty("browser.timeout"));
        //ChromeOptions ops = new ChromeOptions();
       // ops.addArguments("--remote-allow-origins=*");
        
        Configuration.browser = ConfigReader.getProperty("browser.name");          
        System.out.println("in hooks");
    }
	
	@After("@e2e")
    public void teardown(Scenario scenario) {		
		//Take screenshot if scenario failed
		if(scenario.isFailed()){	
	        Allure.addAttachment(scenario.getName(), 
	        		new ByteArrayInputStream(((TakesScreenshot) 
	        				getWebDriver()).getScreenshotAs(OutputType.BYTES)));
	    }		
        clearCache();
        clearCookies();
        clearLocalStorage();          
        closeWebDriver();
    }

    public void clearCache() {
        Log.info("clearCache");
        clearBrowserCache();
    }

    public void clearCookies() {
        Log.info("clearCookies");
        clearBrowserCookies();
    }

    public void clearLocalStorage() {
        Log.info("clearLocalStorage");
        clearBrowserLocalStorage();
    }
    

}
