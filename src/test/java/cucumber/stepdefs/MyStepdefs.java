package cucumber.stepdefs;

import cucumber.Constant.EndPoint;
import cucumber.context.TestContext;
import cucumber.factory.DriverFactory;
import cucumber.objs.Guest;
import cucumber.objs.Product;
import cucumber.pages.CartPage;
import cucumber.pages.CheckOutPage;
import cucumber.pages.StorePage;
import cucumber.utils.ConfigLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyStepdefs {


    private final TestContext context;
    private Guest guest;

    public MyStepdefs(TestContext context){
       this.context = context;
    }

}
