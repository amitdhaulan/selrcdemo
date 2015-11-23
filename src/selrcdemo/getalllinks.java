package selrcdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getalllinks {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.calculator.net");
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links in the Page is " + links.size());

		for (int i = 0; i < links.size(); i++) {
			System.out.println("Name of Link# " + i + "-"
					+ links.get(i).getText());
		}
	}
}
