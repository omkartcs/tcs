package pom_actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_testngpage {
	 
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement Text;
	
	
	    
	    public home_testngpage(WebDriver driver) {
	       PageFactory.initElements(driver, this);	
	    }
	    
	    public String verifytext() {
	    	String actText = Text.getText();
	    	return actText;
	    }
}
