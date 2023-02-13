package pageUIs.nopCommerce.user;

public class SDBSPageUI {
    public static final String CLICK_TO_SUBMIT_CREATE_CREATE = "xpath=//button[@class='btn btn-primary btn-md']";
    public static final String CLICK_TO_DROPDOWN_KIND_ÒF_SDBS = "xpath=//div[@class='mb-5 pb-5']//label[text()='Kiểu sửa đổi bổ sung']/following-sibling::div//div[@class='select-box__indicator select-box__dropdown-indicator css-tlfecz-indicatorContainer']";
    public static final String CLICK_TO_DROPDOWN_TYPE_OF_SDBS = "xpath=//div[@class='mb-5 pb-5']//label[text()='Loại sửa đổi bổ sung']/following-sibling::div//div[@class='select-box__indicator select-box__dropdown-indicator css-tlfecz-indicatorContainer']";
    public static final String SELECT_DROPDOWN_KIND_OF_SDBS = "xpath=//div[@class='select-box__menu-list css-uqxu9s']//div[@title='%s']";
    public static final String SELECT_DROPDOWN_TYPE_OF_SDBS = "xpath=//div[@class='select-box__menu-list css-uqxu9s']//div[@title='%s']";
    public static final String VERIFY_CREATE_SDBS = "xpath=//div[@class='card-header card-header-main card-header-main-o bg-light-primary card-header-default']//h3";
    public static final String CLICK_CONFIRM_CREATE_SDBS = "xpath=//button[@class='btn btn-primary btn-min-width']";
    public static final String MESSAGE_INCREASE_SDBS = "xpath=//div[@class='react-toast-notifications__toast__content css-1ad3zal']";
    public static final String LOADING_PAGE = "xpath=//div[@class='modal fade in d-flex modal-open modal-dialog-centered show']";

    public static final String CLICK_TO_INSURED_PERSON = "xpath=//a[@title='Người được bảo hiểm']";
    public static final String CLICK_TO_CREATE_NEW_INSURED_PERSION = "xpath=//a[@title='Thêm thông tin đối tượng']";
    public static final String INPUT_FULL_NAME = "xpath=//label[text()='Họ và tên']//following-sibling::article//input";
    public static final String INPUT_BIRTH = "xpath=//label[text()='Ngày sinh']//following-sibling::article//input";
    public static final String SELECT_DROPDOWN_LIST_SEX = "xpath=//label[text()='Giới tính']//following-sibling::article//div[@class='select-box__indicators css-1wy0on6']";
    public static final String DATA_SELECT_DROPDOWN_LIST_SEX = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[@title='%s']";
    public static final String SELECT_DROPDOWN_TYPE = "xpath=//label[text()='Loại định danh']//following-sibling::article//div[@class='select-box__indicators css-1wy0on6']";
    public static final String DATA_SELECT_DROPDOWN_TYPE = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[@title='CMND']";
    public static final String INPUT_IDENTIFIER_NUMBER = "xpath=//label[text()='Số định danh']//following-sibling::article//input";
    public static final String CLICK_TO_MOVE_INSURANCE_BENEFITS = "xpath=//a[@title='Quyền lợi bảo hiểm']";
    public static final String CREATE_INSURED_PERSON = "xpath=//h3[text()='Người được bảo hiểm']";
    public static final String CLICK_TO_INSURANCE_BENEFITS_A = "xpath=//input[@id='checkRow_1_0']";
    public static final String CLICK_TO_INSURANCE_BENEFITS_B = "xpath=//input[@id='checkRow_1_2']";
    public static final String INPUT_LEVEL_OF_RESPONSIBILITY_A = "xpath=//table[@class='table table-xs has-sorting table-borderless ']//tr[1]/td[4]//input";
    public static final String INPUT_LEVEL_OF_RESPONSIBILITY_B = "xpath=//table[@class='table table-xs has-sorting table-borderless ']//tr[3]/td[4]//input";
    public static final String CLICK_TO_SAVE_INSURENT_PERSON = "xpath=//button[@class='btn btn-primary btn-min-width btn-sm']";
    public static final String CREATE_INSURED_PERSON_SUCCESS = "xpath=//div[text()='Tạo mới người được bảo hiểm thành công']";

    public static final String PAYMENT_FEES_A = "xpath=//table[@class='table table-xs has-sorting table-borderless ']/tbody/tr[1]/td[11]//input";
    public static final String PAYMENT_FEES_B = "xpath=//table[@class='table table-xs has-sorting table-borderless ']/tbody/tr[3]/td[11]//input";
    public static final String PAYMENT_FEES_ALL = "xpath=//table[@class='table table-xs has-sorting table-borderless ']/tbody/tr[10]/td[11]//b";
}
