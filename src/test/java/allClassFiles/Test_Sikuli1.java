package allClassFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Test_Sikuli1 {
  @Test
  public void handlefileUpload() throws InterruptedException, FindFailed {
	//TC1-Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\Intelipaat_Jan2019\\All Jar Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//TC2-Navigate to Test URL
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_accept");
		Thread.sleep(5000);
		//Implementing Sikuli
	Screen s=new Screen();
	Thread.sleep(5000);
	//To perform Click Operation click() Method
	s.click("D:\\Intelipaat_Jan2019\\curiostesters\\src\\WebElements_Sikuli\\ChooseFile.PNG");
	Thread.sleep(5000);
	Pattern fileInput=new Pattern("D:\\Intelipaat_Jan2019\\curiostesters\\src\\WebElements_Sikuli\\InputPath.PNG");
	Pattern openButton=new Pattern("D:\\Intelipaat_Jan2019\\curiostesters\\src\\WebElements_Sikuli\\Open.PNG");
	
	//Wait time in sikuli
	s.wait(fileInput);
	//To send Data into Text Box
	s.type(fileInput,"D:\\Intelipaat_Jan2019\\curiostesters\\src\\WebElements_Sikuli\\Demo1.PNG");
	s.click(openButton);
	Thread.sleep(5000);
	s.click("D:\\Intelipaat_Jan2019\\curiostesters\\src\\WebElements_Sikuli\\Submit.PNG");
	Thread.sleep(5000);
	driver.close();
	
		
	  
  }
}
