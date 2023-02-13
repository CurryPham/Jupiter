package pageObjects.user.jupiterAlpaca;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.nopCommerce.commons.CommonPageUI;
import pageUIs.nopCommerce.user.PolicyPageUI;
import pageUIs.nopCommerce.user.SDBSPageUI;
import pageUIs.nopCommerce.user.SDBSPageUI;

public class SDBSPageObject extends BasePage {

    private WebDriver driver;

    public SDBSPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public void clickToCreateSDBSButton() {
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementVisible(driver, SDBSPageUI.CLICK_TO_SUBMIT_CREATE_CREATE);
        waitForElementClickable(driver, SDBSPageUI.CLICK_TO_SUBMIT_CREATE_CREATE);
        clickToElement(driver, SDBSPageUI.CLICK_TO_SUBMIT_CREATE_CREATE);
    }

    public void selectDropdownKindOfSDBS(WebDriver driver, String dataKindOfSDBS) {
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementVisible(driver, SDBSPageUI.CLICK_TO_DROPDOWN_KIND_ÒF_SDBS);
        waitForElementClickable(driver, SDBSPageUI.CLICK_TO_DROPDOWN_KIND_ÒF_SDBS);
        clickToElement(driver, SDBSPageUI.CLICK_TO_DROPDOWN_KIND_ÒF_SDBS);
        waitForElementVisible(driver, SDBSPageUI.SELECT_DROPDOWN_KIND_OF_SDBS, dataKindOfSDBS);
        waitForElementClickable(driver, SDBSPageUI.SELECT_DROPDOWN_KIND_OF_SDBS, dataKindOfSDBS);
        clickToElement(driver, SDBSPageUI.SELECT_DROPDOWN_KIND_OF_SDBS, dataKindOfSDBS);
    }

    public void selectDropdownTypeOfSDBS(WebDriver driver, String dataTypeOfSDBS) {
        waitForElementClickable(driver, SDBSPageUI.CLICK_TO_DROPDOWN_TYPE_OF_SDBS);
        clickToElement(driver, SDBSPageUI.CLICK_TO_DROPDOWN_TYPE_OF_SDBS);
        waitForElementVisible(driver, SDBSPageUI.SELECT_DROPDOWN_TYPE_OF_SDBS, dataTypeOfSDBS);
        waitForElementClickable(driver, SDBSPageUI.SELECT_DROPDOWN_TYPE_OF_SDBS, dataTypeOfSDBS);
        clickToElement(driver, SDBSPageUI.SELECT_DROPDOWN_TYPE_OF_SDBS, dataTypeOfSDBS);
    }

    public void clickToSubmitCreateButton() {
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementClickable(driver, SDBSPageUI.CLICK_CONFIRM_CREATE_SDBS);
        clickToElement(driver, SDBSPageUI.CLICK_CONFIRM_CREATE_SDBS);
    }

    public String verifyCreateSDBS() {
        waitForElementVisible(driver, SDBSPageUI.VERIFY_CREATE_SDBS);
        return getElementText(driver, SDBSPageUI.VERIFY_CREATE_SDBS);
    }

    public void clickToConfirmCreateSDBS() {
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementVisible(driver, CommonPageUI.CREATE_BUTTON);
        waitForElementClickable(driver, CommonPageUI.CREATE_BUTTON);
        clickToElement(driver, CommonPageUI.CREATE_BUTTON);
    }

    public String verifyMessageSDBS() {
        waitForElementVisible(driver, SDBSPageUI.MESSAGE_INCREASE_SDBS);
        return getElementText(driver, SDBSPageUI.MESSAGE_INCREASE_SDBS);
    }

    public void clickToInsuredPerson() {
        waitForElementInVisible(driver,SDBSPageUI.LOADING_PAGE);
        waitForElementClickable(driver, SDBSPageUI.CLICK_TO_INSURED_PERSON);
        clickToElement(driver, SDBSPageUI.CLICK_TO_INSURED_PERSON);
    }

    public void clickToCreateNewInsuredPerson() {
        waitForElementInVisible(driver,SDBSPageUI.LOADING_PAGE);
        waitForElementClickable(driver, SDBSPageUI.CLICK_TO_CREATE_NEW_INSURED_PERSION);
        clickToElement(driver, SDBSPageUI.CLICK_TO_CREATE_NEW_INSURED_PERSION);
        waitForElementVisible(driver, SDBSPageUI.CREATE_INSURED_PERSON);
    }

    public void inputFullName(WebDriver driver, String fullName) {
        waitForElementVisible(driver, SDBSPageUI.INPUT_FULL_NAME);
        sendkeyToElement(driver, SDBSPageUI.INPUT_FULL_NAME, fullName);
    }

    public void inputBirth(WebDriver driver, String birth) {
        waitForElementVisible(driver, SDBSPageUI.INPUT_BIRTH);
        sendkeyAndSubmitToElement(driver, SDBSPageUI.INPUT_BIRTH, birth);
    }

    public void selectDropdownListSex(WebDriver driver, String value) {
        waitForElementClickable(driver, SDBSPageUI.SELECT_DROPDOWN_LIST_SEX);
        clickToElement(driver, SDBSPageUI.SELECT_DROPDOWN_LIST_SEX);
        waitForElementVisible(driver, SDBSPageUI.DATA_SELECT_DROPDOWN_LIST_SEX, value);
        clickToElement(driver, SDBSPageUI.DATA_SELECT_DROPDOWN_LIST_SEX, value);
    }

    public void selectDropdownIdentifierType(WebDriver driver) {
        waitForElementClickable(driver, SDBSPageUI.SELECT_DROPDOWN_TYPE);
        clickToElement(driver, SDBSPageUI.SELECT_DROPDOWN_TYPE);
        waitForElementVisible(driver, SDBSPageUI.DATA_SELECT_DROPDOWN_TYPE);
        clickToElement(driver, SDBSPageUI.DATA_SELECT_DROPDOWN_TYPE);
    }

    public void inputIdentifierNumber(WebDriver driver, String identifierNumber) {
        sendkeyToElement(driver, SDBSPageUI.INPUT_IDENTIFIER_NUMBER, identifierNumber);
    }

    public void clickToMoveInsuranceBenefits() {
        waitForElementClickable(driver, SDBSPageUI.CLICK_TO_MOVE_INSURANCE_BENEFITS);
        clickToElement(driver, SDBSPageUI.CLICK_TO_MOVE_INSURANCE_BENEFITS);

    }

    public void clickToInsuranceBenefitsA() {
        clickToElementByJS(driver, SDBSPageUI.CLICK_TO_INSURANCE_BENEFITS_A);

    }

    public void inputLevelOfResponsibilityA(WebDriver driver, String levelOfResponsibility) {
        waitForElementVisible(driver, SDBSPageUI.INPUT_LEVEL_OF_RESPONSIBILITY_A);
        sendkeyToElement(driver, SDBSPageUI.INPUT_LEVEL_OF_RESPONSIBILITY_A, levelOfResponsibility);
    }

    public void clickToInsuranceBenefitsB() {
        clickToElementByJS(driver, SDBSPageUI.CLICK_TO_INSURANCE_BENEFITS_B);
    }

    public void inputLevelOfResponsibilityB(WebDriver driver, String levelOfResponsibility) {
        waitForElementVisible(driver, SDBSPageUI.INPUT_LEVEL_OF_RESPONSIBILITY_B);
        sendkeyToElement(driver, SDBSPageUI.INPUT_LEVEL_OF_RESPONSIBILITY_B, levelOfResponsibility);
    }

    public void clickToSaveInsurentPerson() {
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementInVisible(driver, CommonPageUI.LOADING_PAGE);
        waitForElementClickable(driver, SDBSPageUI.CLICK_TO_SAVE_INSURENT_PERSON);
        clickToElement(driver, SDBSPageUI.CLICK_TO_SAVE_INSURENT_PERSON);
        waitForElementVisible(driver, SDBSPageUI.CREATE_INSURED_PERSON_SUCCESS);

    }
    

    public String getPaymentFeesA(WebDriver driver) {
        waitForElementVisible(driver, SDBSPageUI.PAYMENT_FEES_A);
        sleepInSecond(1);
        return getElementAttribute(driver, SDBSPageUI.PAYMENT_FEES_A, "value");
    }

    public String getPaymentFeesB(WebDriver driver) {
        waitForElementVisible(driver, SDBSPageUI.PAYMENT_FEES_B);
        sleepInSecond(1);
        return getElementAttribute(driver, SDBSPageUI.PAYMENT_FEES_B, "value");
    }

    public String getPaymentFeesAll(WebDriver driver) {
        waitForElementVisible(driver, SDBSPageUI.PAYMENT_FEES_ALL);
        sleepInSecond(1);
        return getElementText(driver, SDBSPageUI.PAYMENT_FEES_ALL);
    }
}