package cucumber.types;

import cucumber.objs.Product;
import io.cucumber.java.ParameterType;

public class ParaType {

    @ParameterType(".*")
    public Product product(String name) {
        return new Product(name);
    }
}
