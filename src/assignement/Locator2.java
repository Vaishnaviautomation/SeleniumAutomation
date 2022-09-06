package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://demo.actitime.com/login.do");
		
		String Actualtitle=driver.getTitle();
		
        String expectedtitle="actiTIME - Login";
        System.out.println("verification of title "+ Actualtitle.equals(expectedtitle));
        
        
        WebElement element1=driver.findElement(By.id("username"));
        element1.clear();
        element1.sendKeys("admin");
        
        WebElement element2=driver.findElement(By.name("pwd"));
        element2.sendKeys("manager");
        
     //  WebElement element3=driver.findElement(By.xpath("//div[text()='Login ']"));
       
       WebElement element3=driver.findElement(By.tagName("div"));

        
        element3.click();
        
               
    //  driver.close();
        
        
        
        
        


	}

}
