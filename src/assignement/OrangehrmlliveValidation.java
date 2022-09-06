package assignement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmlliveValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumPractice\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualtitle=driver.getTitle();
		System.out.println("actaul title "+actualtitle);
		String expectedtitle="OrangeHRM";
		System.out.println("validation of title is "+actualtitle.equals(expectedtitle));
		
		String acualurl=driver.getCurrentUrl();
		System.out.println("currnt url: "+driver.getCurrentUrl());
		String expectedurl="https://opensource-demo.orangehrmlive.com/";
		System.out.println("validation of url is "+acualurl.equals(expectedurl));
		
		driver.getPageSource();
		System.out.println(driver.getPageSource().length());
		driver.close();
		
		
		
		
		
		
		

	}

}
