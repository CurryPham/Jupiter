package pageObjects.user.jupiterAlpaca;

import org.openqa.selenium.WebDriver;

import pageObjects.admin.nopCommerce.AdminDashboardPageObject;
import pageObjects.admin.nopCommerce.AdminPageObject;

public class PageGeneratorManager {

    public  static PageGeneratorManager getPageGeneratorManager() {
        return new PageGeneratorManager();
    }

    public static UserHomePageObject getUserHomePage(WebDriver driver) {
        return new UserHomePageObject(driver);
    }

    public static QuotePageObject getQuotePage(WebDriver driver) {
        return new QuotePageObject(driver);
    }


    public static UserLoginPageObject getUserLoginPage(WebDriver driver) {
        return new UserLoginPageObject(driver);
    }

    public  UserRegisterPageObject getUserRegisterPage(WebDriver driver) {
        return new UserRegisterPageObject(driver);
    }

    public  UserCustomerInforPageObject getUserCustomerInforPage(WebDriver driver) {
        return new UserCustomerInforPageObject(driver);
    }

    public  UserAddressPageObject getUserAddressPage(WebDriver driver) {
        return new UserAddressPageObject(driver);
    }

    public  UserRewardPointPageObject getUserRewaidPointPage(WebDriver driver) {
        return new UserRewardPointPageObject(driver);
    }

    public  UserMyProductReviewPageObject getUserMyProductReview(WebDriver driver) {
        return new UserMyProductReviewPageObject(driver);
    }

    public  AdminPageObject getAdminLoginPage(WebDriver driver) {
        return new AdminPageObject(driver);
    }

    public  AdminDashboardPageObject getAdminDashboardPage(WebDriver driver) {
        return new AdminDashboardPageObject(driver);
    }

    public  PolicyPageObject getPolictyPage(WebDriver driver) {
        return new PolicyPageObject(driver);
    }

    public  SDBSPageObject getSDBSPage(WebDriver driver) {
        return new SDBSPageObject(driver);
    }


}