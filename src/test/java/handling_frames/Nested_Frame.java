package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frame {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		Thread.sleep(2000);
		
		// frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		Thread.sleep(1500);
		
		driver.findElement(By.name("mytext1")).sendKeys("frame yellow");
		Thread.sleep(1500);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		
		// frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		Thread.sleep(1500);
		
		driver.findElement(By.name("mytext2")).sendKeys("frame green");
		Thread.sleep(1500);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		
		// frame5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		
		driver.switchTo().frame(frame5);
		Thread.sleep(1500);
		
		driver.findElement(By.name("mytext5")).sendKeys("frame grey");
		Thread.sleep(1500);
		
		// click link
		driver.findElement(By.linkText("https://a9t9.com")).click();
		Thread.sleep(1500);
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		

	}

}
