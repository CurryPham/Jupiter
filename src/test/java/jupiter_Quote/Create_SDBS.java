package jupiter_Quote;

import com.aventstack.extentreports.Status;
import commons.BaseTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.user.jupiterAlpaca.*;
import reportConfig.ExtentTestManager;
import utilities.DataHelper;

import java.lang.reflect.Method;

public class Create_SDBS extends BaseTest {

    @Parameters({"browser", "envName", "serverName", "ipAddress", "portNumber", "osName", "osName"})
    @BeforeClass(description = "Create new common User for all Classed test")
    public void BeforeClass(String browserName, String envName, String serverName, @Optional("localhost") String ipAddress, @Optional("4444") String portNumber, @Optional("Windows") String osName, @Optional("10") String osVersion) throws Exception {
        driver = getBrowserDriver(envName, serverName, browserName, ipAddress, portNumber, osName, osName);
        loginPage = PageGeneratorManager.getUserLoginPage(driver);
        dataFaker = DataHelper.getDataHelper();
        excel = new commons.helpers.ExcelHelpers();
        excel.setExcelFile("src/test/resources/Book1.xlsx", "Sheet1");

        firstName = "alpacatest001";
        password = "Alpaca#2022";
        fullName = "Curry test";
        birth = "02/02/2000";
        sex = "Nam";
//        identifierNumber = String.valueOf(generateFakeNumber());
        levelOfResponsibility = "20000000";

        log.info("Pre-Condition_Login - Step 01: Enter to  First name textbox with value is '" + excel.getCellData("username", 1) + "'");
        loginPage.inputToEmailTextbox(excel.getCellData("username", 1));

        log.info("Pre-Condition_Login - Step 02: Enter to Password textbox with value is '" + excel.getCellData("password", 1) + "'");
        loginPage.inputToPasswordTextbox(excel.getCellData("password", 1));

        log.info("Pre-Condition_Login - Step 03: Click to Login button");
        loginPage.clickToLoginButton();
        homePage = PageGeneratorManager.getUserHomePage(driver);
        showBrowserConsoleLogs(driver);

        log.info("Pre-Condition_Login - Step 04: Verify login success mesage is displayed");
        Assert.assertEquals(homePage.getSuccessLogin(), "Nhi???m v???");
        quotePage = homePage.clickToQuote(driver);

        log.info("Create_Quote - Step 02: Click to View List Quote button");
        quotePage.clickToViewListQuote();

        log.info("Create_Quote - Step 03: Click to Create button");
        quotePage.clickToCreateButton();

        log.info("Create_Quote - Step 04: Select to dropdown major");
        quotePage.selectToDropdownMajor(driver, "Con ng?????i");

        log.info("Create_Quote - Step 05: Select to dropdown name product");
        quotePage.selectToDropdownNameProduct(driver, "C04 - B???o hi???m gi??o vi??n");

        log.info("Create_Quote - Step 06: Select to dropdown type quote");
        quotePage.selectToDropdownTypeQuote(driver, "Nh??m c?? nh??n");

        log.info("Create_Quote - Step 07: Select to dropdown distribution chanel");
        quotePage.selectToDropdownDistributionChannel(driver);

        log.info("Create_Quote - Step 08: Select to dropdown contract holder name");
        quotePage.selectToDropdownContractHolderName(driver);

        log.info("Create_Quote - Step 09: Click to insured person");
        quotePage.clickToInsuredPerson();

        log.info("Create_Quote - Step 10: Click to create new insured person");
        quotePage.clickToCreateNewInsuredPerson();

        log.info("Create_Quote - Step 11: Input full name");
        quotePage.inputFullName(driver, excel.getCellData("fullName", 1));

        log.info("Create_Quote - Step 12: Input birth");
        quotePage.inputBirth(driver, birth);

        log.info("Create_Quote - Step 13: Select dropdown list sex");
        quotePage.selectDropdownListSex(driver, excel.getCellData("sex", 1));

        log.info("Create_Quote - Step 14: Select dropdown list identifier type");
        quotePage.selectDropdownIdentifierType(driver);

        log.info("Create_Quote - Step 15: Input indertifier number");
        quotePage.inputIdentifierNumber(driver, String.valueOf(generateFakeNumber()));

        log.info("Create_Quote - Step 16: Click to move insurance benefits");
        quotePage.clickToMoveInsuranceBenefits();

        log.info("Create_Quote - Step 17: Click to insurance benefits A");
        quotePage.clickToInsuranceBenefitsA();

        log.info("Create_Quote - Step 18: Input level of responsibility A");
        quotePage.inputLevelOfResponsibilityA(driver, levelOfResponsibility);

        Assert.assertEquals(quotePage.getPaymentFeesA(driver), excel.getCellData("Phi thanh toan A", 1));

        log.info("Create_Quote - Step 19: Click to insurance benefits B");
        quotePage.clickToInsuranceBenefitsB();

        log.info("Create_Quote - Step 20: Input level of responsibility B");
        quotePage.inputLevelOfResponsibilityB(driver, levelOfResponsibility);

        Assert.assertEquals(quotePage.getPaymentFeesB(driver), excel.getCellData("Phi thanh toan B", 1));
        Assert.assertEquals(quotePage.getPaymentFeesAll(driver), excel.getCellData("Phi tong", 1));

        log.info("Create_Quote - Step 21: Click to save insurent Person");
        quotePage.clickToSaveInsurentPerson();

        log.info("Create_Quote - Step 22: Click to insurent Person");
        quotePage.clickToInsuredPerson();

        log.info("Create_Quote - Step 23: Click to create new insured person");
        quotePage.clickToCreateNewInsuredPerson();

        log.info("Create_Quote - Step 24: Input full name");
        quotePage.inputFullName(driver, excel.getCellData("fullName", 2));

        log.info("Create_Quote - Step 25: Input birth");
        quotePage.inputBirth(driver, birth);

        log.info("Create_Quote - Step 26: Select dropdown list sex");
        quotePage.selectDropdownListSex(driver, excel.getCellData("sex", 2));

        log.info("Create_Quote - Step 27: Select dropdown indentifier type");
        quotePage.selectDropdownIdentifierType(driver);

        log.info("Create_Quote - Step 28: Input identifier number");
        quotePage.inputIdentifierNumber(driver, String.valueOf(generateFakeNumber()));

        log.info("Create_Quote - Step 29: Click to move insurence benefits");
        quotePage.clickToMoveInsuranceBenefits();

        log.info("Create_Quote - Step 31: Click to insurance benefits A");
        quotePage.clickToInsuranceBenefitsA();

        log.info("Create_Quote - Step 32: Input level of responsibility A");
        quotePage.inputLevelOfResponsibilityA(driver, levelOfResponsibility);

        Assert.assertEquals(quotePage.getPaymentFeesA(driver), excel.getCellData("Phi thanh toan A", 1));

        log.info("Create_Quote - Step 33: Click to insurance benefits B");
        quotePage.clickToInsuranceBenefitsB();

        log.info("Create_Quote - Step 34: Input level of responsibility B");
        quotePage.inputLevelOfResponsibilityB(driver, levelOfResponsibility);

        Assert.assertEquals(quotePage.getPaymentFeesB(driver), excel.getCellData("Phi thanh toan B", 1));
        Assert.assertEquals(quotePage.getPaymentFeesAll(driver), excel.getCellData("Phi tong", 1));

        log.info("Create_Quote - Step 35: Click to save insurance person");
        quotePage.clickToSaveInsurentPerson();

        log.info("Create_Quote - Step 36: Click to create quote button");
        quotePage.clickToCreateQuote();

        quotePage.clickToReviewQuote();

        quotePage.clickToSubmitReviewQuote();

        Assert.assertEquals(quotePage.verifyReviewQuoteSuccess(), "???? duy???t");

        quotePage.clickToConvertedIntoPolicy();

        quotePage.clickToSubmitConvertedIntoPolicy();

        quotePage.clickToReleasePolicy();

        polictyPage = quotePage.clickToSubmitToReleasePolicy();

        Assert.assertEquals(polictyPage.verifyReleasePolicySuccess(), "??ang c?? hi???u l???c");

        sdbsPage = polictyPage.clickToCreateNewSDBS();

    }

    @Test
    public void User_01_Create_Policy(Method method) throws Exception {
        ExtentTestManager.startTest(method.getName(), "User_01_Create_Policy");
        ExtentTestManager.getTest().log(Status.INFO, "Create_Policy - Step 01: Navigate to 'Policy'");

        sdbsPage.clickToCreateSDBSButton();

        sdbsPage.selectDropdownKindOfSDBS(driver, "S???a ?????i b??? sung cho kh??ch h??ng");

        sdbsPage.selectDropdownTypeOfSDBS(driver, "T??ng ng?????i ???????c b???o hi???m");

        sdbsPage.clickToSubmitCreateButton();

        Assert.assertEquals(sdbsPage.verifyCreateSDBS(), "T???o m???i s???a ?????i b??? sung");

        sdbsPage.clickToConfirmCreateSDBS();

        Assert.assertEquals(sdbsPage.verifyMessageSDBS(), "Kh??ng c?? thay ?????i s??? l?????ng ng?????i ??? danh s??ch ng?????i ???????c b???o hi???m.");

        log.info("Create_Quote - Step 09: Click to insured person");
        sdbsPage.clickToInsuredPerson();

        log.info("Create_Quote - Step 10: Click to create new insured person");
        sdbsPage.clickToCreateNewInsuredPerson();

        log.info("Create_Quote - Step 11: Input full name");
        sdbsPage.inputFullName(driver, excel.getCellData("fullName", 1));

        log.info("Create_Quote - Step 12: Input birth");
        sdbsPage.inputBirth(driver, birth);

        log.info("Create_Quote - Step 13: Select dropdown list sex");
        sdbsPage.selectDropdownListSex(driver, excel.getCellData("sex", 1));

        log.info("Create_Quote - Step 14: Select dropdown list identifier type");
        sdbsPage.selectDropdownIdentifierType(driver);

        log.info("Create_Quote - Step 15: Input indertifier number");
        sdbsPage.inputIdentifierNumber(driver, String.valueOf(generateFakeNumber()));

        log.info("Create_Quote - Step 16: Click to move insurance benefits");
        sdbsPage.clickToMoveInsuranceBenefits();

        log.info("Create_Quote - Step 17: Click to insurance benefits A");
        sdbsPage.clickToInsuranceBenefitsA();

        log.info("Create_Quote - Step 18: Input level of responsibility A");
        sdbsPage.inputLevelOfResponsibilityA(driver, levelOfResponsibility);

        Assert.assertEquals(sdbsPage.getPaymentFeesA(driver), excel.getCellData("Phi thanh toan A", 1));

        log.info("Create_Quote - Step 33: Click to insurance benefits B");
        sdbsPage.clickToInsuranceBenefitsB();

        log.info("Create_Quote - Step 34: Input level of responsibility B");
        sdbsPage.inputLevelOfResponsibilityB(driver, levelOfResponsibility);

        Assert.assertEquals(sdbsPage.getPaymentFeesB(driver), excel.getCellData("Phi thanh toan B", 1));
        Assert.assertEquals(sdbsPage.getPaymentFeesAll(driver), excel.getCellData("Phi tong", 1));

        sdbsPage.clickToSaveInsurentPerson();

        sdbsPage.clickToConfirmCreateSDBS();
    }


    @AfterClass(alwaysRun = true)
    public void afterClass() {
        closeBrowserDriver();
    }

    private commons.helpers.ExcelHelpers excel;
    private WebDriver driver;
    private String firstName, fullName, password, birth, sex, levelOfResponsibility;
    private String identifierNumber;
    private UserHomePageObject homePage;
    private UserRegisterPageObject registerPage;
    private DataHelper dataFaker;
    private QuotePageObject quotePage;
    private PolicyPageObject polictyPage;
    private SDBSPageObject sdbsPage;

    private UserLoginPageObject loginPage;
    private UserCustomerInforPageObject customerInforPage;

}
