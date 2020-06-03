package rvinfotech.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import rvinfotech.pagelogin.LoginPortal;

@Listeners(rvinfotech.listener.TestngListen.class)
public class VerifyLoginCases extends LoginPortal {
	

	WebDriver driver = new FirefoxDriver();
	@BeforeTest
	public void loginPortal() {				
		LoginPortal.loginPortalExe(driver);
	}


	@Test(priority = 0, description = "Verfiy with invalid User name and Password")
	public void invalidUsernameAndPassword() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admi");
		driver.findElement(By.id("txtPassword")).sendKeys("Admi");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//span[@id='spanMessage']")).isDisplayed();
		System.out.println("invalidUsernameAndPassword COMPLETE");
	}

	@Test(priority = 1, description = "Verify with Valid credentils")
	public void validUsernameAndPassword() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//span[@id='spanMessage']"));
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
		System.out.println("invalidUsernameAndPassword COMPLETE");
		
	}

	@AfterTest
	public void closePortal() {
		driver.close();
		driver = null;
	}
}