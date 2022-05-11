package piit.AutomationTraningProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Ilocators {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");   //to maximize the browser window 
		driver.manage().window().maximize();
		WebElement Searchfieldtext= driver.findElement(By.name("field-keywords"));
		Searchfieldtext.sendKeys("Computer");                  // => Write computer in  Search button and brings up Computers. 
		WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();
		WebElement linktx =driver.findElement(By.linkText("Registry"));    // => opens up computer search then Registry .
		linktx.click(); //=> link text 
		driver.close();
		
		
		
		
		
		

	}

}
