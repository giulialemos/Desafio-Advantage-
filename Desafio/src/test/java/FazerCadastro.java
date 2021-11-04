import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FazerCadastro {

	private WebDriver driver;
	
	
	@Dado("que estou na tela inicial")
	public void queEstouNaTelaInicial() {
		driver = new FirefoxDriver();
		driver.get("http://advantageonlineshopping.com/#/");

	}

	@Quando("clico no MENU USER")
	public void clicloNoMenuUser() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.id("menuUser")).click();

	}

	@Entao("depois clico em CREATE NEW ACCOUNT")
	public void depoisClicoEmCreateNewAccount() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("CREATE NEW ACCOUNT")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Entao("na tela de cadastro preencho no usernameregisterpage {string}")
	public void naTelaDeCadastroPreenchoNoUsernameregisterpage(String string) {
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("LuccaLemos");

	}

	@Entao("no emailregisterpage {string}")
	public void noEmailregisterpage(String string) {
		driver.findElement(By.name("emailRegisterPage")).sendKeys("lucca@lemos.com");

	}

	@Entao("na passwordregisterpage {string}")
	public void naPasswordregisterpage(String string) {
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Lucca123");

	}

	@Entao("na confirmpasswordregisterpage {string}")
	public void naConfirmpasswordregisterpage(String string) {
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Lucca123");

	}

	@Entao("clicar no botao I GREE")
	public void clicarNoBotaoIGree() {
		driver.findElement(By.name("i_agree")).click();

	}

	@Entao("depois clicar em REGISTER")
	public void depoisClicarEmRegister() {
		driver.findElement(By.id("register_btnundefined")).click();

	}

	//@After
	//public void fecharBrowser() {
		//driver.quit();
	//}

}



/////////////////////////////////////////////

// @Dado("que estou na tela inicial")
// public void queEstouNaTelaInicial() {

// }

// @Quando("clico no MENU USER e depois em CREATE NEW ACCOUNT")
// public void clicoNoMenuUserEDepoisEmCreateNewAccount() {

// }

// @Entao("na tela de cadastro insiro os dados necessarios")
// public void naTelaDeCadastroInsiroOsDadosNecessarios() {

// }

// @Entao("depois clicar em REGISTRO")
// public void depoisClicarEmRegistro() {

//}
