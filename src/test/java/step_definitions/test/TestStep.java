package step_definitions.test;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.test.TestPage;

import java.io.IOException;

public class TestStep {

    WebDriver driver;
    public TestStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @Given("Test start")
    public void testStart() throws IOException {
        System.out.println("Test start");
    }

    @When("Test process")
    public void testProcess() throws IOException {
        System.out.println("Test process");
    }

    @And("Test done")
    public void testDone() throws IOException {
        TestPage testPage = new TestPage(driver);
        testPage.doneTesting();
        System.out.println("Test done");
    }

}
