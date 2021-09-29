import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TesteSite {

	@Test
	public void teste() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		driver.quit();
	}
	
	@Test
	public void cadastro() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
		driver.get("http://advantageonlineshopping.com/#/register");
	}
	
	@Test
	public void consultarProduto() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		driver.findElement(By.id("menuSearch")).click();
		driver.findElement(By.id("autoComplete")).sendKeys("headphones");
		driver.findElement(By.id("menuSearch")).click();
		Assert.assertEquals("headphones", driver.findElement(By.id("autoComplete")).getAttribute("value"));
	}
}
