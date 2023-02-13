package commons;

import org.testng.annotations.*;

import pageObjects.user.jupiterAlpaca.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Common_01_Login extends BaseTest {


    @Parameters({"browser" ,"envName", "serverName", "ipAddress", "portNumber", "osName", "osName"})
    @BeforeTest(description = "Create new common User for all Classed test")
    public void User_01_Login(String browserName, String envName, String serverName, @Optional("localhost") String ipAddress, @Optional("4444") String portNumber, @Optional( "Windows") String osName, @Optional("10") String osVersion) {
        driver = getBrowserDriver(envName, serverName, browserName,  ipAddress,  portNumber,   osName,  osName );
        loginPage = PageGeneratorManager.getUserLoginPage(driver);

        firstName = "alpacatest001";
        password = "Alpaca#2022";

        log.info("Pre-Condition_Login - Step 01: Enter to  First name textbox with value is '" + firstName + "'");
        loginPage.inputToEmailTextbox(firstName);

        log.info("Pre-Condition_Login - Step 02: Enter to Password textbox with value is '" + password + "'");
        loginPage.inputToPasswordTextbox(password);

        log.info("Pre-Condition_Login - Step 03: Click to Login button");
        loginPage.clickToLoginButton();
        homePage = PageGeneratorManager.getUserHomePage(driver);
        showBrowserConsoleLogs(driver);

        log.info("Pre-Condition_Login - Step 04: Verify login success mesage is displayed");
        Assert.assertEquals(homePage.getSuccessLogin(), "Nhiệm vụ");

        quotePage =  homePage.clickToQuote(driver);
    }
    @AfterTest(alwaysRun = true)
    public void afterTest() {
        closeBrowserDriver();
    }



    private WebDriver driver;
    private String firstName, lastName, password, emailAddress, day, month, year;
    private UserHomePageObject homePage;
    private UserRegisterPageObject registerPage;
    private QuotePageObject quotePage;
    private UserLoginPageObject loginPage;
    private UserCustomerInforPageObject customerInforPage;

}