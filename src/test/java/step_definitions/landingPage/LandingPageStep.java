package step_definitions.landingPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.landingPage.LandingPagePage;

import java.io.IOException;

public class LandingPageStep {

    WebDriver driver;

    public LandingPageStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("On Landing page, The user click {string} button")
    public void clickButtonInLandingPage(String button){
        LandingPagePage landingPagePage = new LandingPagePage(driver);
        landingPagePage.clickButtonInLandingPage(button);
    }


    @Then("The user verify already on Landing Page Simple Bank")
    public void onLandingPage(){
        LandingPagePage landingPagePage = new LandingPagePage(driver);
        Assert.assertTrue(landingPagePage.onLandingPage());
    }

    @When("The user already on Simple Bank Website")
    public void alreadyOpenSimpleBank() throws InterruptedException {
        LandingPagePage landingPagePage = new LandingPagePage(driver);
        Assert.assertEquals(landingPagePage.alreadyOpenSimpleBank(),"https://fsw-frontend-staging.up.railway.app/");
    }

    @Given("The user open Simple Bank Website")
    public void openSimpleBank(){
        System.out.println("Already open Simple Bank Website");
    }


}
