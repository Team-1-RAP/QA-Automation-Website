package step_definitions.registrasi;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.login.LoginPage;
import pages.registrasi.RegistrasiPage;

import java.io.IOException;

public class RegistrasiStep {

    WebDriver driver;

    public RegistrasiStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @Then("The user will redirect to Tab Verifikasi Email")
    public void redirectToTabVerifikasiEmail(){
        RegistrasiPage registrasiPage = new RegistrasiPage(driver);
        Assert.assertTrue(registrasiPage.redirectToTabVerifikasiEmail());
    }

    @And("On Tab Registrasi Akun, The user click {string} button")
    public void clickButton(String button){
        RegistrasiPage registrasiPage = new RegistrasiPage(driver);
        registrasiPage.clickButton(button);
    }

    @And("On Tab Registrasi Akun, The user input {string} in confirm password")
    public void inputConfirmPassword(String confitmPassword){
        RegistrasiPage registrasiPage = new RegistrasiPage(driver);
        registrasiPage.inputConfirmPassword(confitmPassword);
    }

    @And("On Tab Registrasi Akun, The user input {string} in password")
    public void inputPassword(String password){
        RegistrasiPage registrasiPage = new RegistrasiPage(driver);
        registrasiPage.inputPassword(password);
    }

    @And("On Tab Registrasi Akun, The user input {string} in username")
    public void inputUsername(String username){
        RegistrasiPage registrasiPage = new RegistrasiPage(driver);
        registrasiPage.inputUsername(username);
    }

    @And("On Tab Registrasi Akun, The user input {string} in email")
    public void inputEmail(String email){
        RegistrasiPage registrasiPage = new RegistrasiPage(driver);
        registrasiPage.inputEmail(email);
    }

    @Then("The user will redirect to Register page")
    public void redirectToRegisterPage(){
        RegistrasiPage registrasiPage = new RegistrasiPage(driver);
        Assert.assertTrue(registrasiPage.redirectToRegisterPage());
    }

}
