package piit.AutomationTraningProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageOpejectModel.ForgetPasswordPage;
import PageOpejectModel.Home;
import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class SignIn {
	WebDriver driver;
  @Test (priority = 1)
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.Email();
	 Pictures();
	  ob.PasswordFieldsEnters();
	  ob.ForgetLinkClik();
	  ForgetPasswordPage UserID=new ForgetPasswordPage(driver);
	  UserID.IdsSendkeys();
	  UserID.SearchbuttonClick();
	  Thread.sleep(6000);  
	  Pictures();
  
  
File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(screenshots, new File("C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Pictures\\shot of page.jpg"));
  }
 










@Test (priority = 2,dependsOnMethods ="f")
  public void TestVerificationMethod() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(6000);
	  ForgetPasswordPage UserID=new ForgetPasswordPage(driver);
	String Questions=  UserID.QuestionOfText();
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals("Please enter your email or mobile number to search for your account", Questions);
	System.out.println(" This is after assertion");
	  
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  Browsers("Edge");
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
	  // this part need to be checked again 
	  // check the video for corrections !!
	 public void Pictures() throws IOException  {
		  Date dt=new Date();
		String  sk.toString().replace("", "-").replace(":", "-");
		  System.out.println(sk);
		  System.out.println(dt);
		  
		  
		  File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(screenshots, new File("C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Pictures\\"+sk"shotofpage.jpg"));
		 
		  
	  } 
	  
	  
  }







}
