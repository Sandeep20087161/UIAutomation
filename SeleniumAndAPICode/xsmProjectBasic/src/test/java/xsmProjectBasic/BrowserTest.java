package xsmProjectBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SandeepWorkspace\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		XsmPage xsmPage=new XsmPage(driver);
		driver.get("https://www.facebook.com/");
		xsmPage.fillUserName();
	}
}
