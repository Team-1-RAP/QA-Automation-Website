package step_definitions.mutasi;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.login.LoginPage;
import pages.mutasi.MutasiPage;

import java.io.IOException;

public class MutasiStep {

    WebDriver driver;

    public MutasiStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("The user will redirect to Mutasi page")
    public void redirectToMutasiPage(){
        MutasiPage mutasiPage = new MutasiPage(driver);
        Assert.assertTrue(mutasiPage.redirectToMutasiPage());
    }

}
