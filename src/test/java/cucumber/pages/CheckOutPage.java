package cucumber.pages;

import cucumber.objs.Guest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BasePage {

    @FindBy(id = "billing_first_name")
    private WebElement fnamefld;
    @FindBy(id = "billing_last_name")
    private WebElement lnamefld;
    @FindBy(id = "billing_country")
    private WebElement countryfld;
    @FindBy(id = "billing_address_1")
    private WebElement addressfld;
    @FindBy(id = "billing_city")
    private WebElement cityfld;
    @FindBy(id = "billing_state")
    private WebElement statefld;
    @FindBy(id = "billing_postcode")
    private WebElement zipfld;
    @FindBy(id = "billing_email")
    private WebElement emailfld;
    @FindBy(id = "place_order") private WebElement placeOrderfld;
    @FindBy(css = ".woocommerce-notice") private WebElement orderplaced;

    @FindBy(id = "select2-billing_state-container") private WebElement alternateBillState;
    @FindBy(id = "select2-billing_country-container") private WebElement alternateBillCountry;
    private final By overlay = By.cssSelector(".blockUI.blockOverlay");

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public CheckOutPage setFname(String fname) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(fnamefld));
        e.clear();
        e.sendKeys(fname);
        return this;
    }

    public CheckOutPage setLname(String lname) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(lnamefld));
        e.clear();
        e.sendKeys(lname);
        return this;
    }

    public CheckOutPage setCounty(String country) {

        wait.until(ExpectedConditions.elementToBeClickable(alternateBillCountry)).click();
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[text()='" + country + "']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
        e.click();

        //Select selCountry = new Select(wait.until(ExpectedConditions.visibilityOf(countryfld)));
        //selCountry.selectByVisibleText(country);
        return this;
    }

    public CheckOutPage setState(String state) {

        wait.until(ExpectedConditions.elementToBeClickable(alternateBillState)).click();
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[text()='" + state + "']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
        e.click();

        //Select selectState = new Select(wait.until(ExpectedConditions.visibilityOf(statefld)));
        //selectState.selectByVisibleText(state);
        return this;
    }

    public CheckOutPage setAddress(String address) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(addressfld));
        e.clear();
        e.sendKeys(address);
        return this;
    }

    public CheckOutPage setCity(String city) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(cityfld));
        e.clear();
        e.sendKeys(city);
        return this;
    }

    public CheckOutPage setZip(String zip) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(zipfld));
        e.clear();
        e.sendKeys(zip);
        return this;
    }

    public CheckOutPage setEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(emailfld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    public CheckOutPage setGuest(Guest guest) {
        return setFname(guest.getFname()).
                setLname(guest.getLname()).
                setCounty(guest.getCountry()).
                setAddress(guest.getAddress()).
                setCity(guest.getCity()).
                setState(guest.getState()).
                setZip(guest.getZip()).
                setEmail(guest.getEmail());
    }
    public CheckOutPage placeOrder(){
       waitForOverlaysToDisappear(overlay);
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderfld)).click();
        return this;
    }
    public String orderPlaced(){
        return wait.until(ExpectedConditions.visibilityOf(orderplaced)).getText();
    }
}
