package step_definitions.logout;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.mutasi.MutasiPage;

import java.io.IOException;

public class LogoutStep {

    WebDriver driver;

    public LogoutStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("The user will redirect to Logout page")
    public void redirectToMutasiPage(){
        MutasiPage mutasiPage = new MutasiPage(driver);
        Assert.assertTrue(mutasiPage.redirectToMutasiPage());
    }

}
