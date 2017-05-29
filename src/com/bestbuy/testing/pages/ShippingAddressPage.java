package com.bestbuy.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bestbuy.testing.Constants.DataConstants;
import com.bestbuy.testing.Constants.ElementsConstants;
import com.bestbuy.testing.singleton.BestBuyDriver;
import com.bestbuy.testing.singleton.PropertyLoader;

public class ShippingAddressPage {
	public static void loadAddressPage(){
		WebDriver driver = BestBuyDriver.getDriver();
		//WebElement shippingAddress = driver.findElement(By.linkText("Add a Shipping Address"));
		try{
		if(driver.findElement(By.className("shipping-address-widget__button")).isDisplayed()){
			driver.findElement(By.className("shipping-address-widget__button")).click();
		WebElement shippingFirstName = driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.SHIPPING_FIRST_NAME)));
		shippingFirstName.click();
		shippingFirstName.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.FIRST_NAME));
		WebElement shippingLastName = driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.SHIPPING_LAST_NAME)));
		shippingLastName.click();
		shippingLastName.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.LAST_NAME));
		WebElement shippingAddress = driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.SHIPPING_ADDRESS_LINE)));
		shippingAddress.click();
		shippingAddress.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.ADDRESS_LINE_1));
		WebElement shippingAddress2 = driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.ADDRESS_LINE_2)));
		shippingAddress2.click();
		shippingAddress2.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.ADDRESS_LINE_2));
		WebElement shippingCity = driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.SHIPPING_CITY)));
		shippingCity.click();
		shippingCity.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.CITY));
		Select shippingState = new Select(driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.SHIPPING_STATE))));
		shippingState.selectByIndex(29);
		WebElement shippingZip = driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.SHIPPING_ZIP)));
		shippingZip.click();
		shippingZip.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.ZIP));
		WebElement shippingPhoneNo = driver.findElement(By.id(PropertyLoader.getElementsProps().getProperty(ElementsConstants.PHONE)));
		shippingPhoneNo.click();
		shippingPhoneNo.sendKeys(PropertyLoader.getDataProps().getProperty(DataConstants.PHONE));
		WebElement save = driver.findElement(By.className(PropertyLoader.getElementsProps().getProperty(ElementsConstants.SAVE)));
		save.click();
		//WebElement keepAddress = driver.findElement(By.className(PropertyLoader.getElementsProps().getProperty(ElementsConstants.KEEP_ADDRESS)));
		//keepAddress.click();
	}
		
	}catch(Exception exp){
		System.out.println("Shipping address already exist");
	}
	}
//}
	/*public static String success(){
		WebDriver driver = BestBuyDriver.getDriver();
		try{
		//WebElement message = driver.findElement(By.className("alert-success"));
		driver.findElement(By.className("alert-success")).isDisplayed();
		return driver.findElement(By.className("alert-success")).getText();
		}
		catch(Exception e){
			System.out.println("address is present");
		}
		return null;
	}*/
}
	/*public static void removeShippingAddress(){
		WebDriver driver = BestBuyDriver.getDriver();
		AccountHomePage.accountHome();
		WebElement manageAddress = driver.findElement(By.className("js-edit-shipping-address"));
		manageAddress.click();
		WebElement remove = driver.findElement(By.className("remove"));
		remove.click();
		WebElement yesRemove = driver.findElement(By.className("btn-primary"));
		yesRemove.click();
	}*/
