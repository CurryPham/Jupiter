package pageObjects.user.jupiterAlpaca;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import pageUIs.nopCommerce.user.LoginPageUI;

public class UserLoginPageObject extends BasePage {
    WebDriver driver;

    public UserLoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public UserLoginPageObject clickToLoginLink() {
        waitForElementClickable(driver, LoginPageUI.LOGIN_LINK);
        clickToElement(driver, LoginPageUI.LOGIN_LINK);
        return new UserLoginPageObject(driver);
    }

    public String getIncorrectMessage() {
        waitForElementVisible(driver, LoginPageUI.INCORRECT_MESSAGE);
        return getElementText(driver, LoginPageUI.INCORRECT_MESSAGE);
    }

    public String getErrorMessage() {
        waitForElementVisible(driver, LoginPageUI.ERROR_MESSAGE);
        return getElementText(driver, LoginPageUI.ERROR_MESSAGE);
    }

    public void inputToEmailTextbox(String emailAdreess) {
        waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAdreess);

    }

    public void inputToEmailTextboxExcel(String textData) {
        waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, textData);
    }

    public UserHomePageObject clickToLoginButton() {
        waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
        return new UserHomePageObject(driver);

    }

    public void inputToPasswordTextboxExcel(String textData) {
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, textData);

    }

    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);

    }

//    public UserHomePageObject loginAsUser(String emailAdreess, String passWord) {
//        inputToEmailTextbox(emailAdreess);
//        inputToPasswordTextbox(passWord);
//        return clickToLoginButton();
//
//    }

    public boolean isConfirmEmailAddressTextboxUndisplayed() {
        waitForElementInUndisplayed(driver, getErrorMessage());
        return false;
    }

}