package com.bestbuy.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bestbuy.testing.singleton.BestBuyDriver;

public class SignOnPage {
	public static String loadSignInPage(){
		WebDriver driver = BestBuyDriver.getDriver();
		WebElement account = driver.findElement(By.className("user"));
		account.click();
		WebElement signIn = driver.findElement(By.className("action-btn"));
		signIn.click();
		return driver.getTitle();
	}
	public static String signIn(){
		WebDriver driver = BestBuyDriver.getDriver();
		//String title = SignOnPage.loadSignInPage();
		//assertEquals(title,PropertyLoader.getDataProps().getProperty(DataConstants.SIGN_IN_TITLE));
			
		
		WebElement email = driver.findElement(By.id("fld-e"));
		//email.click();
		email.sendKeys("surajshines29@gmail.com");
		WebElement pass = driver.findElement(By.id("fld-p1"));
		//pass.click();
		pass.sendKeys("Test123test123");
		WebElement pageSignIn = driver.findElement(By.className("js-submit-button"));
		pageSignIn.click();
		return driver.getTitle();
		}
	/*public static void creditCardPage(){
		WebDriver driver = BestBuyDriver.getDriver();
		WebElement creditCard = driver.findElement(By.linkText("Credit Cards"));
		creditCard.click();
		
	}*/
	public static String verifySignInPage(){
		WebDriver driver = BestBuyDriver.getDriver();
		WebElement profileName = driver.findElement(By.id("profileMenuWrap1"));
		String name = profileName.getText();
		profileName.click();
		return name;
	}
	
	public static void signOut(){
		WebDriver driver = BestBuyDriver.getDriver();
		//SignOnPage.verifySignInPage();
		WebElement profileName = driver.findElement(By.className("user"));
		profileName.click();
		WebElement signOut = driver.findElement(By.id("logout-button"));
		signOut.click();
	}

}
