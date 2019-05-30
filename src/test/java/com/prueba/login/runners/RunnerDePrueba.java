package com.prueba.login.runners;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import co.com.bancolombia.certification.sve.util.customrunner.RunnerPersonalizado;
import co.com.bancolombia.certification.sve.util.exceldata.BeforeSuite;
import co.com.bancolombia.certification.sve.util.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(features = "src/test/resources/features/prueba_login.feature",
		         tags = {"@CasoExitoso" },
		         glue = {"com.prueba.login.stepdefinitions" },
		         snippets = SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)
public class RunnerDePrueba {

	private RunnerDePrueba() {
	}

	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
		DataToFeature.overrideFeatureFiles("./src/test/resources/features/prueba_login.feature");
	}
}