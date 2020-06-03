package rvinfotech.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import rvinfotech.pagelogin.LoginPortal;

public class VerifyForgetPasswordPage extends LoginPortal {

	WebDriver driver = new FirefoxDriver();
	@BeforeTest
	public void loginPortal() {
//		System.setProperty("webdriver.firefox.driver", "/Users/gumuruga/test_suites/self_automation_project/geckodriver");
//		driver = new FirefoxDriver();
		LoginPortal.loginPortalExe(driver);
	}
	@Test(priority = 1, description = "Verify the ForgetPassword")
	public void verifyForgetPasswordfuctionlity() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//div[@id='forgotPasswordLink']//a")).click();
		driver.findElement(By.id("divLogo")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='securityAuthentication_userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
		driver.findElement(By.xpath("//input[@id='btnCancel']"));
		System.out.println("verifyForgetPasswordfuctionlity COMPLETE");
	}
	@Test(priority = 2, description = "Verify the page back to Login page")
	public void verifyBackLoginPage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		System.out.println("verifyBackLoginPage COMPLETE");
	}
	@AfterSuite
	public void closePortal() {
		driver.close();
		driver = null;
	}

}
