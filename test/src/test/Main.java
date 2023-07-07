package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		try { 
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\Elipes practical\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//maximize the current web page windows
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://www.google.com/");
			driver.navigate().to("https://www.amazon.com/");
			Thread.sleep(4000);
			System.out.println(driver.getTitle());
			//driver.findElement(By.id("u_0_b_R2")).sendKeys("chamodya@gmail.com");
			//Thread.sleep(2000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Electronics");
			//click search button
			//Thread.sleep(4000);
			driver.findElement(By.id("nav-search-submit-button")).click();
			//driver.findElement(By.id("nav-input")).click();
			Thread.sleep(4000);
			//driver.findElement(By.linkText("Water-Resistant")).click();
			//driver.findElement(By.linkText("a-size-base a-color-base")).click();
			driver.findElement(By.linkText("Computers & Accessories")).click();
			Thread.sleep(4000);
			driver.navigate().to("https://www.mindluster.com/certified/cat/5");
			Thread.sleep(4000);
			driver.navigate().to("https://www.mindluster.com/login");
			//driver.navigate().back();
			//Thread.sleep(4000);
			//close the browser
			//driver.quit();
			//driver.findElement(By.linkText("Sign up")).click();
			//driver.findElement(By.xpath("//input [@name=''name]")).sendKeys("Edureka");
			//driver.findElement(By.name("phone_number")).sendKeys("9856123123");
			
			//Webelement day1 = driver.findElement(By.id(""));
			
			//WebElement username=driver.findElement(By.id(""));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
