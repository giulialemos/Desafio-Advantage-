package br.com.desafio.advange;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteLogin {
	
	@Test
	public void login() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.id("menuUser")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Giulia");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("Keeggo@2021");
		driver.findElement(By.id("sign_in_btnundefined")).click();
		driver.quit();
	}
}
