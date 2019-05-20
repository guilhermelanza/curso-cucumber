package br.com.lanza.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src/test/resources/features/aprender_cucumber.feature",
		features = "src/test/resources/features/alugar_filme.feature",
		glue = "br.com.lanza.steps",
		tags = {},
		plugin = "pretty",  				//deixa bonitinho
		monochrome = true,  				//tira os caracteres especiais, pq ele tira os campos que iriam melhorar a visualizacao
		snippets = SnippetType.CAMELCASE, 	//cria os metodos no camelcase 
		dryRun = false, 					//ele pula todos os testes, ele só verifica se os mapeamentos estao corretos
		strict = true)						//ele passa todos os testes mas mostra que teve um que nao foi implementado ainda
public class Runner {

}
