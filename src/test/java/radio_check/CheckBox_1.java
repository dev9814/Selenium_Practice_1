package radio_check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_1 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/test/radio.html";
		
		driver.get(url);
		
		////////////////////////////////////////////////////
		
		WebElement cbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement cbox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement cbox3 = driver.findElement(By.id("vfb-6-2"));
		
		Thread.sleep(2000);
		
		try {
			
			// 1
			try {
				cbox1.click();
				Thread.sleep(2000);
				if (cbox1.isSelected()) {
					System.out.println("check box 1 is selected");
				}
			}
			catch(Exception e) {
				System.out.println("error message-> "+ e.getMessage());
			}
			
			// 2
			try {
				cbox2.click();
				Thread.sleep(2000);
				if (cbox2.isSelected()) {
					System.out.println("check box 2 is selected");
				}
			}
			catch(Exception e) {
				System.out.println("error message-> "+ e.getMessage());
			}
			
			// 3
			try {
				cbox3.click();
				Thread.sleep(2000);
				if (cbox3.isSelected()) {
					System.out.println("check box 3 is selected");
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
