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

//import junit.framework.Assert;

public class TesteCadastro {

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
	public void cadastro() throws InterruptedException {
		dsl.clicar("menuUser");
		dsl.clicar("menuUser");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CREATE NEW ACCOUNT")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dsl.clicarLink("CREATE NEW ACCOUNT");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dsl.clicarName("usernameRegisterPage");
		dsl.escreverName("usernameRegisterPage", "Francisco");
		dsl.clicarName("emailRegisterPage");
		dsl.escreverName("emailRegisterPage", "chico@lemos.com");
		dsl.clicarName("passwordRegisterPage");
		dsl.escreverName("passwordRegisterPage", "Chico123");
		dsl.clicarName("confirm_passwordRegisterPage");
		dsl.escreverName("confirm_passwordRegisterPage", "Chico123");
		dsl.clicarName("i_agree");
		dsl.clicar("register_btnundefined");

		// Assert.assertEquals("Francisco", dsl.obterValorCampo("menuUserLink"));
		

	}
}
