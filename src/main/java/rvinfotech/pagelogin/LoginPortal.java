package rvinfotech.pagelogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;

@Listeners(rvinfotech.listener.TestngListen.class)
public class LoginPortal {

	public static void loginPortalExe(WebDriver driver) {
		System.setProperty("webdriver.Firefox.driver",
				"/Users/gumuruga/test_suites/self_automation_project/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actual = driver.getTitle();
		String expected = "OrangeHRM";
		if (actual.contentEquals(expected)) {
			System.out.println(actual + " = " + expected);

		} else {
			System.out.println(actual + " != " + expected);
		}
		driver.close();
		driver = null;
	}

}
