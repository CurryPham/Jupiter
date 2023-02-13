package pageObjects.user.jupiterAlpaca;

import commons.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageUIs.nopCommerce.user.PolicyPageUI;
import pageUIs.nopCommerce.user.QuotePageUI;

public class QuotePageObject extends BasePage {

    private WebDriver driver;

    public QuotePageObject(WebDriver driver) {
        this.driver = driver;
    }
    
    @Step("Click to Create button")
    public void clickToCreateButton() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CREATE_QUOTE_BUTTON);
        clickToElement(driver, QuotePageUI.CREATE_QUOTE_BUTTON);
    }

    @Step("Click to Create Qoute button")
    public void clickToCreateQuoteButton() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CREATE_NEW_QUOTE_BUTTON);
        clickToElement(driver, QuotePageUI.CREATE_NEW_QUOTE_BUTTON);
        waitForElementInVisible(driver, QuotePageUI.SPINNER_LOADING);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CLOSED_QOUTE);
        clickToElement(driver, QuotePageUI.CLOSED_QOUTE);
    }

    @Step("Click to Create Qoute button")
    public void clickToCreateQuote() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CREATE_NEW_QUOTE_BUTTON);
        clickToElement(driver, QuotePageUI.CREATE_NEW_QUOTE_BUTTON);
        waitForElementInVisible(driver, QuotePageUI.SPINNER_LOADING);
    }

    public void selectToDropdownMajor(WebDriver driver, String major) {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.MAJOR_DROPDOWN_LIST);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        clickToElement(driver, QuotePageUI.MAJOR_DROPDOWN_LIST);
        waitForElementClickable(driver, QuotePageUI.DATA_MAJOR_DROPDOWN_LIST, major);
        clickToElement(driver, QuotePageUI.DATA_MAJOR_DROPDOWN_LIST, major);
    }

    public void selectToDropdownNameProduct(WebDriver driver, String nameProduct) {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.NAME_PRODUCT_DROPDOWN_LIST);
        clickToElement(driver, QuotePageUI.NAME_PRODUCT_DROPDOWN_LIST);
        waitForElementVisible(driver, QuotePageUI.DATA_NAME_PRODUCT_DROPDOWN_LIST,nameProduct);
        clickToElement(driver, QuotePageUI.DATA_NAME_PRODUCT_DROPDOWN_LIST, nameProduct);
        waitForElementInVisible(driver, QuotePageUI.DATA_NAME_PRODUCT_DROPDOWN_LIST,nameProduct);
    }

    public void selectToDropdownTypeQuote(WebDriver driver, String typeQuote) {
        waitForElementInVisible(driver,QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver,QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.TYPE_QUOTE_DROPDOWN_LIST);
        clickToElement(driver, QuotePageUI.TYPE_QUOTE_DROPDOWN_LIST);
        waitForElementVisible(driver, QuotePageUI.DATA_TYPE_QUOTE_DROPDOWN_LIST, typeQuote);
        clickToElement(driver, QuotePageUI.DATA_TYPE_QUOTE_DROPDOWN_LIST, typeQuote);
        waitForElementInVisible(driver, QuotePageUI.DATA_TYPE_QUOTE_DROPDOWN_LIST, typeQuote);
        waitForElementInVisible(driver,QuotePageUI.LOADING_PAGE);
    }

    public void selectToDropdownDistributionChannel(WebDriver driver) {
        waitForElementInVisible(driver,QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.DATA_TYPE_QUOTE_DROPDOWN_LIST);
        waitForElementClickable(driver, QuotePageUI.DISTRIBUTION_CHANEL_DROPDOWN_LIST);
        clickToElement(driver, QuotePageUI.DISTRIBUTION_CHANEL_DROPDOWN_LIST);
        waitForElementVisible(driver, QuotePageUI.DATA_DISTRIBUTION_CHANEL_DROPDOWN_LIST);
        clickToElement(driver, QuotePageUI.DATA_DISTRIBUTION_CHANEL_DROPDOWN_LIST);
    }

    public void selectToDropdownContractHolderName(WebDriver driver) {
        waitForElementInVisible(driver, QuotePageUI.DATA_DISTRIBUTION_CHANEL_DROPDOWN_LIST);
        waitForElementClickable(driver, QuotePageUI.CONTRACT_HOLDER_NAME_DROPDOWN_LIST);
        clickToElement(driver, QuotePageUI.CONTRACT_HOLDER_NAME_DROPDOWN_LIST);
        waitForElementVisible(driver, QuotePageUI.DATA_CONTRACT_HOLDER_NAME_DROPDOWN_LIST);
        clickToElement(driver, QuotePageUI.DATA_CONTRACT_HOLDER_NAME_DROPDOWN_LIST);
    }

    public void clickToInsuredPerson() {
        waitForElementInVisible(driver,QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_INSURED_PERSON);
        clickToElement(driver, QuotePageUI.CLICK_TO_INSURED_PERSON);
    }

    public void clickToCreateNewInsuredPerson() {
        waitForElementInVisible(driver,QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_CREATE_NEW_INSURED_PERSION);
        clickToElement(driver, QuotePageUI.CLICK_TO_CREATE_NEW_INSURED_PERSION);
        waitForElementVisible(driver, QuotePageUI.CREATE_INSURED_PERSON);
    }

    public void clickToCreateNewInsuredPersonGroup() {
        waitForElementInVisible(driver,QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_CREATE_NEW_INSURED_PERSION_GROUP);
        clickToElement(driver, QuotePageUI.CLICK_TO_CREATE_NEW_INSURED_PERSION_GROUP);
        waitForElementVisible(driver, QuotePageUI.CREATE_INSURED_PERSON_GROUP);
    }

    public void inputFullName(WebDriver driver, String fullName) {
        waitForElementVisible(driver, QuotePageUI.INPUT_FULL_NAME);
        sendkeyToElement(driver, QuotePageUI.INPUT_FULL_NAME, fullName);
    }

    public void inputBirth(WebDriver driver, String birth) {
        waitForElementVisible(driver, QuotePageUI.INPUT_BIRTH);
        sendkeyAndSubmitToElement(driver, QuotePageUI.INPUT_BIRTH, birth);
    }

    public void selectDropdownListSex(WebDriver driver, String value) {
        waitForElementClickable(driver, QuotePageUI.SELECT_DROPDOWN_LIST_SEX);
        clickToElement(driver, QuotePageUI.SELECT_DROPDOWN_LIST_SEX);
        waitForElementVisible(driver, QuotePageUI.DATA_SELECT_DROPDOWN_LIST_SEX, value);
        clickToElement(driver, QuotePageUI.DATA_SELECT_DROPDOWN_LIST_SEX, value);
    }

    public void selectDropdownIdentifierType(WebDriver driver) {
        waitForElementClickable(driver, QuotePageUI.SELECT_DROPDOWN_TYPE);
        clickToElement(driver, QuotePageUI.SELECT_DROPDOWN_TYPE);
        waitForElementVisible(driver, QuotePageUI.DATA_SELECT_DROPDOWN_TYPE);
        clickToElement(driver, QuotePageUI.DATA_SELECT_DROPDOWN_TYPE);
    }

    public void inputIdentifierNumber(WebDriver driver, String identifierNumber) {
        sendkeyToElement(driver, QuotePageUI.INPUT_IDENTIFIER_NUMBER, identifierNumber);
    }

    public void clickToMoveInsuranceBenefits() {
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_MOVE_INSURANCE_BENEFITS);
        clickToElement(driver, QuotePageUI.CLICK_TO_MOVE_INSURANCE_BENEFITS);

    }

    public void clickToInsuranceBenefitsA() {
        clickToElementByJS(driver, QuotePageUI.CLICK_TO_INSURANCE_BENEFITS_A);

    }

    public void inputLevelOfResponsibilityA(WebDriver driver, String levelOfResponsibility) {
        waitForElementVisible(driver, QuotePageUI.INPUT_LEVEL_OF_RESPONSIBILITY_A);
        sendkeyToElement(driver, QuotePageUI.INPUT_LEVEL_OF_RESPONSIBILITY_A, levelOfResponsibility);
    }

    public void clickToInsuranceBenefitsB() {
        clickToElementByJS(driver, QuotePageUI.CLICK_TO_INSURANCE_BENEFITS_B);
    }

    public void inputLevelOfResponsibilityB(WebDriver driver, String levelOfResponsibility) {
        waitForElementVisible(driver, QuotePageUI.INPUT_LEVEL_OF_RESPONSIBILITY_B);
        sendkeyToElement(driver, QuotePageUI.INPUT_LEVEL_OF_RESPONSIBILITY_B, levelOfResponsibility);
    }

    public void clickToSaveInsurentPerson() {
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_SAVE_INSURENT_PERSON);
        clickToElement(driver, QuotePageUI.CLICK_TO_SAVE_INSURENT_PERSON);
        waitForElementVisible(driver, QuotePageUI.CREATE_INSURED_PERSON_SUCCESS);

    }

    public void clickToViewListQuote() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementVisible(driver, QuotePageUI.CLICK_TO_VIEW_LIST_QUOTE);
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_VIEW_LIST_QUOTE);
        clickToElement(driver, QuotePageUI.CLICK_TO_VIEW_LIST_QUOTE);
    }

    public String getPaymentFeesA(WebDriver driver) {
        waitForElementVisible(driver, QuotePageUI.PAYMENT_FEES_A);
        sleepInSecond(1);
        return getElementAttribute(driver, QuotePageUI.PAYMENT_FEES_A, "value");
    }

    public String getPaymentFeesB(WebDriver driver) {
        waitForElementVisible(driver, QuotePageUI.PAYMENT_FEES_B);
        sleepInSecond(1);
        return getElementAttribute(driver, QuotePageUI.PAYMENT_FEES_B, "value");
    }

    public String getPaymentFeesAll(WebDriver driver) {
        waitForElementVisible(driver, QuotePageUI.PAYMENT_FEES_ALL);
        sleepInSecond(1);
        return getElementText(driver, QuotePageUI.PAYMENT_FEES_ALL);
    }

    public void clickToReviewQuote() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementVisible(driver, QuotePageUI.CLICK_TO_REVIEW_QUOTE);
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_REVIEW_QUOTE);
        clickToElement(driver, QuotePageUI.CLICK_TO_REVIEW_QUOTE);
    }

    public void clickToSubmitReviewQuote() {
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_SUBMIT_REVIEW_QUOTE);
        clickToElement(driver, QuotePageUI.CLICK_TO_SUBMIT_REVIEW_QUOTE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_SUBMIT_REVIEW_QUOTE);
    }

    public String verifyReviewQuoteSuccess() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementVisible(driver, QuotePageUI.CLICK_TO_CONVERT_INTO_POLICY);
        waitForElementVisible(driver, QuotePageUI.VERIFY_REVIEW_QUOTE_SUCCESS);
        return getElementText(driver, QuotePageUI.VERIFY_REVIEW_QUOTE_SUCCESS);
    }

    public void clickToConvertedIntoPolicy() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementVisible(driver, QuotePageUI.VERIFY_REVIEW_QUOTE_SUCCESS);
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_CONVERT_INTO_POLICY);
        clickToElement(driver, QuotePageUI.CLICK_TO_CONVERT_INTO_POLICY);
    }

    public void clickToSubmitConvertedIntoPolicy() {
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_SUBMIT_CONVERT_INTO_POLICY);
        clickToElement(driver, QuotePageUI.CLICK_TO_SUBMIT_CONVERT_INTO_POLICY);
    }

    public void clickToReleasePolicy() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_RELEASE_POLICY);
        clickToElement(driver, QuotePageUI.CLICK_TO_RELEASE_POLICY);
    }

    public PolicyPageObject clickToSubmitToReleasePolicy() {
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementInVisible(driver, QuotePageUI.LOADING_PAGE);
        waitForElementClickable(driver, QuotePageUI.CLICK_TO_SUBMIT_RELEASE_POLICY);
        clickToElement(driver, QuotePageUI.CLICK_TO_SUBMIT_RELEASE_POLICY);
        waitForElementInVisible(driver, QuotePageUI.LOADING_SUBMIT_RELEASE_POLICY);
        return  PageGeneratorManager.getPageGeneratorManager().getPolictyPage(driver);
    }

    public void checkToTripTypeCheckBox(WebDriver driver, String dataType) {
        waitForElementClickable(driver, QuotePageUI.CHECK_TO_TRIP_TYPE_CHECKBOX, dataType);
        checkToDefaultCheckboxOrRadio(driver, QuotePageUI.CHECK_TO_TRIP_TYPE_CHECKBOX, dataType);
    }

    public void inputEndDate(WebDriver driver, String endDate) {
        sendkeyToElement(driver, QuotePageUI.INPUT_END_DATE, endDate);
        waitForElementClickable(driver, QuotePageUI.CREATE_INSURED_PERSON);
        clickToElement(driver, QuotePageUI.CREATE_INSURED_PERSON);
        waitForElementInVisible(driver,QuotePageUI.DATE_PICKER);
    }

    public void inputEndDateGroup(WebDriver driver, String endDate) {
        sendkeyToElement(driver, QuotePageUI.INPUT_END_DATE, endDate);
        waitForElementClickable(driver, QuotePageUI.CREATE_INSURED_PERSON_GROUP);
        clickToElement(driver, QuotePageUI.CREATE_INSURED_PERSON_GROUP);
        waitForElementInVisible(driver,QuotePageUI.DATE_PICKER);
    }

    public void selectedDropdownByText(WebDriver driver, String label, String data) {
        waitForElementVisible(driver, QuotePageUI.DROPDOWN_LABEL, label);
        clickToElement(driver, QuotePageUI.DROPDOWN_LABEL, label);
        waitForElementVisible(driver, QuotePageUI.DROPDOWN_DATA, data);
        clickToElement(driver, QuotePageUI.DROPDOWN_DATA, data);
    }

    public String verifyProgramLimits(WebDriver driver) {
        waitForElementVisible(driver, QuotePageUI.PROGRAM_LIMITS);
        return getElementAttribute(driver, QuotePageUI.PROGRAM_LIMITS, "value");
    }

    public String verifyStandardFees(WebDriver driver) {
        waitForElementVisible(driver, QuotePageUI.STANDARD_FEES);
        return getElementAttribute(driver, QuotePageUI.STANDARD_FEES, "value");
    }

    public String verifyPaymentFees(WebDriver driver) {
        waitForElementVisible(driver, QuotePageUI.PAYMENT_FEES);
        return getElementAttribute(driver, QuotePageUI.PAYMENT_FEES, "value");
    }

    public String verifyPaymentFeesIndividualGroup(WebDriver driver) {
        waitForElementVisible(driver, QuotePageUI.PAYMENT_FEES_INDIVIDUAL_GROUP);
        return getElementAttribute(driver, QuotePageUI.PAYMENT_FEES_INDIVIDUAL_GROUP, "value");
    }

    public String verifyNumberOfDays(WebDriver driver) {
        sleepInSecond(1);
        waitForElementVisible(driver, QuotePageUI.NUMBER_OF_DAYS);
        return  getElementAttribute(driver, QuotePageUI.NUMBER_OF_DAYS, "value");
    }

    public void backToMainInformation() {
        waitForElementClickable(driver, QuotePageUI.BACK_TO_MAIN_INFO);
        clickToElement(driver, QuotePageUI.BACK_TO_MAIN_INFO);
    }

    public void inputStartDate(WebDriver driver, String startDate) {
        sendkeyToElement(driver, QuotePageUI.INPUT_START_DATE, startDate);
        waitForElementClickable(driver, QuotePageUI.CREATE_INSURED_PERSON);
        clickToElement(driver, QuotePageUI.CREATE_INSURED_PERSON);
        waitForElementInVisible(driver,QuotePageUI.DATE_PICKER);
    }

    public void inputStartDateGroup(WebDriver driver, String startDate) {
        sendkeyToElement(driver, QuotePageUI.INPUT_START_DATE, startDate);
        waitForElementClickable(driver, QuotePageUI.CREATE_INSURED_PERSON_GROUP);
        clickToElement(driver, QuotePageUI.CREATE_INSURED_PERSON_GROUP);
        waitForElementInVisible(driver,QuotePageUI.DATE_PICKER);
    }
}