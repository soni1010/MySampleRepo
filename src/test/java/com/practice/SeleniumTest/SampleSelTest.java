package com.practice.SeleniumTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleSelTest {
	
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void testMethod() throws InterruptedException {

		//sample
		System.setProperty("webdriver.chrome.driver","D:/Sotwares/chromedriver79.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://harendersoni.blogspot.com/");
		System.out.println("1 - "+driver.findElement(By.cssSelector("#header[name='Header']")).getText());
		System.out.println("2 - "+driver.findElement(By.cssSelector(".title")).getText());
		System.out.println("3 - "+driver.findElement(By.cssSelector("#write-the-code-you-want-to-see-as-comments-first")).getText());
//		System.out.println("4 - "+driver.findElement(By.cssSelector(".^g-pr")).getText());
		
		driver.navigate().to("https://gmail.com");
		 
		Thread.sleep(4000);
		String s=driver.findElement(By.cssSelector("#header[name='Header']")).getText();
		softAssert.assertEquals(s, "anything");		
		
	}
	
	@Test
	public void testMethod1() throws InterruptedException {

		System.out.println("here");
	}

	@Test
	public void A() throws InterruptedException {

		System.out.println("here1");

	}
	
	@AfterSuite
	public void endUp() throws InterruptedException {

		driver.quit();

	}
	
}
