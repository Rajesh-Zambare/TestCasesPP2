package Mindtree.nobroker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test02login {
	@Test
	public static void Test2() throws InterruptedException {
		// TODO Auto-generated method stub

		//Open URL in chrome
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.nobroker.in/");
				
			//Click on log in
				driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]/div")).click();
				driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("7387456155");
				
				Thread.sleep(5000);
				driver.findElement(By.id("login-signup-form-login-radio-password")).click();
				driver.findElement(By.id("login-signup-form__password-input")).sendKeys("raje6155");
				driver.findElement(By.id("signUpSubmit")).click();
				
	}

}
