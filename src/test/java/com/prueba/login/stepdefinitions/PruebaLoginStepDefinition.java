package com.prueba.login.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.sve.model.transaction.TransactionConfig;
import co.com.bancolombia.certification.sve.stepdefinitions.authentication.AuthenticationStepDefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class PruebaLoginStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver suNavegador;
	public static Actor sve = Actor.named("SVE");

	@Before
	public void inicializacion() {
		sve.can(BrowseTheWeb.with(suNavegador));
	}

	AuthenticationStepDefinitions autenticacion;

	public PruebaLoginStepDefinition() {
		autenticacion = new AuthenticationStepDefinitions(sve);
	}

	@Given("^SVE client Upload the Transaction Data$")
	public void sveClientUploadTheTransactionData(List<TransactionConfig> data) {
		autenticacion.uploadTheTransactionData("Cliente", data);
	}

	@When("^I authenticate in SVE with nit and user and password$")
	public void iAuthenticateInSVEWithNitAndUserAndPassword(List<String> user) {
		autenticacion.iAuthenticateInSVEWithUsernameAndPassword(user);
	}
}
