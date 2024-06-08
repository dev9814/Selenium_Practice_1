package handling_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_2 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/alerts.php";
		
		driver.get(url);
		
		Thread.sleep(2000);
		//
		
		// alert2
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(1500);
		
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		
		Thread.sleep(5000);
		driver.quit();
		

	}
}


