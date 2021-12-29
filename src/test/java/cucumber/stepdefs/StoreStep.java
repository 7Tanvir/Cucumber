package cucumber.stepdefs;

import cucumber.Constant.EndPoint;
import cucumber.apis.CartApi;
import cucumber.context.TestContext;
import cucumber.objs.Product;
import cucumber.pages.PageFactory;
import cucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StoreStep {

    private final StorePage storePage;
    private final TestContext context;

    public StoreStep(TestContext context) {
        this.context = context;
        storePage = PageFactory.getStorePage(context.driver);
    }

    @Given("I am on the Store page")
    public void iAmOnTheStorePpage() {

        storePage.load(EndPoint.STORE.url);
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product) {

        storePage.addTocart(product);


    }

    @And("I have a {product} in the cart")
    public void iHaveAInTheCart(Product product) {

        storePage.addTocart(product);
        CartApi cartApi = new CartApi(context.cookies.getCookies());
        cartApi.addToCart(1215, 1);
        context.cookies.setCookies(cartApi.getCookies());
        context.cookies.injectCookiesToBrowser(context.driver);
    }
}