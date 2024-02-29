package com.Working_Loigic_Classes;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class introduction_To_Assertion {




public WebDriver driver;


@BeforeMethod
public void Setup() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	
}

@Test(priority=1)
public void enterValidEmailAndPassword() {
	driver.findElement(By.id("input-email")).sendKeys("8888@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Zubair786");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
   AssertJUnit.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
   
}









}