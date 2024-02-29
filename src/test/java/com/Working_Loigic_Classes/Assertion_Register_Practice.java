package com.Working_Loigic_Classes;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion_Register_Practice {

	
	
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		
		
	}
	
	
	@Test(priority=1)
	public void registerWithoutenteringAnyFields () {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
       AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'alert alert-danger alert-dismissible')]")).isDisplayed());
	}
	
	
	
	
	@AfterMethod
	public void quit () {
		driver.quit();
	}
	
	
	
	
	
	
}
