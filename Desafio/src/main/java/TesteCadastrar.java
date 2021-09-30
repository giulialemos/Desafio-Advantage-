import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteCadastrar {

	@Test
	public void cadastar() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/register");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.id("usernameRegisterPage")).click();
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Giulia");
	}
}
