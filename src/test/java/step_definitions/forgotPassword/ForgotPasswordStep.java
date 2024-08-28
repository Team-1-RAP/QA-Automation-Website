package step_definitions.forgotPassword;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.velocity.runtime.directive.contrib.For;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.forgotPassword.ForgotPasswordPage;
import pages.login.LoginPage;

import java.io.IOException;

public class ForgotPasswordStep {

    WebDriver driver;

    public ForgotPasswordStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("The user will redirect to Lupa Password page")
    public void redirectToLupaPasswordPage(){
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        Assert.assertTrue(forgotPasswordPage.redirectToLupaPasswordPage());
    }

}
