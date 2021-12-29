package cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{

    @FindBy(css = "td[class='product-name") private WebElement prodNameFld;
    @FindBy(css = "input[type=\"number\"]") private WebElement qtyFld;
    @FindBy(css = ".checkout-button") private WebElement checkOut;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProdName() {
        return wait.until(ExpectedConditions.visibilityOf(prodNameFld)).getText();
    }

    public String getQty() {
        return wait.until(ExpectedConditions.visibilityOf(qtyFld)).getAttribute("value");
    }

    public void setCheckOut (){
        wait.until(ExpectedConditions.elementToBeClickable(checkOut)).click();
    }
}
