package edit_boxs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) throws InterruptedException{
	
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
		
		driver.get(url);
		Thread.sleep(3000);
		
		// name
		driver.findElement(By.id("name")).sendKeys("devdutta");
		Thread.sleep(1500);
		
		// email
		driver.findElement(By.id("email")).sendKeys("dev14will@gmail.com");
		Thread.sleep(1500);
		
		// number
		driver.findElement(By.id("mobile")).sendKeys("1122");
		Thread.sleep(1500);
		
		//

	}

}
