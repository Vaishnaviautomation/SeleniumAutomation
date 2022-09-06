package day1.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","D:\\workspace\\SeleniumPractice\\Executables\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		//driver.close();
	}

}
