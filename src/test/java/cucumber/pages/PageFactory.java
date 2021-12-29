package cucumber.pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {

    private static CartPage cartPage;
    private static CheckOutPage checkOutPage;
    private static StorePage storePage;

    public static StorePage getStorePage(WebDriver driver){
        return storePage == null ? new StorePage(driver) : storePage;
    }

    public static CartPage getCartPage(WebDriver driver){
        return cartPage == null ? new CartPage(driver) : cartPage;
    }

    public static CheckOutPage getCheckoutPage(WebDriver driver){
        return checkOutPage == null ? new CheckOutPage(driver) : checkOutPage;
    }
}
