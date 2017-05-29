package com.bestbuy.testing.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BestBuyDriver {
	private static WebDriver driver;
	private BestBuyDriver(){
		
	}
	public static WebDriver getDriver(){
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
			driver.manage().timeouts().pageLoadTimeout(12,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		}
		return driver;
	}

}
