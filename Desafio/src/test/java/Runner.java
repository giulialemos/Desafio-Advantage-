import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@login",
		plugin = {"pretty","html:target/report-html"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		)

public class Runner {

}

////////////
// Dúvidas: - string no lugar dos nomes e senhas...
//          - se deveria abrir um cucumber para cada testes, pois tive problemas nas execuções
//          - não tive a opção de screenshot, acredito que seja verão do java que esta mais atualizado que o do professor...