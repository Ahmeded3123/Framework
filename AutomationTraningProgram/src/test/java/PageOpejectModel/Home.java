package PageOpejectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
	WebDriver driver;
	@FindBy(name ="email") WebElement Ids;
	@FindBy(name ="pass") WebElement password;
	@FindBy (linkText = "Forgot password?")WebElement Forgot;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 public void Email() {
		 Ids.sendKeys("Wema");
	 }
	 public void PasswordFieldsEnters() {
		 password.sendKeys("Green");
		 
	 }
	 
	 public void ForgetLinkClik() {
		 Forgot.click();
	 }
	
	

}
