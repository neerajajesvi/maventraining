package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo {
	@Test
	 public void f() throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\Neeraja Software Testing files\\Softwares\\library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	

}
}
