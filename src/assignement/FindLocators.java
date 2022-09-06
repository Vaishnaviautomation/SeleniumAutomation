package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\SeleniumPractice\\Executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String Actualtitle=driver.getTitle();
		
		String expectedTitle= "OrangeHRM";
		
		System.out.println("Verified Login page \t "+Actualtitle.equals(expectedTitle));
		
		WebElement element=driver.findElement(By.id("txtUsername"));
		 element.clear();
		 element.sendKeys("Admin");
		 
		 WebElement element2=driver.findElement(By.name("txtPassword"));
		 
		 element2.clear();
		 element2.sendKeys("admin123");
		 
		 
		WebElement element3 = driver.findElement(By.className("button"));
		element3.click();
		
		WebElement element4 = driver.findElement(By.className("quickLinkText"));
		
		System.out.println("Verified Home Page \t"+element4);
		
		driver.close();
		 	
		
	}
	

}
