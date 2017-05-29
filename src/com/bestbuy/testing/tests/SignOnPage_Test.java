package com.bestbuy.testing.tests;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.bestbuy.testing.Constants.DataConstants;
import com.bestbuy.testing.pages.AccountHomePage;
import com.bestbuy.testing.pages.CreditCardPage;
import com.bestbuy.testing.pages.HomePage;
import com.bestbuy.testing.pages.ShippingAddressPage;
import com.bestbuy.testing.pages.SignOnPage;
import com.bestbuy.testing.singleton.PropertyLoader;

public class SignOnPage_Test {
  @Test
  public void test_sigInPage() throws Exception{
	  String title = HomePage.loadHomePage();
	  assertEquals(title,PropertyLoader.getDataProps().getProperty(DataConstants.HOME_PAGE_TITLE));
	  //Thread.sleep(10000);
	  HomePage.closePopUp();
	  title = SignOnPage.loadSignInPage();
	  assertEquals(title,PropertyLoader.getDataProps().getProperty(DataConstants.SIGN_IN_TITLE));
	  SignOnPage.signIn();
	  String title1 = SignOnPage.verifySignInPage();
	  //assertEquals(title1,PropertyLoader.getDataProps().getProperty(DataConstants.PROFILE_NAME));
	  test_accountHome();
	  test_creditCardPage();
	  test_shippingAddressPage();
  }
  //@Test
  public void test_accountHome() throws Exception{
	  AccountHomePage.accountHome();
	  String title = AccountHomePage.verifyAccount();
	  assertEquals(title,PropertyLoader.getDataProps().getProperty(DataConstants.MEMBER_ID));
	  assertEquals(AccountHomePage.verifyRewards(),PropertyLoader.getDataProps().getProperty(DataConstants.MEMBER_REWARDS));
	  
  }
  //@Test
  public void test_creditCardPage() throws Exception{
	  CreditCardPage.loadCreditCardPage();
	  try{
	  String creditcardsuccess = CreditCardPage.success();
	  if(creditcardsuccess!=null){
		  assertEquals(creditcardsuccess, "Your new card has been succesfully added.");
	  }
	  }
	  catch(Exception e){
		System.out.println("card already present");  
	  }
	  AccountHomePage.accountHome();
  }
  public void test_shippingAddressPage() throws InterruptedException{
	  ShippingAddressPage.loadAddressPage();
	  //ShippingAddressPage.removeShippingAddress();
	  Thread.sleep(3000);
	  SignOnPage.signOut();
	  
  }
}
