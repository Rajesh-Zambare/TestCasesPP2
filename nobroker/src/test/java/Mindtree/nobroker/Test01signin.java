package Mindtree.nobroker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01signin {
	@Test
	public static void Test1() throws InterruptedException {
		// TODO Auto-generated method stub

		//open url in chrome		
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.nobroker.in/");
				Thread.sleep(4000);
			// click on sign in 
				driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[1]/div")).click();
			//enter credentials
				driver.findElement(By.id("signUp-phoneNumber")).click();
				driver.findElement(By.id("signUp-phoneNumber")).sendKeys("7387456155");
				
				driver.findElement(By.id("login-signup-form-login-radio-password")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("login-signup-form__password-input")).sendKeys("raje6155");
				driver.findElement(By.id("signUpSubmit")).click();
	}

}
