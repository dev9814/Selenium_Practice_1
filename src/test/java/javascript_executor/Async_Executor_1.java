package javascript_executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Async_Executor_1 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/V4/";
		driver.get(url);
		
		Thread.sleep(2000);
		
		// Creating the Javascript Executor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		// declare and set the start time
		long start_time = System.currentTimeMillis();
		
		// call executeAsyncScript() method to wait for 5 seconds
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		
		//get the difference (currentTime - startTime) of times
		System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));
		
		

	}

}
