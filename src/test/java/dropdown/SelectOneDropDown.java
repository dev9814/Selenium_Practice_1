package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOneDropDown {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/select-menu.php";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		//
		driver.findElement(By.id("inputGroupSelect03")).click();
		Thread.sleep(1500);
		
		WebElement option = driver.findElement(By.id("inputGroupSelect03"));
		
		Select sel = new Select(option);
		
		sel.selectByValue("2");
		

	}

}
