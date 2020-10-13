import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class StepDefs {

    @Given("I navigate to the url {string}")
    public void i_navigate_to_the_url(String Url) {
        BaseTestHooks.homePage.naviagteToUrl(Url);
    }

    @Then("i should navigate to the home page")
    public void i_should_navigate_to_the_home_page() {
        System.out.println("Home Page title is :"+ BaseTestHooks.getpagetitle());
    }

    @When("I enter the emailId and click next button")
    public void iEnterTheEmailIdAndClickNextButton() throws InterruptedException {
        String email = "redspireglasgow@gmail.com";
        BaseTestHooks.homePage.enterEmailId(email);
        Thread.sleep(2500);
    }

    @When("I enter the password and click next button")
    public void iEnterThePasswordAndClickNextButton() {
        String password = "Test1234@";
        BaseTestHooks.homePage.enterPassword(password);
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
        System.out.println("Closing the browser");
    }
}
