package windows_tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs_1 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/browser-windows";
		
		driver.get(url);
		Thread.sleep(3000);
		
		// try opening new window
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		// 
		Set<String> windowhandles = driver.getWindowHandles();
		
		Thread.sleep(3000);
		
		for (String wh : windowhandles) {
//			String pagetitle = driver.switchTo().window(wh).getTitle();
			
			WebDriver webpage = driver.switchTo().window(wh);
			
			System.out.println( webpage.getCurrentUrl() );

			Thread.sleep(5000);

		}
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
