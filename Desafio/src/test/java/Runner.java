import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		)

public class Runner {

}

//  Não consegui ver necessidade de colocar tag no meu runner e classes, 
//  pois deixei tudo de uma forma bem simples, sem muitas informações específicas.
