package piit.AutomationTraningProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowck {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");   
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement newrelaseslinks=driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newrelaseslinks.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
		//Set <data type> allows us to store multiple data type. 
		Set<String> windowhandles= driver.getWindowHandles();
		Iterator<String> itrators=windowhandles.iterator();
		String parent= itrators.next();
		String secondwindo= itrators.next();
		driver.switchTo().window(secondwindo);
		WebElement products=driver.findElement(By.linkText("Camera & photo Products"));
		Thread.sleep(6000);
		products.click();
		
	// Framework is set of guidelines that we follow while writing our code . 
		// Organizing the code 
		// Troubleshooting 
		// Reusability of the Code 
		//Genrating the reports
		//TestNG
		//Cucumber
		
	
		
		
		

		

	}

}
