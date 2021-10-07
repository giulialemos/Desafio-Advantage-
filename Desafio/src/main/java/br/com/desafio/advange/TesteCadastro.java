package br.com.desafio.advange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteCadastro {
	
private WebDriver driver;
	
	@Before
	public void inicializar() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}
	
	@Test
	public void cadastro() throws InterruptedException {
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
		driver.findElement(By.name("usernameRegisterPage")).click();
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Giulia");
		driver.findElement(By.name("emailRegisterPage")).click();
		driver.findElement(By.name("emailRegisterPage")).sendKeys("giulia.lemos@keeggo.com");
		driver.findElement(By.name("passwordRegisterPage")).click();
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Keeggo@2021");
		driver.findElement(By.name("confirm_passwordRegisterPage")).click();
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Keeggo@2021");
		driver.findElement(By.name("i_agree")).click();
		driver.findElement(By.id("register_btnundefined")).click();
	}
}

