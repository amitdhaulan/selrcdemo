package selrcdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class page_objects_perc_calc {
	private static WebElement element = null;
	private static Select dropdown = null;

	// Math Calc Link
	public static WebElement lnk_math_calc(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a"));
		return element;
	}

	// Percentage Calc Link
	public static WebElement lnk_percent_calc(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='menu']/div[4]/div[3]/a"));
		return element;
	}

	// Fraction Calc Link
	public static WebElement lnk_fraction_calc(WebDriver driver) {
		element = driver
				.findElement(By.xpath(".//*[@id='menu']/div[4]/div[2]/a"));
		return element;
	}

	// ********************Percentage Cal***** Number 1 Text Box
	public static WebElement txt_num_1(WebDriver driver) {
		element = driver.findElement(By.id("cpar1"));
		return element;
	}

	// ********************Percentage Cal***** Number 2 Text Box
	public static WebElement txt_num_2(WebDriver driver) {
		element = driver.findElement(By.id("cpar2"));
		return element;
	}

	// Calculate Button
	public static WebElement btn_calc(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]"));
		return element;
	}

	// Result
	public static WebElement percent_result(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='content']/p[2]"));
		return element;
	}

	// *********************************************************************************

	// **********Fraction Cal****************************

	// Number 1 Text Box
	public static WebElement f_txt_num_1(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='t1']"));
		return element;
	}

	// Number 2 Text Box
	public static WebElement f_txt_num_2(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='b1']"));
		return element;
	}

	// Number 3 Text Box
	public static WebElement f_txt_num_3(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='t2']"));
		return element;
	}

	// Number 4 Text Box
	public static WebElement f_txt_num_4(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='b2']"));
		return element;
	}

	// Calculate Button
	public static WebElement f_btn_calc(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='content']/table[1]/tbody/tr[4]/td/input[2]"));
		return element;
	}

	// Result
	public static WebElement fraction_result(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='content']/p[2]/b/font"));
		return element;
	}

	// operation
	public static Select f_web_op(WebDriver driver) {

		dropdown = new Select(driver.findElement(By.tagName("select")));
		return dropdown;
	}
	// *********************************************************************************

}
