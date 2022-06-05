package Mindtree.nobroker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test03_profile {
	@Test
	public static void Test3() throws InterruptedException {
		// TODO Auto-generated method stub

		//Open URL in chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		
//Click on sign up
		driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]")).sendKeys("7387456155");
		Thread.sleep(5000);
		driver.findElement(By.id("login-signup-form-login-radio-password")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-signup-form__password-input")).sendKeys("raje6155");
		driver.findElement(By.id("signUpSubmit")).click();
		Thread.sleep(5000);
//show profile page
		driver.findElement(By.xpath("//*[@id=\"profile-icon\"]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"profile-menu-dropdown\"]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("saveProfile")).click();
	}

}
