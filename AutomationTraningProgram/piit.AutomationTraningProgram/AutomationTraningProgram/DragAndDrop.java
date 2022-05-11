package piit.AutomationTraningProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;



public class DragAndDrop {
	static WebDriver driver;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com");   
		driver.manage().window().maximize();
		WebElement droppable=driver.findElement(By.linkText("Droppable"));
		droppable.click();
		driver.switchTo().frame(0); // (0) is the number of iframe , in this case the iframe is the first one (start from 0)
		WebElement ElementTodrag=driver.findElement(By.id("draggable"));
		WebElement DropToHere=driver.findElement(By.id("Droppable"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(ElementTodrag, DropToHere).build().perform();
		driver.switchTo().parentFrame();
		WebElement Sorting=driver.findElement(By.linkText("Droppable"));
		Sorting.click();
		
		
		
		
		

	}

}
