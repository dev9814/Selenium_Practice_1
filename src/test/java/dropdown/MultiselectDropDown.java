package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiselectDropDown {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/select-menu.php";
		driver.get(url);
		
		Thread.sleep(2000);
		
		// Multiple select
		driver.findElement(By.id("mbsc-control-0")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[41]")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[43]")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[48]")).click();
		
		
				

	}

}
