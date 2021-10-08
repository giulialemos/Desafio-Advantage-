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
		dsl.clicar("menuSearch");
		dsl.escrever("autoComplete", "headphones");
		dsl.clicar("menuSearch");
		Assert.assertEquals("headphones", dsl.obterValorCampo("autoComplete"));
	}
}
