package selrcdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WBDemo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("ContentHolder_lbSelectionMode_I")).click();
		driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI2T0")).click();
		
		Thread.sleep(5000);
			
		//  Perform Multiple Select 
		Actions builder = new Actions(driver);
		WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_D"));
		List<WebElement> options = select.findElements(By.tagName("td"));
		System.out.println(options.size());
		Action multipleSelect = builder.keyDown(Keys.CONTROL)
			.click(options.get(2))
			.click(options.get(4))
			.click(options.get(6))
			.build();
		multipleSelect.perform();

		driver.close(); 

	}
}
