package allClassFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Test_VWw {
public WebDriver driver;

@Test(priority=1)
	public void launchvoicewatch() throws InterruptedException {
	//Launch Chrome  Browser
	
		
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
 driver=new ChromeDriver();

//Goto test url http://www.google.com
 driver.get("https://services.empirix.com/");
//Wait Time
Thread.sleep(12000);
 driver.manage().window().maximize();
 
 
 //Wait Time
 Thread.sleep(30000);
}
@Test(priority=2)
public void login_VoiceWatch() throws InterruptedException
{
//Conditional Wait as Explicit
/*	WebDriverWait w=new WebDriverWait(driver,100);
	w.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//input[@name='callback_0']/following::*[11]"), "Forgot Password?"));*/

 driver.findElement(By.xpath("//input[@name='callback_0']")).sendKeys("empirix_QAselenium");

//Wait Time
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='callback_1']")).sendKeys("Password!23");
//Wait Time
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@name='callback_2']")).click();
//Wait Time
Thread.sleep(40000);
}

@Test(priority=3)
public void verifyDashboardPage() throws InterruptedException
{

//Click on Dashboard
driver.findElement(By.xpath("//*[@id='wrapper']/header/section[2]/div/ul/li[1]/a")).click();
Thread.sleep(5000);
//Scroll from Top to Bottom
JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
Thread.sleep(5000);
WebElement dashboard=driver.findElement(By.xpath("//h1[contains(text(),'Overall Performance')]"));
String actualvp1=dashboard.getText();
System.out.println(actualvp1);
 
 //Verification Point1 for Dashboard Page
	if(actualvp1.contains("Overall Performance"))
	{
		System.out.println("Login Success,Currently in Dashboard Page-Test Passed");
	}
	else
	{
		System.out.println("Login Failed,Currently not in Dashboard Page-Test Failed");
	}
	Thread.sleep(10000);
}
	
@Test(priority=4)
public void verifyTestsPage() throws InterruptedException
{
//Click on Tests	
	driver.findElement(By.xpath("//*[@id='wrapper']/header/section[2]/div/ul/li[5]/a")).click();
//Wait Time
	 Thread.sleep(25000);
	  
	
	//Conditional Wait as Explicit
	//w.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='Please select a test']"), "Please select a test"));
	
	WebElement tests= driver.findElement(By.xpath("//span[text()='Please select a test']"));
	String actualvp2=tests.getText();
	System.out.println(actualvp2);
	
	
	//Verification Point2 for Tests Page
		if(actualvp2.contains("Please select a test"))
		{
			System.out.println("Currently in Tests Page-Test Passed");
		}
		else
		{
			System.out.println("Currently not in Tests Page-Test Failed");
		}
		Thread.sleep(10000);
}

@Test(priority=5)
public void verifyScriptssPage() throws InterruptedException
{
		
//Click on Scripts		
		driver.findElement(By.xpath("//a[contains(text(),'Scripts')]")).click();
//Wait Time
Thread.sleep(25000);

		//Conditional Wait as Explicit
		//w.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[contains(text(),'Please select a script or')]"), "Please select a script or"));
		
		
		WebElement scripts= driver.findElement(By.xpath("//span[contains(text(),'Please select a script or')]"));
				
		
		String actualvp3=scripts.getText();
		System.out.println(actualvp3);
		
		
		//Verification Point3 for Scripts Page
			if(actualvp3.contains("Please select a script"))
			{
				System.out.println("Currently in Scripts Page-Test Passed");
			}
			else
			{
				System.out.println("Currently not in Scripts Page-Test Failed");
			}
			Thread.sleep(10000);
}		
			
@Test(priority=6)
public void logout_VoiceWatch() throws InterruptedException
{		
		//Logout 
			driver.findElement(By.xpath("//span[@class='caret']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
			 //Wait Time
			 Thread.sleep(20000);
			 
			
			
			//Conditional Wait as Explicit
			//w.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//strong[contains(text(),'Sign in to continue')]"), "Sign in to continue"));
			
			
			//Verification Point4 for Logout conformation
			WebElement logout= driver.findElement(By.xpath("//strong[contains(text(),'Sign in to continue')]"));
			
			
			String actualvp4=logout.getText();
			System.out.println(actualvp4);
			if(actualvp4.contains("Sign in to continue"))
			{
				System.out.println("Logout Success-Test Passed");
			}
			else
			{
				System.out.println("Logout Failed-Test Failed");
			}
			Thread.sleep(10000);
 //Close Browser
 
 driver.close();

	}

}
