package web_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deep_WebTable {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/test/newtours/";
		
		driver.get(url);
		Thread.sleep(2000);
		////////////////////////////////////////////////////

		try {
			
			WebElement table = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td"));
			
			String txt = table.getText();
			
			if(!txt.isEmpty()) {
				System.out.println("text-> "+ txt);
			}
		}
		catch(Exception e) {
			System.out.println("error message-> "+ e.getMessage());
		}
		
	}
}


