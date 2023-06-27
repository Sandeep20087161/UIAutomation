package xsmProjectBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XsmPage {

	@FindBy(id="email")
	public WebElement fillUserName;
	
	public XsmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fillUserName() {
		fillUserName.sendKeys("Sandeep2008716@gmail.com");
		
	}
	
	
}
