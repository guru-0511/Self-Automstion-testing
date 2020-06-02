package rvinfotech.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import rvinfotech.pagelogin.LoginPortal;

public class VerifyForgetPasswordPage extends LoginPortal {
	ChromeDriver driver = new ChromeDriver();

	@BeforeTest
	public void loginPortal() {
		LoginPortal.loginPortalExe(driver);
	}

	@Test(priority = 1, description = "Verify the ForgetPassword")
	public void verifyForgetPasswordfuctionlity() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='forgotPasswordLink']//a")).click();
		driver.findElement(By.id("divLogo")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='securityAuthentication_userName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
		driver.findElement(By.xpath("//input[@id='btnCancel']"));
	}
	@Test(priority = 2, description = "Verify the page back to Login page")
	public void verifyBackLoginPage() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterTest
	public void closePortal() {
		driver.close();
		driver = null;
	}

}
