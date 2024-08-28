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

    @And("The user verify balance in profile is hide")
    public void balanceHide(){
        ProfilPage profilPage = new ProfilPage(driver);
        Assert.assertTrue(profilPage.getBalanceValue().contains("**********"));
    }

    @And("The user verify balance in profile is show")
    public void balanceShow(){
        ProfilPage profilPage = new ProfilPage(driver);
        Assert.assertFalse(profilPage.getBalanceValue().contains("**********"));
    }

    @And("On Profil page, The user click hide balance icon")
    public void clickHideInProfile(){
        ProfilPage profilPage = new ProfilPage(driver);
        profilPage.clickHideInProfile();
    }

    @And("On Profil page, The user click show balance icon")
    public void clickShowHideInProfile(){
        ProfilPage profilPage = new ProfilPage(driver);
        profilPage.clickShowHideInProfile();
    }

    @And("The user will redirect to Profil page")
    public void redirectToProfilPage(){
        ProfilPage profilPage = new ProfilPage(driver);
        Assert.assertTrue(profilPage.redirectToProfilPage());
    }

}
