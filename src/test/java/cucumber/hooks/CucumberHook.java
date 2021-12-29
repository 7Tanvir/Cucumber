package cucumber.hooks;

import cucumber.context.TestContext;
import cucumber.factory.DriverFactory;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class CucumberHook {

    private WebDriver driver;
    private final TestContext context;


    public CucumberHook(TestContext context){
      this.context = context;
    }

    @Before
    public void before(Scenario scenario){

        System.out.println("BEFORE: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver = DriverFactory.initWebDriver(System.getProperty("browser", "chrome"));
        context.driver = driver;
        //context.driver = driver;
    }

    @After
    public void after(Scenario scenario){
        System.out.println("AFTER: THREAD ID : " + Thread.currentThread().getId() + "," +
                "SCENARIO NAME: " + scenario.getName());
        driver.quit();
    }

//    @BeforeAll
//    public static void BeforeAll () {
//        System.out.println("\nIN before all hook\n");
//    }
//
//    @AfterAll
//    public static void AfterAll () {
//        System.out.println("\nIN After all hook\n");
//    }
}
