package cucumber.stepdefs;

import cucumber.Constant.EndPoint;
import cucumber.context.TestContext;
import cucumber.pages.CheckOutPage;
import cucumber.pages.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckOutStep {

    private final TestContext context;
    private final CheckOutPage checkOutPage;

    public CheckOutStep(TestContext context){

        this.context = context;
        checkOutPage = PageFactory.getCheckoutPage(context.driver);
    }

    @And("I am on the checkout page")
    public void iAmOnTheCheckoutPage() {

        checkOutPage.load(EndPoint.CHECKOUT.url);
    }


    @When("I provide my billing details")
    public void iProvideMyBillingDetails() {

        checkOutPage.setGuest(context.guest);
    }

    @And("I place the order")
    public void iPlaceTheOrder() {

        checkOutPage.placeOrder();
    }

    @Then("the order is placed")
    public void theOrderIsPlaced() {

        String accMsg = "Thank you. Your order has been received.";
        Assert.assertEquals(checkOutPage.orderPlaced(), accMsg);
    }
}
