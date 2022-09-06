package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome1 {

	public static void main(String[] args) {

		// String chromepath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		 
		
		String chromePath1=".\\Executables\\chromedriver.exe" ;
		 
		 System.setProperty("webdriver.chrome.driver", chromePath1);
		 
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 
		 String url=driver.getCurrentUrl();
		 
		 System.out.println(url);
		 
		 driver.close();
		
		 
		 
		 

	}

}
