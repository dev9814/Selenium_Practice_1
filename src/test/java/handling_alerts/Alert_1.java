package handling_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/alerts.php";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		// Alert 1
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click();
		Thread.sleep(1500);
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1500);
		
		driver.switchTo().alert().accept();
		

	}
}


