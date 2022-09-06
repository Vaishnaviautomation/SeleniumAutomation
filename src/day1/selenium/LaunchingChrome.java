package day1.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\SeleniumPractice\\Executables\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.close();
		
	}

}
