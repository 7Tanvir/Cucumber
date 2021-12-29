package cucumber.types;

import cucumber.objs.Guest;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomType {

    @DataTableType
    public Guest guest(Map<String, String> entry) {

        return new Guest(entry.get("Fname"), entry.get("Lname"),
                entry.get("Country"), entry.get("Address"), entry.get("City"), entry.get("State"), entry.get("Zip"), entry.get("Email"));
    }
}
