import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteCadastro {
	@Test
	public void cadastro() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
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
		driver.get("http://advantageonlineshopping.com/#/register");
		
	}
}

