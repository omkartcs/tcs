package investment_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin2page {
@FindBy(xpath = "//input[@id='yob']")private WebElement dob;

public upstoxlogin2page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterdob() {
	dob.sendKeys("1995");
}
}
