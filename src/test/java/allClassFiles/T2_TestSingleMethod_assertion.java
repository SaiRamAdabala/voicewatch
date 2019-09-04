//All TestCases in Single Method with Assert Class


package allClassFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class T2_TestSingleMethod_assertion {
	
	/*Test Scenario
	 * TC1-Launch Chrome Browser
		TC2-Navigate to Test URL
		TC3-Verification Point
		TC4-Close Browser*/
	@Test
	public void verifyTitle() throws InterruptedException
	{
		//TC1-Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","D:\\Intelipaat_Jan2019\\All Jar Files\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		//TC2-Navigate to Test URL
				driver.get("https://www.google.com");
				Thread.sleep(5000);
		//TC3-Verification Point
				
				String x=driver.getTitle();
			/*	if(x.equals("Google"))
				{
					System.out.println("Test Passed");
				}
				else
				{
					System.out.println("Test Failed");
				}
				*/
				
				
				Assert.assertEquals("Google", x);

				
				
		//TC4-Close Browser	
				driver.close();
						
	}

}
