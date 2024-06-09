package handle_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_1 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/links.php";
		
		driver.get(url);
		
		Thread.sleep(1500);
		
		// full link 
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("HomewPWPU")).click();
		Thread.sleep(2000);

	}

}
