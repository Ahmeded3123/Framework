


package piit.AutomationTraningProgram;

	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDriver {
	// calling the web-driver as a global variable 
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// setep Chrome Browser
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\eclipse-workspace\\AutomationTraningProgram\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	//to maximize the browser window 
	driver.manage().window().maximize();
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	driver.navigate().refresh();
	String ur= driver.getCurrentUrl();
	System.out.println(ur);
	String WindowHandle=  driver.getWindowHandle();
	System.out.println(WindowHandle);
	driver.close();
	

	
		
		

	}

}
