package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/test/drag_drop.html";
		
		driver.get(url);
		Thread.sleep(3000);
		////////////////////////////////
		Actions act = new Actions(driver);

		try {
			
			WebElement from = driver.findElement(By.xpath("//*[@id='products']/div/ul/li[2]"));
			
			WebElement to = driver.findElement(By.xpath("//*[@id='shoppingCart4']/div"));
			
//			Actions act = new Actions(driver);
			
			act.dragAndDrop(from, to).build().perform();
			
		}
		catch(Exception e) {
			System.out.println("error message-> "+ e.getMessage());
		}
		Thread.sleep(1500);
		
		try {
			
			WebElement from = driver.findElement(By.xpath("//*[@id='products']/div/ul/li[2]"));
			
			WebElement to = driver.findElement(By.xpath("//*[@id='amt8']"));
			
//			Actions act = new Actions(driver);
			
			act.dragAndDrop(from, to).build().perform();
			
		}
		catch(Exception e) {
			System.out.println("error message-> "+ e.getMessage());
		}
		Thread.sleep(1500);
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
