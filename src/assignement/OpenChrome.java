package assignement;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {

		//User Directory
		 System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		 
		// System.getProperty("user.dir");
		 
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.google.com");
	     
		 driver.close();
	}

}
