package selrcdemo;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@SuppressWarnings("deprecation")
public class Rcdemo {
	static Selenium selenium;

	public static void main(String[] args) throws InterruptedException {

		try {
			// Instantiate the RC Server
			selenium = new DefaultSelenium("localhost", 4444, "firefox",
					"http://www.calculator.net");
			selenium.start(); // Start
			selenium.open("/"); // Open the URL
			selenium.windowMaximize();

			// Click on Link Math Calculator
			selenium.click("xpath=.//*[@id='menu']/div[3]/a");
			Thread.sleep(4000); // Wait for page load

			// Click on Link Percent Calculator
			selenium.click("xpath=.//*[@id='menu']/div[4]/div[3]/a");
			Thread.sleep(4000); // Wait for page load

			// Focus on text Box
			selenium.focus("name=cpar1");
			// enter a value in Text box 1
			selenium.type("css=input[name=\"cpar1\"]", "10");

			// enter a value in Text box 2
			selenium.focus("name=cpar2");
			selenium.type("css=input[name=\"cpar2\"]", "100");

			// Click Calculate button
			selenium.click("xpath=.//*[@id='content']/table/tbody/tr/td[2]/input");
			Thread.sleep(3000);

			// verify if the result is 5
			String result = "";
			try {

				result = selenium
						.getText("xpath=.//*[@id='content']/p[2]/span/font/b");
				// result = selenium.getText("xpath=.//*[@id='cpar3']");
			} catch (Exception e) {
				selenium.close();
				System.out.println(e.getMessage());

			}

			if (result.equals("10")) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}

		} catch (Exception exception) {
			System.out.println(exception.getLocalizedMessage() + " <<<<<<<<");
		} finally {
			selenium.close();
			selenium.stop();
		}

	}

}