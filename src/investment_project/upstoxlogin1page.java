package investment_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin1page {
//declaration
	@FindBy(xpath = "//input[@id='userCode']")private WebElement un;
	@FindBy(xpath = "//input[@id='password']")private WebElement pwd;
	@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement login;
	
//initialization
	public upstoxlogin1page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//implementation
	public void enterun() {
		un.sendKeys("2QALQX");
	}
	public void enterpwd() {
		pwd.sendKeys("Pnishi@321");
	}
	public void login() {
		login.click();
	}
	
}
