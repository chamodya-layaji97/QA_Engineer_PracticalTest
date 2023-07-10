package package01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario01 {

	public static void main(String[] args) {
       try { 
			
			//Create an instance of the WebDriver for chosen browser
			System.setProperty("webdriver.chrome.driver", "D:\\Elipes practical\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//maximize the current web page windows
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//senario_01
			
			driver.get("https://www.google.com/");
			
			//step1:Navigate to the home page
			driver.navigate().to("https://magento.softwaretestingboard.com/");
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			//step2: Put any search term in the search bar
			driver.findElement(By.id("search")).sendKeys("tops for men");
			Thread.sleep(2000);
			
			//search option 
			driver.findElement(By.xpath("//input[@id='search']")).click();
			
			//close the browser
			driver.quit();
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

	private static Object ActionChains(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
