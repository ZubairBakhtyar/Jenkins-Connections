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

public class Class_Assaighnment_On_Assertion {

	public WebDriver driver;

	@BeforeMethod
	public void registerAssertion() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@Test(priority = 1)
	public void registerWithNoFirstname() {
		driver.findElement(By.id("input-lastname")).sendKeys("Bakhtyar");
		driver.findElement(By.id("input-email")).sendKeys("Zubairwow@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("3476594450");
		driver.findElement(By.id("input-password")).sendKeys("Zubair786");
		driver.findElement(By.id("input-confirm")).sendKeys("Zubair786");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		AssertJUnit.assertTrue(driver.findElement(By.cssSelector("input#input-firstname+div")).isDisplayed());

	}

	@Test(priority = 1)
	public void registerWithNoLastname() {
		driver.findElement(By.id("input-firstname")).sendKeys("Zubair");
		driver.findElement(By.id("input-email")).sendKeys("Zubairwow@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("3476594450");
		driver.findElement(By.id("input-password")).sendKeys("Zubair786");
		driver.findElement(By.id("input-confirm")).sendKeys("Zubair786");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@AfterMethod
	public void teardown() {
		// driver.quit();
	}

}
