package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/auto-complete.php";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		//
		WebElement auto = driver.findElement(By.id("tags"));
		auto.click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("tags")).sendKeys("a");
		Thread.sleep(1500);
		
		for(int i=0; i<4 ; i++) {
			auto.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			
			
		}
		
		auto.sendKeys(Keys.RETURN);
	
		

	}

}
