package cucumber.stepdefs;

import cucumber.Constant.EndPoint;
import cucumber.context.TestContext;
import cucumber.objs.Guest;
import cucumber.pages.PageFactory;
import cucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.netty.util.Constant;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;

public class CustomerStep {

    private final TestContext context;
    private final StorePage storePage;

    public CustomerStep(TestContext context){

        this.context = context;
        storePage = PageFactory.getStorePage(context.driver);

    }

    @And("my billing details are")
    public void myBillingDetailsAre(Guest guest) {
        context.guest = guest;
    }

    @Given("I am a guest customer")
    public void iAmAGuestCustomer() {

        storePage.load(EndPoint.STORE.url);
        //new StorePage(context.driver).load(EndPoint.STORE.url);
    }
}
