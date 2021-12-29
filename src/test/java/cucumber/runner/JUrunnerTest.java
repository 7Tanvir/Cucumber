//
//package cucumber.runner;
//
//import io.cucumber.java.Before;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html", "summary"},
//        //tags = "@guest or @feature",
//        snippets = CucumberOptions.SnippetType.CAMELCASE,
//        monochrome = false,
//        glue = {"cucumber.stepdefs", "cucumber.hooks", "cucumber.types", "cucumber.objs"},
//        //glue = {"cucumber"},
//        features = "src/test/resources/cucumber"
//)
//
//public class JUrunnerTest {
//
////    @BeforeClass
////    public static void BeforeClass(){
////        System.out.println("\nON before Class\n");
////    }
////
////    @AfterClass
////    public static void AfterClass(){
////        System.out.println("\nON After Class\n");
////    }
//}
