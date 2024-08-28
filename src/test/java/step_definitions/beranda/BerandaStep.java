package step_definitions.beranda;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.beranda.BerandaPage;
import pages.landingPage.LandingPagePage;

import java.io.IOException;

public class BerandaStep {

    WebDriver driver;

    public BerandaStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("On Beranda page, The user check balance account")
    public void checkBalanceAccount(){
        BerandaPage berandaPage = new BerandaPage(driver);
        berandaPage.clickShowHideBalanceIcon();
        BerandaPage.putBalanceAccount();
    }

    @And("The user verify balance is hide")
    public void verifyBalanceIsHide(){
        BerandaPage berandaPage = new BerandaPage(driver);
        Assert.assertTrue(berandaPage.getValueBalance().contains("**********"));
    }

    @And("The user verify balance is show")
    public void verifyBalanceIsShow(){
        BerandaPage berandaPage = new BerandaPage(driver);
        Assert.assertFalse(berandaPage.getValueBalance().contains("**********"));
    }

    @And("On Beranda page, The user click show hide balance icon")
    public void clickShowHideBalanceIcon(){
        BerandaPage berandaPage = new BerandaPage(driver);
        berandaPage.clickShowHideBalanceIcon();
    }

    @And("On Beranda page, The user click {string} button")
    public void clickButtonInBeranda(String button){
        BerandaPage berandaPage = new BerandaPage(driver);
        berandaPage.clickButtonInBeranda(button);
    }

    @And("On Beranda page, The user click {string} menu")
    public void clickMenuInBeranda(String menu){
        BerandaPage berandaPage = new BerandaPage(driver);
        berandaPage.clickMenuInBeranda(menu);
    }

    @And("The user will redirect to Beranda page")
    public void redirectToBerandaPage(){
        BerandaPage berandaPage = new BerandaPage(driver);
        Assert.assertTrue(berandaPage.redirectToBerandaPage());
    }


}
