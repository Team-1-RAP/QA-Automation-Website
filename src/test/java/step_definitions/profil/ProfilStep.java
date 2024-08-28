package step_definitions.profil;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.mutasi.MutasiPage;
import pages.profil.ProfilPage;

import java.io.IOException;

public class ProfilStep {

    WebDriver driver;

    public ProfilStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("The user will redirect to Profil page")
    public void redirectToProfilPage(){
        ProfilPage profilPage = new ProfilPage(driver);
        Assert.assertTrue(profilPage.redirectToProfilPage());
    }

}
