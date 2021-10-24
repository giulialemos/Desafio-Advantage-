import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class FazerLogin {

	private WebDriver driver;

	
	@Quando("clico no MENU USER")
	public void clicoNoMenuUser() {
		driver = new FirefoxDriver();
		driver.get("http://advantageonlineshopping.com/#/");
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.id("menuUser")).click();

	}

	@Entao("preencho no username {string}")
	public void preenchoNoUsername(String string) {
		driver.findElement(By.name("username")).sendKeys("string");

	}

	@Entao("depois clicar em SIGN IN")
	public void depoisClicarEmSignIn() {
		driver.findElement(By.id("sign_in_btnundefined")).click();

	}

	@Entao("teremos a conta logada")
	public void teremosAContaLogada() {

	}
	
	@After
	public void fecharBrowser() {
		driver.quit();
	}
}

//////////////////////////////////

// @Quando("clico no MENU USER")
// public void clicoNoMenuUser() {

// }

// @Entao("preencho USERNAME e PASSWORD cadastrados no cenario anterior")
// public void preenchoUsernameEPasswordCadastradosNoCenarioAnterior() {

// }

// @Entao("depois clicar em SIGN IN")
// public void depoisClicarEmSignIn() {

// }

// @Entao("teremos a conta logada")
// public void teremosAContaLogada() {

// }
