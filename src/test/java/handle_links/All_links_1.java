package handle_links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_links_1 {

	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/links.php";
		
		driver.get(url);
		
		Thread.sleep(1500);
		
		// identify link with link text locator then click
		WebElement l = driver.findElement(By.linkText("No Content"));
		l.click();
		
		Thread.sleep(1500);
		
		// Retrieve all links using locator By.tagName and store them in the list
		List<WebElement> totallnks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+ totallnks.size());
		
		Thread.sleep(1500);
		
// equalsIgnoreCase() -> it is a method to check to methods are equal 
		// are not ignoring  		
		
		// Running loop through list of web elements
//		for(int j=0 ; j<totallnks.size() ; j++) {
//			if(totallnks.get(j).getText().equalsIgnoreCase("No Content")) {
//				totallnks.get(j).click();
//				
//				WebElement t = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]"));
//				
//	            // get the browser title to confirm navigation after click
//	            System.out.println( "Get text after click: " + t.getText());
//	            break ;
//			}
//		}
		
		for(int i=0 ; i<totallnks.size() ; i++) {
			
			String txt = totallnks.get(i).getText();
			System.out.println(txt);
			
			
			Thread.sleep(1500);
			
			
		}
		
		// closing browser
		

	}
}
