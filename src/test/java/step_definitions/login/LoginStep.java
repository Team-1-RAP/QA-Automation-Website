package step_definitions.login;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.login.LoginPage;

import java.io.IOException;

public class LoginStep {

    WebDriver driver;

    public LoginStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @Then("The user will redirect to Login page")
    public void redirectToLoginPage(){
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.redirectToLoginPage());
    }

}
