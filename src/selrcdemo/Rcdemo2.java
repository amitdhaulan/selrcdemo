package selrcdemo;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class Rcdemo2 {
	public static void main(String[] args) throws InterruptedException {

		// Instatiate the RC Server
		Selenium selenium = new DefaultSelenium("localhost", 4444, "firefox",
				"http://www.calculator.net");
		selenium.start(); // Start
		selenium.open("\\"); // Open the URL
		selenium.windowMaximize();

		// Click on Link Math Calculator
		selenium.click("xpath=.//*[@id='menu']/div[3]/a");
		Thread.sleep(2500); // Wait for page load

		// Click on Link Percent Calculator
		selenium.click("xpath=.//*[@id='menu']/div[4]/div[2]/a");
		Thread.sleep(4000); // Wait for page load

		// Focus on text Box
		selenium.focus("name=t1");
		// enter a value in Text box 1
		selenium.type("css=input[name=\"t1\"]", "2");

		// enter a value in Text box 2
		selenium.focus("name=b1");
		selenium.type("css=input[name=\"b1\"]", "4");

		selenium.focus("name=t2");
		// enter a value in Text box 1
		selenium.type("css=input[name=\"t2\"]", "2");

		selenium.focus("name=b2");
		// enter a value in Text box 1
		selenium.type("css=input[name=\"b2\"]", "4");

		// Click Calculate button
		selenium.click("xpath=.//*[@id='content']/table/tbody/tr[4]/td/input");

		// verify if the result is 5
		int result1 = 0;
		int result2 = 0;
		int finalResult = 0;
		try {
			result1 = (Integer.parseInt(selenium
					.getText("xpath=.//*[@id='t3']")));

			result2 = (Integer.parseInt(selenium
					.getText("xpath=.//*[@id='b3']")));

			finalResult = (Integer.parseInt(selenium
					.getText("xpath=..//*[@id='content']/p[2]/b/font")));

		} catch (Exception e) {
			selenium.close();
			System.out.println(e.getMessage());
		}

		String op = selenium.getText("xpath=.//*[@id='op']");

		if (op.equals("/")) {
			if (finalResult == result1 / result2) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		} else if (op.equals("*")) {
			if (finalResult == result1 * result2) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		} else if (op.equals("+")) {
			if (finalResult == result1 + result2) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		} else {
			if (finalResult == result1 - result2) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}

	}
}