package pom_actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
    @FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement Text;
    
    public homepage(WebDriver driver) {
       PageFactory.initElements(driver, this);	
    }
    
    public void verifytext() {
    	String expText = "Enter Time-Track";
    	String actText=Text.getText();
		 if(actText.equals(expText)) {
			 System.out.println("tc is pass");
		 }
		 else {
			 System.out.println("tc is fail");
		 }
    }
}
