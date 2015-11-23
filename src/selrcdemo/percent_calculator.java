package selrcdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class percent_calculator {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.calculator.net");

		page_objects_perc_calc.lnk_math_calc(driver).click();
		page_objects_perc_calc.lnk_percent_calc(driver).click();
		page_objects_perc_calc.txt_num_1(driver).sendKeys("10");
		page_objects_perc_calc.txt_num_2(driver).sendKeys("50");
		page_objects_perc_calc.btn_calc(driver).click();

		String result = page_objects_perc_calc.percent_result(driver).getText();

		
		/*Assert.assertEquals(result, "5");*/

		if (result.equals("10% of 50 = 5")) {
			System.out.println(" The Result is Pass");
		} else {
			System.out.println(" The Result is Fail");
		}

		driver.close();
	}
}