package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeUrl2 {

	public static void main(String[] args) {

	String chromepath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";	
	
	System.setProperty("webdriver.chrome.driver",chromepath);
	
	WebDriver driver=new ChromeDriver();
	
	System.out.println("****URL Validation*****");
	
	driver.get("https://www.google.com");
	
	String expectedURL="https://www.google.com";
	

	String ActualURL=driver.getCurrentUrl();
	
	System.out.println("expected URL ->> "+expectedURL);
	
	System.out.println("Actual URL ->> "+ActualURL);
	
	if(ActualURL.contains(expectedURL)) 
	{
		System.out.println("URL Test case validation passed");
	}
	else 
	{
		System.out.println(" URL Test case validation failed");

	}
	

	System.out.println("************Title validation************");
	
    String	expectedTitle="Google";
    
	String actualTitle=driver.getTitle();

	if(actualTitle.equals(expectedTitle)) {System.out.println("Title verified");}
	else {System.out.println("Title Validation Failed");}
	
	System.out.println("***********getPageSource*************");
	
	driver.getPageSource();
	
	System.out.println("length of page content  "+driver.getPageSource().length());
	
	
	driver.close();
	
	}

}
