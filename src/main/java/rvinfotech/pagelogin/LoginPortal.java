package rvinfotech.pagelogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

@Listeners(rvinfotech.listener.TestngListen.class)
public class LoginPortal {
	 // Driver will initial from argument
	//System.setProperty("webdriver.chrome.driver","/self_automation_project/chromedriver"); 
	
	public static void loginPortalExe() {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","/self_automation_project/chromedriver"); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actual = driver.getTitle();
		String expected = "OrangeHRM";
		if (actual.contentEquals(expected)) {
			System.out.println(actual + " = " + expected);

		} else {
			System.out.println(actual + " != " + expected);
		}
	}
}

