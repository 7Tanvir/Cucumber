package cucumber.pages;

import cucumber.objs.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage{

    @FindBy(css = "a[title='View cart']") private WebElement viewCart;

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public void addTocart(Product product) {

        By addToCartB = By.cssSelector("a[aria-label='Add “"+ product.getName() +"” to your cart']");
        wait.until(ExpectedConditions.elementToBeClickable(addToCartB)).click();
        wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
    }

}
