package pageObjects.user.jupiterAlpaca;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.nopCommerce.user.HomePageUI;

public class UserHomePageObject extends BasePage {
    private WebDriver driver;

    public UserHomePageObject(WebDriver driver) {
        this.driver = driver;
    }



    @Step("Navigate to Quote page")
    public QuotePageObject clickToQuote(WebDriver driver) {
        waitForElementClickable(driver, HomePageUI.MENU_LINK);
        clickToElement(driver, HomePageUI.MENU_LINK);
        waitForElementClickable(driver, HomePageUI.QUOTE_LINK);
        clickToElement(driver, HomePageUI.QUOTE_LINK);
        return PageGeneratorManager.getPageGeneratorManager().getQuotePage(driver);
    }

    @Step("Verify Login success")
    public String getSuccessLogin() {
        waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
        return getElementText(driver, HomePageUI.MY_ACCOUNT_LINK);
    }

    @Step("Navigate to Login page")
    public UserLoginPageObject openLoginPage() {
        clickToElement(driver, HomePageUI.LOGIN_LINK);
        return PageGeneratorManager.getPageGeneratorManager().getUserLoginPage(driver);
    }

    @Step("Navigate to Customer infor page")
    public UserCustomerInforPageObject clickToCustomerInfor() {
        clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
        return PageGeneratorManager.getPageGeneratorManager().getUserCustomerInforPage(driver);
    }

}