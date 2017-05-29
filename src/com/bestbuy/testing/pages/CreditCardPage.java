package com.bestbuy.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bestbuy.testing.Constants.DataConstants;
import com.bestbuy.testing.Constants.ElementsConstants;
import com.bestbuy.testing.singleton.BestBuyDriver;
import com.bestbuy.testing.singleton.PropertyLoader;

public class CreditCardPage {
	public static void loadCreditCardPage() {
		WebDriver driver = BestBuyDriver.getDriver();
		if(driver.findElement(By.className("js-add-credit-cards")).isDisplayed()){
			driver.findElement(By.className("js-add-credit-cards")).click();
		WebElement creditCardNo = driver
				.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.CARD_NUMBER)));
		creditCardNo.click();
		creditCardNo.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.CARD_NUMBER));
		WebElement firstName = driver
				.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.FIRST_NAME)));
		firstName.click();
		firstName.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.FIRST_NAME));
		WebElement lastName = driver
				.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.LAST_NAME)));
		lastName.click();
		lastName.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.LAST_NAME));
		Select month = new Select(driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.EXPIRY_MONTH))));
		month.selectByIndex(4);
		Select year = new Select(driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.EXPIRY_YEAR))));
		year.selectByIndex(7);
		WebElement addressLine1 = driver.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.ADDRESS_LINE_1)));
		addressLine1.click();
		addressLine1.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.ADDRESS_LINE_1));
		WebElement addressLine2 = driver.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.ADDRESS_LINE_2)));
		addressLine2.click();
		addressLine2.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.ADDRESS_LINE_2));
		WebElement city = driver.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.CITY)));
		city.click();
		city.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.CITY));
		Select state = new Select(driver.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.STATE))));
		state.selectByIndex(20);
		WebElement zip = driver.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.ZIP)));
		zip.click();
		zip.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.ZIP));
		WebElement phone = driver.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.PHONE)));
		phone.click();
		phone.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.PHONE));
		WebElement addCard = driver.findElement(By.name(PropertyLoader.getElementsProps().getProperty(ElementsConstants.ADDCARD)));
		addCard.click();
	}
	}
	public static String success(){
		WebDriver driver = BestBuyDriver.getDriver();
		try{
		WebElement message = driver.findElement(By.className("alert-success"));
		message.isDisplayed();
		return message.getText();
		}
		catch(Exception e){
			System.out.println("card is present");
		}
		return null;
	}
}
