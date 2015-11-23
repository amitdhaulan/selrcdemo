package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageObjectsPercCalc {
	public static WebElement element;

	public static WebElement math_cal_link(WebDriver driver) {
		return element = driver.findElement(By
				.xpath(".//*[@id='menu']/div[3]/a"));
	}

	public static WebElement per_cal_link(WebDriver driver) {
		return element = driver.findElement(By
				.xpath(".//*[@id='menu']/div[4]/div[3]/a"));
	}

	public static WebElement text_box_one(WebDriver driver) {
		return element = driver.findElement(By.id("cpar1"));
	}

	public static WebElement text_box_two(WebDriver driver) {
		return element = driver.findElement(By.id("cpar2"));
	}

	public static WebElement button_click(WebDriver driver) {
		return element = driver.findElement(By
				.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input"));
	}

	public static WebElement result_text(WebDriver driver) {
		return element = driver.findElement(By
				.xpath(".//*[@id='content']/p[2]/span/font/b"));
	}
}
