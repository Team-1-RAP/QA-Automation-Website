package step_definitions.login;

import hooks.Hooks;
import io.cucumber.java.en.And;
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

    @And("On Login page, The user click Daftar")
    public void clickDaftar(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickDaftar();
    }

    @And("On Login page, The user click Lupa Password")
    public void clickLupaPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLupaPassword();
    }

    @And("On Login page, The user click Login button")
    public void clickLoginButton(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @And("On Login page, The user input {string} in Password")
    public void inputPassword(String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputPassword(password);
    }

    @And("On Login page, The user input {string} in Username")
    public void inputUsername(String username){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername(username);
    }

    @Then("The user verify login failed")
    public void notRedirectToLoginPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(3000);
        Assert.assertTrue(loginPage.redirectToLoginPage());
    }

    @Then("The user will redirect to Login page")
    public void redirectToLoginPage(){
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.redirectToLoginPage());
    }

}
