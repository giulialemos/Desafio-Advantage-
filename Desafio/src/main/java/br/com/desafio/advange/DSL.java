package br.com.desafio.advange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;

	}

	public void escrever(String id_campo, String textoid) {
		driver.findElement(By.id(id_campo)).sendKeys(textoid);

	}

	public String obterValorCampo(String id_campo) {
		return driver.findElement(By.id(id_campo)).getAttribute("value");

	}

	public void clicar(String id) {
		driver.findElement(By.id(id)).click();

	}

	public void clicarName(String name) {
		driver.findElement(By.name(name)).click();

	}

	public void escreverName(String name_campo, String textoname) {
		driver.findElement(By.name(name_campo)).sendKeys(textoname);

	}

	public void clicarLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();

	}

}
