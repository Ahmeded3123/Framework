package piit.AutomationTraningProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightTo {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");   
		driver.manage().window().maximize();
		// since non of locators support by Selenium we use xpath. 
		WebElement Picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
		Actions ob=new Actions(driver);
		ob.contextClick(Picture);
		

	}

}
