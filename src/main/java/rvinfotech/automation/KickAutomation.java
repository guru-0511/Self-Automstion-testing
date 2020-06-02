package rvinfotech.automation;

import java.util.LinkedList;
import java.util.List;
import org.testng.TestNG;


public class KickAutomation {
	public static String TEST_NG_SUIT_FILE_XML = null;
		
	public static void main(String[] args) {
		TEST_NG_SUIT_FILE_XML = args[0];
		TestNG testng = new TestNG();
		List<String> suites = new LinkedList<String>();
		suites.add(TEST_NG_SUIT_FILE_XML);
		testng.setTestSuites(suites);
		testng.run();
		System.exit(testng.getStatus());

	}
}
