package assignement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day1.selenium.Chromedriver;

public class AmazonValidation {

	public static void main(String[] args) {
	String chromepath= System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver",chromepath);
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	String actualtitle=driver.getTitle();
	String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	if(actualtitle.equals(expectedtitle)) {
		System.out.println("test case passed");
		}else {System.out.println("test case failed");
		}
	
	String actualurl=driver.getCurrentUrl();
	String expectedurl="https://www.amazon.in";
	System.out.println("url validation is "+actualurl.contains(expectedurl));
	
	driver.getPageSource();
	System.out.println("length of pagesource "+driver.getPageSource().length());
	driver.close();
	 

	}

}
