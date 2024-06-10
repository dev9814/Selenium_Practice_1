package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor_3_Scroll {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://moneyboats.com/";
		driver.get(url);
		
		Thread.sleep(2000);
		
		// creating Javascript Executor interface
		JavascriptExecutor js = (JavascriptExecutor)driver; 

		// Vertical scroll down
		js.executeScript("window.scroll(0, 200)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0, 400)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0, 500)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0, 300)");
		Thread.sleep(1500);
		js.executeScript("window.scroll(0, 200)");
		Thread.sleep(1500);
		
		
		
	}

}
