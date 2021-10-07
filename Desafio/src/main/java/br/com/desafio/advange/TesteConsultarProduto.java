package br.com.desafio.advange;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteConsultarProduto {
	
	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializar() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		dsl = new DSL(driver);
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}

	@Test
	public void consultarProduto() {
		driver.findElement(By.id("menuSearch")).click();
		driver.findElement(By.id("autoComplete")).sendKeys("headphones");
		driver.findElement(By.id("menuSearch")).click();
		Assert.assertEquals("headphones", driver.findElement(By.id("autoComplete")).getAttribute("value"));
		driver.quit();
	}
}
