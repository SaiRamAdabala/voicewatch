package allClassFiles;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;

public class Test_Sikuli2 {
  @Test
  public void handlefileUpload() throws InterruptedException, FindFailed, IOException {
	//TC1-Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\Intelipaat_Jan2019\\All Jar Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//TC2-Navigate to Test URL
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		//Implementing sikuli
		Screen s=new Screen();
		Thread.sleep(5000);
		//In SWD we have sendkeys() to send data into TextBox
		//driver.findElement(By.xpath("q")).sendKeys("SoftwareTestingTrainerSaiPrasanthAdabala");
//In sikuli to send data into textbox we using type()		
		s.type("D:\\Intelipaat_Jan2019\\curiostesters\\src\\WebElements_Sikuli\\sendData.PNG","SaiPrasanth Adabala");
		Thread.sleep(5000);
//To take Screenshot of FullScrene	
		ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		File f1=new File("D:\\Intelipaat_Jan2019\\curiostesters\\src\\WebElements_Sikuli\\fullscreen1.PNG");
		ImageIO.write(bi, "PNG", f1);
		Thread.sleep(5000);
		//To take Screenshot of Region
		
		Region r=new Region(100,200,100,100);
		ScreenImage sri=s.capture(r);
		BufferedImage bri=sri.getImage();
		File f2=new File("D:\\Intelipaat_Jan2019\\curiostesters\\src\\WebElements_Sikuli\\ScreenRegion1.PNG");
		ImageIO.write(bri, "PNG", f2);
		Thread.sleep(5000);
		driver.close();
		
		
		
	
		
	  
  }
}
