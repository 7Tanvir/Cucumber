package cucumber.stepdefs;

import cucumber.context.TestContext;
import cucumber.objs.Guest;

public class MyStepdefs {


    private final TestContext context;
    private Guest guest;

    public MyStepdefs(TestContext context){
       this.context = context;
    }

}
