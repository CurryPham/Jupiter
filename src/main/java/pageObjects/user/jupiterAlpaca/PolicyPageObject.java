package pageObjects.user.jupiterAlpaca;

import commons.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.nopCommerce.user.PolicyPageUI;
import pageUIs.nopCommerce.user.QuotePageUI;

public class PolicyPageObject extends BasePage {

    private WebDriver driver;

    public PolicyPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public String verifyReleasePolicySuccess() {
        waitForElementInVisible(driver, PolicyPageUI.LOADING_PAGE);
        waitForElementInVisible(driver, PolicyPageUI.LOADING_PAGE);
        waitForElementVisible(driver, PolicyPageUI.VERIFY_RELEASE_POLICY_SUCCESS);
        return getElementText(driver, PolicyPageUI.VERIFY_RELEASE_POLICY_SUCCESS);
    }

    public SDBSPageObject clickToCreateNewSDBS() {
        waitForElementInVisible(driver, PolicyPageUI.LOADING_PAGE);
        waitForElementInVisible(driver, PolicyPageUI.LOADING_PAGE);
        waitForElementClickable(driver, PolicyPageUI.CLICK_TO_CREATE_NEW_SDBS);
        clickToElement(driver, PolicyPageUI.CLICK_TO_CREATE_NEW_SDBS);
        return PageGeneratorManager.getPageGeneratorManager().getSDBSPage(driver);
    }
}