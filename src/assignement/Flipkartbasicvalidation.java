package assignement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartbasicvalidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\workspace\\SeleniumPractice\\Executables\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	String title=driver.getTitle();	
	String expectedtitle="    ";
	String str=driver.getCurrentUrl();
	String string="";
	
	
	int pagelength=driver.getPageSource().length();
	System.out.println(pagelength);
	
	
		
		
	

	}

}
