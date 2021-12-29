package cucumber.context;


import cucumber.objs.Cookies;
import cucumber.objs.Guest;
import org.openqa.selenium.WebDriver;

public class TestContext {

    public  WebDriver driver;
    public Guest guest;
    public Cookies cookies;

    public TestContext(){
        cookies = new Cookies();
        cookies.setCookies(new io.restassured.http.Cookies());
    }
}
