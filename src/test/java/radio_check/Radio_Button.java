package radio_check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		Thread.sleep(5000);
		
		////////////////////////////////////////////////
		
		try {
			WebElement radbutton1 = driver.findElement(By.id("vfb-7-"));
			
			
			if(radbutton1.isSelected()) {
				System.out.println("First radio button is selected");
				Thread.sleep(2000);
			}
			else {
				Thread.sleep(2000);
				radbutton1.click();
				
				if(radbutton1.isSelected()) {
					System.out.println("radio button is selected");
				}
			}
			
		
		}catch(Exception e) {
			System.out.println("e message-> "+ e.getMessage());

			
		}

		Thread.sleep(5000);
		driver.quit();
		
	}// main
}
