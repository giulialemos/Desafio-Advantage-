import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PesquisarProduto {

	private WebDriver driver;
	
	@Quando("clico MENU SEARCH")
	public void clico_menu_search() {
		driver.findElement(By.id("menuSearch")).click();
	}

	@Entao("digito {string} para pesquisa")
	public void digitoParaPesquisa(String string) {
		driver.findElement(By.id("autoComplete")).sendKeys("Headphones");
	}

	@Entao("clicamos em alguma opcao")
	public void clicamosEmAlgumaOpcao() {
		
	}
	
	//@After
	//public void fecharBrowser() {
		//driver.quit();
	//}

}

//////////////////////////////////////////

// @Dado("que estamos na tela inicial")
// public void queEstamosNaTelaInicial() {

// }

// @Quando("clicamos MENU SEARCH")
// public void clicamosMenuSearch() {

// }

// @Entao("digitamos o produto desejado")
// public void digitamosOProdutoDesejado() {

// }

// @Entao("clicamos em alguma opcao")
// public void clicamosEmAlgumaOpcao() {

// }
//}
