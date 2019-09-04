package com.HybridDrivern;

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
	public static void navigate(String url)
	{
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Navigate to URL
		driver.get(url);
	}
	@Test(priority=2)
	public static void inputUserName(String username)
	{
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(username);
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
	public static void inputPassword(String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
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
