package com.keyworddrivern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionKeywords {
	public static WebDriver driver;
	@Test(priority=0)
	public static void openBrowser()
	{
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test(priority=1)
	public static void navigate()
	{
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Navigate to URL
		driver.get("http://www.gmail.com");
	}
	@Test(priority=2)
	public static void inputUserName()
	{
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("seleniumjava18@gmail.com");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test(priority=3)
	public static void clickNext() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(8000);
	}
	@Test(priority=4)
	public static void inputPassword() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("selenium123");
		Thread.sleep(5000);
	}
	@Test(priority=5)
	public static void clickSigin() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(8000);
	}
	@Test(priority=6)
	public static void closeBrowser()
	{
		driver.close();
		
	}
	
	
	
	
	
}
