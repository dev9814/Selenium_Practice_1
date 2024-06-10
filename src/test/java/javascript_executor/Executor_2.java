package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor_2 {

	public static void main(String[] args) throws InterruptedException{
	
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/V4/";
		driver.get(url);
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// fetching the domain name of the site
		String domainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of the site= "+ domainName);
		
		Thread.sleep(2000);
		
		// fetching the url of the site
		String urlName = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site= "+ urlName);
		
		Thread.sleep(2000);
		
		// fetching title
		String titleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page= "+ titleName);
		
		Thread.sleep(2000);
		
		js.executeScript("window.location = 'https://demo.guru99.com/'");
		
		

	}

}
