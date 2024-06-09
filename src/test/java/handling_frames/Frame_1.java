package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_1 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/frames";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		// 
		WebElement frame1 = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		
		String txt = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(txt);
		

	}
}
