package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String url ="https://testautomationpractice.blogspot.com/";
		driver.get(url);
		
		Thread.sleep(2000);
		//
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		

	}

}
