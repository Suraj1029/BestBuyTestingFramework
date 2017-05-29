package com.bestbuy.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bestbuy.testing.singleton.BestBuyDriver;

public class AccountHomePage {
	public static void accountHome() throws Exception{
		WebDriver driver = BestBuyDriver.getDriver();
		WebElement account = driver.findElement(By.linkText("Account Home"));
		account.click();
	}
	public static String verifyAccount(){
		WebDriver driver = BestBuyDriver.getDriver();
		WebElement memberId = driver.findElement(By.className("welcome-widget__memberid"));
		String welcomeGreeting = memberId.getText();
		return welcomeGreeting;
	}
	public static String verifyRewards(){
		WebDriver driver = BestBuyDriver.getDriver();
		WebElement memberRewards = driver.findElement(By.className("rewards-widget__number"));
		String rewards = memberRewards.getText();
		return rewards;
	}
}
