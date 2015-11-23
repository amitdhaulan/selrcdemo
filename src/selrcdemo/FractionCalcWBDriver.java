package selrcdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FractionCalcWBDriver {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.calculator.net");
		String operation = "+";

		// Use page Object library now
		page_objects_perc_calc.lnk_math_calc(driver).click();
		page_objects_perc_calc.lnk_fraction_calc(driver).click();

		page_objects_perc_calc.f_txt_num_1(driver).sendKeys("10");
		page_objects_perc_calc.f_txt_num_3(driver).sendKeys("10");
		page_objects_perc_calc.f_txt_num_2(driver).sendKeys("10");
		page_objects_perc_calc.f_txt_num_4(driver).sendKeys("10");

		try {
			page_objects_perc_calc.f_web_op(driver).selectByValue(operation);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

		page_objects_perc_calc.f_btn_calc(driver).click();

		String result = page_objects_perc_calc.fraction_result(driver)
				.getText();

		if (operation.equals("/")) {
			if (result.equals("10/10 / 10/10 = 1/1")) {
				Assert.assertEquals(result, "10/10 / 10/10 = 1/1");
				System.out.println("10/10 / 10/10 = 1/1==> "
						+ " The Result is Pass");
			} else {
				System.out.println(" The Result is Fail");
			}
		} else if (operation.equals("*")) {
			if (result.equals("10/10 * 10/10 = 1/1")) {
				System.out.println("10/10 * 10/10 = 1/1==> "
						+ " The Result is Pass");
			} else {
				System.out.println(" The Result is Fail");
			}
		} else if (operation.equals("+")) {
			if (result.equals("10/10 + 10/10 = 2/1")) {
				Assert.assertEquals(result, "10/10 + 10/10 = 2/1");
				System.out.println(result + " The Result is Pass");	
			} else {
				System.out.println(" The Result is Fail");
			}
		} else if (operation.equals("-")) {
			if (result.equals("10/10 - 10/10 = 2/1")) {
				Assert.assertEquals(result, "10/10 - 10/10 = 2/1");
				System.out.println("10/10 - 10/10 = 2/1==> "
						+ " The Result is Pass");
			} else {
				System.out.println(" The Result is Fail");
			}
		}

		driver.close();
	}
}
