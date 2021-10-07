package br.com.desafio.advange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}



	public void escrever(String id_campo, String texto) {
		
		//click
		driver.findElement(By.id(id_campo)).sendKeys(texto);

	}
}
