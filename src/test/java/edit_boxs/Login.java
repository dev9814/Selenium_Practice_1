package edit_boxs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/selenium/practice/login.php";
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		// email
		driver.findElement(By.id("email")).sendKeys("dev@gmail.com");
		Thread.sleep(1500);
		
		// password
		driver.findElement(By.id("password")).sendKeys("12de12he12h2");
		Thread.sleep(1500);
		
		// login
		driver.findElement(By.xpath("//*[@id='signInForm']/div[3]/input")).click();
		Thread.sleep(2000);

	}
}


