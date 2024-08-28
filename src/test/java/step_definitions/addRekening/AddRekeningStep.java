package step_definitions.addRekening;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.addRekening.AddRekeningPage;
import pages.registrasi.RegistrasiPage;

import java.io.IOException;

public class AddRekeningStep {

    WebDriver driver;

    public AddRekeningStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }


    @Then("The user will redirect to Tambah Rekening page")
    public void redirectToTambahRekeningPage(){
        AddRekeningPage addRekeningPage = new AddRekeningPage(driver);
        Assert.assertTrue(addRekeningPage.redirectToTambahRekeningPage());
    }

}
