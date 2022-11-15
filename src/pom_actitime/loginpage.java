package pom_actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//declaration
	@FindBy(xpath = "//input[@id='username']")private WebElement un;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement login;
	
	//initialization
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//implementation
	public void enterun() {
		un.sendKeys("admin");
	}
	public void enterpwd() {
		pwd.sendKeys("manager");
	}
	public void loginbtn() {
		login.click();
	}

}
