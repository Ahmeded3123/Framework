package piit.AutomationTraningProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");   //to maximize the browser window 
		driver.manage().window().maximize();
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		WebElement Departuretodate=driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
		Departuretodate.click();
		WebElement Arrivle=driver.findElement(By.id("d1-btn"));//check the checkout id !!
		Arrivle.click();
		WebElement returntodate=driver.findElement(By.xpath("//*[@aria-label='Jun 23, 2022']"));
		returntodate.click();
		
		
		
		
		
		
		
		

	}

}
