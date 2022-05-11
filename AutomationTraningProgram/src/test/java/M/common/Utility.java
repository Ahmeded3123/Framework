package M.common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utility {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  Browsers("Chrome");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  public void Browsers (String window) {
	  if (window.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");  
			driver.manage().window().maximize();
	  } else if (window.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.navigate().to("https://www.facebook.com");  
			driver.manage().window().maximize();
	  
	  }else if (window.equalsIgnoreCase("Fairfox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\geckodriver.exe");
	  		driver=new FirefoxDriver();
			driver.navigate().to("https://www.facebook.com");  
			driver.manage().window().maximize();
		  
		  
	  }
	}
  public void Pictures() throws IOException  {
	  Date dt=new Date();
	String  sk.toString().replace(" ", "-").replace(":", "-");
	  System.out.println(sk);
	  System.out.println(dt);
	  
	  
	  File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(screenshots, new File("C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Pictures\\"+sk"shot of page.jpg"));
	 
}
