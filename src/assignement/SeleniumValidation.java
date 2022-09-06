package assignement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\SeleniumPractice\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	 driver.get(" ghghv w2a");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 
        
     String expURLL="https://demo.actitime.com/login.do";
     String currenturl=driver.getCurrentUrl();
     
     System.out.println("URL validation "+expURLL.equals(currenturl));
     
     WebElement userNameField =driver.findElement(By.id("username"));
		System.out.println("UserName is displayed or not  "+userNameField.isDisplayed());
		System.out.println("UserName is enabled or not  "+userNameField.isEnabled());
		String defaultValueUserNameField=userNameField.getAttribute("placeholder");
		System.out.println("Default value of user name field  "+defaultValueUserNameField);
		System.out.println("validation of default field " +defaultValueUserNameField.equals("Username"));
		
		WebElement passwordField=driver.findElement(By.name("pwd"));
		System.out.println("passwrd field is displayed or not "+passwordField.isDisplayed());
		System.out.println("passwrd field is Enabled  or not "+passwordField.isEnabled());
		String defaultpasswordfield =passwordField.getAttribute("placeholder");
		System.out.println("default value of password field "+defaultpasswordfield);
		System.out.println("validation of default field "+defaultpasswordfield.equals("Password"));
	    driver.close();
	    
	   
    	 
     }
     }


