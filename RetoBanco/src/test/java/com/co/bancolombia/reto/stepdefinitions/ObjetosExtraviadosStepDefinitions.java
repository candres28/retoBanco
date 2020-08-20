package com.co.bancolombia.reto.stepdefinitions;

import com.co.bancolombia.reto.questions.Visible;
import com.co.bancolombia.reto.tasks.OptionObjetos;
import com.co.bancolombia.reto.tasks.SelectPoliticas;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.co.bancolombia.reto.userinterfaces.ObjetosPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ObjetosExtraviadosStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that the user is on the main page$")
    public void thatTheUserIsOnTheMainPage() {
        OnStage.theActorCalled("User").wasAbleTo(Open.url("http://www.tocumenpanama.aero/"));
    }

    @When("^in the page traveler information$")
    public void inThePageTravelerInformation() {
       OnStage.theActorInTheSpotlight().attemptsTo(OptionObjetos.extraviados());
    }

    @When("^download policy PDF$")
    public void downloadPolicyPDF() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectPoliticas.downoloadPdf());
    }

    @Then("^verify existence of the download button$")
    public void verifyExistenceOfTheDownloadButton() {
        OnStage.theActorInTheSpotlight().should(seeThat(Visible.isOn(PDF_OBJETOS)));
    }

    @Then("^in the pdf you should see the title of (.*)$")
    public void inThePdfYouShouldSeeTheTitle(String message) {

    }
}
