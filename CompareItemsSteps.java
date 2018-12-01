package com.FlipkartAutomation.Sample;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.FlipkartAutomation.Libs.Base;
import com.FlipkartAutomation.pageObject.CartItemPage;
import com.FlipkartAutomation.pageObject.CompareItemsPage;
import com.FlipkartAutomation.pageObject.HomepageDisplayed;

public class CompareItemsSteps extends Base {

	
		CompareItemsPage cip;
		HomepageDisplayed hmpage;
		WebDriverWait wait;
		@Parameters({"browserName"})
		@BeforeClass
		public void initialize(final String browserName) throws Throwable{
			driver=initializeDriver(browserName);
			driver.get("https://www.flipkart.com/");
			this.hmpage=new HomepageDisplayed(driver);
			this.cip= new CompareItemsPage(driver);
			this.wait=new WebDriverWait(driver, 40);
			
		}
		
		
		@Test
		public void verfiyCartItem() throws InterruptedException{
			this.hmpage.loginInFlipkart();
			this.cip.compareItems();
			
			
		}
		
		
		
		@AfterClass
		public void tearDown(){
			driver.close();
			driver.quit();
		}
		
		
		
		
	}


