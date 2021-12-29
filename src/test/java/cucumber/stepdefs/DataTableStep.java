package cucumber.stepdefs;

import cucumber.objs.Customer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;


public class DataTableStep {

    @DataTableType
    public Customer cust(Map<String, String> entry) {

        return new Customer(entry.get("user"), entry.get("pwd"));
    }

    @Given("My credit")
    public void myCredit(List<Customer> custs) {

        System.out.println(custs.get(0).getUsrname());
        System.out.println(custs.get(0).getPaasword());
    }

}
