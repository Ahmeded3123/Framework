package piit.AutomationTraningProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ILocatoerd {
static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.com");   //to maximize the browser window 
			driver.manage().window().maximize();        
			WebElement searchtofield=driver.findElement(By.xpath("//input[@aria-label='Search']"));
			
			WebElement searchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/form/div/div/span"));
			Thread.sleep(6000);
			searchtoclick.click();
			
			
			

	}

}
