package br.com.desafio.advange;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteLogin {

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
	public void login() {
		dsl.clicar("menuUser");
		dsl.clicar("menuUser");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dsl.clicarName("username");
		dsl.escreverName("username", "Vanusia");
		dsl.clicarName("password");
		dsl.escreverName("password", "Vavu123");
		dsl.clicar("sign_in_btnundefined");
	}
}
