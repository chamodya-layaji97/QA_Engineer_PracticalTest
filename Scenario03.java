package package03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario03 {

	public static void main(String[] args) {
		 try { 
				
				//Create an instance of the WebDriver for chosen browser
				System.setProperty("webdriver.chrome.driver", "D:\\Elipes practical\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//maximize the current web page windows
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				//senario_02
				
				//open chrome browser
				driver.get("https://www.google.com/");
				
				//step1:Navigate to the home page
				driver.navigate().to("https://magento.softwaretestingboard.com/");
		        Thread.sleep(4000);
		        driver.findElement(By.linkText("Gear")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.linkText("Shop")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.linkText("Add to Cart")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.linkText("Jcounter-number")).click();
		        Thread.sleep(2000);
		        
		        //close the browser
				driver.quit();
				
				
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}
