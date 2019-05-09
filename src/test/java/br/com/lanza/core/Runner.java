package br.com.lanza.core;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",  				//deixa bonitinho
		monochrome = true,  				//tira os caracteres especiais, pq ele tira os campos que iriam melhorar a visualizacao
		snippets = SnippetType.CAMELCASE, 	//cria os metodos no camelcase 
		dryRun = false, 					//ele pula todos os testes, ele só verifica se os mapeamentos estao corretos
		strict = true)						//ele passa todos os testes mas mostra que teve um que nao foi implementado ainda
public class Runner {

}
