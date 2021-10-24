import io.cucumber.java.After;
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

	@Quando("clico no MENU USER e depois em CREATE NEW ACCOUNT")
	public void clicoNoMenuUserEDepoisEmCreateNewAccount() {
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.id("menuUser")).click();
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

	@Entao("na tela de cadastro insiro no username {string}")
	public void naTelaDeCadastroPreenchoNoUsername(String string) {
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("string");

	}

	@Entao("no email {string}")
	public void noEmail(String string) {
		driver.findElement(By.name("emailRegisterPage")).sendKeys("string");

	}

	@Entao("na password {string}")
	public void naPassword(String string) {
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("string");

	}

	@Entao("na confirm password {string}")
	public void naConfirmPassword(String string) {
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("string");

	}

	@Entao("clicar no botao I GREE")
	public void clicarNoBotaoIGree() {
		driver.findElement(By.name("i_agree")).click();

	}

	@Entao("depois clicar em REGISTER")
	public void depoisClicarEmRegister() {
		driver.findElement(By.id("register_btnundefined")).click();

	}

	@After
	public void fecharBrowser() {
		driver.quit();
	}
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
