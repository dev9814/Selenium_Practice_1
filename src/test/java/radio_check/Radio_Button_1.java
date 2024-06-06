package radio_check;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/test/radio.html";
		
		driver.get(url);
		
		//////////////////////////////////////////
		
		WebElement radbutton1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radbutton2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radbutton3 = driver.findElement(By.id("vfb-7-3"));
		
		Thread.sleep(5000);
		
		List<WebElement> buttonlist = new ArrayList<WebElement>();

		buttonlist.add(radbutton1);
		buttonlist.add(radbutton2);
		buttonlist.add(radbutton3);
		
		try {
			// 1
			try {
				radbutton1.click();
				Thread.sleep(2000);
				if(radbutton1.isSelected()) {
					System.out.println("radio button 1 is selected");
				}
			}
			catch(Exception e) {
				System.out.println("error message-> "+ e.getMessage());
			}
			Thread.sleep(2000);
			
			// 2
			try {
				radbutton2.click();
				Thread.sleep(2000);
				if(radbutton2.isSelected()) {
					System.out.println("radio button 2 is selected");
				}
			}
			catch(Exception e) {
				System.out.println("error message-> "+ e.getMessage());
			}
			Thread.sleep(2000);
			
			// 3
			try {
				radbutton3.click();
				Thread.sleep(2000);
				if(radbutton3.isSelected()) {
					System.out.println("radio button 3 is selected");
				}
			}
			catch(Exception e) {
				System.out.println("error message-> "+ e.getMessage());
			}
		}
		catch(Exception e) {
			System.out.println("error message-> "+ e.getMessage());
		}
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
