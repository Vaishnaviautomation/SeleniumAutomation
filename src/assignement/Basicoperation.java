package assignement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Basicoperation {

	public static void main(String[] args) {
	 System.setProperty("webdriver.gecko.driver", "D:\\workspace\\SeleniumPractice\\Executables\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.google.com");
		String currentworkingdirectory=System.getProperty("user.dir");//path
		System.out.println("current working path  "+currentworkingdirectory);
		String currenturl= fdriver.getCurrentUrl();
		String expectedurl="https://www.google.com";
				if(currenturl.equals(expectedurl)) {
					System.out.println("test case pass");
				}	else {
					System.out.println("test case failed");
				}	
				
				String pagespurce= fdriver.getPageSource();
				System.out.println(pagespurce.length());
		
		
		
		
		
		fdriver.close();
		
		

	 

	}

}
