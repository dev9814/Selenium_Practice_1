package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.name("country"));
		Thread.sleep(5000);
		
		// using select class
		Select drpcountry = new Select(country);
		
		// now we can select from drop down
		
		// by value
		drpcountry.selectByValue("INDIA");
			
		//by visible text
//		drpcountry.selectByVisibleText("INDIA");
		
		// by id
//		drpcountry.selectByIndex(10);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
