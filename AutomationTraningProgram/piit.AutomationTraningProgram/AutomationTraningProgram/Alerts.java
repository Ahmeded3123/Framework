package piit.AutomationTraningProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");   
		driver.manage().window().maximize();
		WebElement Alert=driver.findElement(By.name("Alerts"));
		Alert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement prompting=driver.findElement(By.name("promt"));
		prompting.click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("tested");
		driver.switchTo().alert().dismiss();
		
		

	}

}
