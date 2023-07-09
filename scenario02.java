package package02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class scenario02 {

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
	        driver.findElement(By.linkText("Women")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Tops")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("CATEGORY")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Jackets")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("color")).click();
	        Thread.sleep(2000);
	       
	        //close the browser
			driver.quit();
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
