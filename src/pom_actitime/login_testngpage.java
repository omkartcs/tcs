package pom_actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_testngpage {
	//declaration
			@FindBy(xpath = "//input[@id='username']")private WebElement un;
			@FindBy(xpath = "//input[@name='pwd']")private WebElement pwd;
			@FindBy(xpath = "//div[text()='Login ']")private WebElement login;
			
			//initialization
			public login_testngpage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			//implementation
			public void enterun(String username) {
				un.sendKeys(username);
			}
			public void enterpwd(String passward) {
				pwd.sendKeys(passward);
			}
			public void loginbtn() {
				login.click();
			}

}
