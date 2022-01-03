package cucumber.stepdefs;

import cucumber.context.TestContext;
import cucumber.objs.Product;
import cucumber.pages.CartPage;
import cucumber.pages.PageFactory;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartStep {

    private final CartPage cartPage;

    public CartStep(TestContext context){

        cartPage = PageFactory.getCartPage(context.driver);
    }

    @Then("I see {int} of {product} in the cart")
    public void iSeeOfInTheCart(Integer q, Product product) {

        Assert.assertEquals(q.toString(), cartPage.getQty());
        Assert.assertEquals(product.getName(), cartPage.getProdName());
    }
}

