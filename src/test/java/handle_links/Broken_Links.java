package handle_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/broken-links.php";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		/////////////////////////////////////
		
		driver.findElement(By.partialLinkText("Click Here for Broken")).click();
		Thread.sleep(2000);
		
		
		

	}

}
