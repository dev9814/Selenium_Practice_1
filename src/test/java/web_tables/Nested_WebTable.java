package web_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_WebTable {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/test/accessing-nested-table.html";
		
		driver.get(url);
		
		Thread.sleep(2000);
		//////////////////////////////////////////////////////////
		
		try {
			
			WebElement table = driver.findElement(By.xpath("//center//table//tbody//tr[2]//td[2]//table//tbody//tr[2]//td[2]"));
			
			try {
				String txt = table.getText();
				
				if(!txt.isEmpty()) {
					System.out.println("text-> "+ txt);
				}
				else {
					System.out.println("text is empty.");
				}
			}
			catch(Exception e) {
				System.out.println("error message-> "+ e.getMessage());
			}
			
		}
		catch(Exception e) {
			System.out.println("error message-> "+ e.getMessage());
		}
		
		

	}

}
