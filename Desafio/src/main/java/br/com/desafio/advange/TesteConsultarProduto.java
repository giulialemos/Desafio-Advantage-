package br.com.desafio.advange;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		dsl.clicar("menuSearch");
		dsl.escrever("autoComplete", "headphones");
		dsl.clicar("menuSearch");
		Assert.assertEquals("headphones", dsl.obterValorCampo("autoComplete"));

		// dsl.clicar("2200");

		// dsl.clicarLink("View All");
		// dsl.clicarLink("Beats Studio 2 Over-Ear Matte Black Headphones");

		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='BEATS
		// STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES']")));
		// driver.findElement(By.xpath("//p[normalize-space()='BEATS STUDIO 2 OVER-EAR
		// MATTE BLACK HEADPHONES']")).click();

	}
}