package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor_1 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/V4/";
		driver.get(url);
		
		Thread.sleep(2000);
		
		// creating the java script interface object by type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		WebElement button = driver.findElement(By.name("btnLogin"));
		
		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");
        
        
		// Perform click on Login button using Javascript Executor
        js.executeScript("arguments[0].click();", button);
		
		
		// To generate alert window using JavascriptExecutor.
        js.executeScript("alert('Invalid')");
		

	}

}
