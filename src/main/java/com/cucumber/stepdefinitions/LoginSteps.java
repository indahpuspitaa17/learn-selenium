package com.cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

  @Given("Admin opens PKKM Dikti Kemendikbud page")
  public void adminOpensPKKMDiktiKemendikbudPage() {
  }

  @And("^Admin verifies direct to Beranda page$")
  public void adminVerifiesDirectToBerandaPage() {

  }

  @When("^Admin clicks Masuk button on navbar$")
  public void adminClicksMasukButtonOnNavbar() {

  }

  @Then("^Admin verifies redirect to Masuk page$")
  public void adminVerifiesRedirectToMasukPage() {

  }

  @When("^Admin clicks Masuk button$")
  public void adminClicksMasukButton() {
  }

  @When("Admin inputs password {string}")
  public void adminInputsPassword(String password) {
  }

  @When("Admin inputs username {string}")
  public void adminInputsUsername(String username) {
  }
}
