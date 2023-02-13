package pageUIs.nopCommerce.user;

public class QuotePageUI {
    public static final String CREATE_QUOTE_BUTTON = "xpath=//button[text()='Tạo mới']";
    public static final String CREATE_NEW_QUOTE_BUTTON = "xpath=//button[@class='avatar btn-avatar']";
    public static final String LOADING_PAGE = "xpath=//div[@class='modal fade in d-flex modal-open modal-dialog-centered show']";
    public static final String MAJOR_DROPDOWN_LIST = "xpath=//label[text()='Nghiệp vụ']//following-sibling::div//div[@class='select-box__indicators css-1wy0on6']";
    public static final String NAME_PRODUCT_DROPDOWN_LIST = "xpath=//label[text()='Tên sản phẩm']//following-sibling::div//div[@class='select-box__indicators css-1wy0on6']";
    public static final String TYPE_QUOTE_DROPDOWN_LIST = "xpath=//label[text()='Loại bản chào']//following-sibling::div//div[@class='select-box__indicators css-1wy0on6']";
    public static final String DISTRIBUTION_CHANEL_DROPDOWN_LIST = "xpath=//label[text()='Kênh phân phối']//following-sibling::div//div[@class='select-box__indicators css-1wy0on6']";
    public static final String CONTRACT_HOLDER_NAME_DROPDOWN_LIST = "xpath=//label[text()='Tên chủ hợp đồng']//following-sibling::div//div[@class='select-box__indicators css-1wy0on6']";

    public static final String DATA_MAJOR_DROPDOWN_LIST = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[@title='%s']";
    public static final String DATA_NAME_PRODUCT_DROPDOWN_LIST = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[@title='%s']";
    public static final String DATA_TYPE_QUOTE_DROPDOWN_LIST = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[text()='%s']";
    public static final String DATA_DISTRIBUTION_CHANEL_DROPDOWN_LIST = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[@title='Bancassurance']";
    public static final String DATA_CONTRACT_HOLDER_NAME_DROPDOWN_LIST = "xpath=//div[@class='select-box__menu css-te8i3u-menu']//span[@title='Curry Test']";

    public static final String CLICK_TO_INSURED_PERSON = "xpath=//a[@title='Người được bảo hiểm']";
    public static final String CLICK_TO_CREATE_NEW_INSURED_PERSION = "xpath=//a[@title='Thêm thông tin đối tượng']";
    public static final String CLICK_TO_CREATE_NEW_INSURED_PERSION_GROUP = "xpath=//div[@class='slide-content']//form/div[2]/div[2]//div[@class='tab-pane in  active']//a[@title='Thêm thông tin đối tượng']";
    public static final String INPUT_FULL_NAME = "xpath=//label[text()='Họ và tên']//following-sibling::article//input";
    public static final String INPUT_BIRTH = "xpath=//label[text()='Ngày sinh']//following-sibling::article//input";
    public static final String SELECT_DROPDOWN_LIST_SEX = "xpath=//label[text()='Giới tính']//following-sibling::article//div[@class='select-box__indicators css-1wy0on6']";
    public static final String DATA_SELECT_DROPDOWN_LIST_SEX = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[@title='%s']";
    public static final String SELECT_DROPDOWN_TYPE = "xpath=//label[text()='Loại định danh']//following-sibling::article//div[@class='select-box__indicators css-1wy0on6']";
    public static final String DATA_SELECT_DROPDOWN_TYPE = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[@title='CMND']";
    public static final String INPUT_IDENTIFIER_NUMBER = "xpath=//label[text()='Số định danh']//following-sibling::article//input";
    public static final String CLICK_TO_MOVE_INSURANCE_BENEFITS = "xpath=//a[@title='Quyền lợi bảo hiểm']";
    public static final String CREATE_INSURED_PERSON = "xpath=//h3[text()='Người được bảo hiểm']";
    public static final String CREATE_INSURED_PERSON_GROUP = "xpath=//h3[text()='Chương trình bảo hiểm']";
    public static final String CLICK_TO_INSURANCE_BENEFITS_A = "xpath=//input[@id='checkRow_1_0']";
    public static final String CLICK_TO_INSURANCE_BENEFITS_B = "xpath=//input[@id='checkRow_1_2']";
    public static final String INPUT_LEVEL_OF_RESPONSIBILITY_A = "xpath=//table[@class='table table-xs has-sorting table-borderless ']//tr[1]/td[4]//input";
    public static final String INPUT_LEVEL_OF_RESPONSIBILITY_B = "xpath=//table[@class='table table-xs has-sorting table-borderless ']//tr[3]/td[4]//input";
    public static final String CLICK_TO_SAVE_INSURENT_PERSON = "xpath=//button[@class='btn btn-primary btn-min-width btn-sm']";
    public static final String LOADING_INSURED_PERSON = "xpath=//label[@class='custom-control-label']";
    public static final String CREATE_INSURED_PERSON_SUCCESS = "xpath=//div[text()='Tạo mới người được bảo hiểm thành công']";
    public static final String CREATE_SECOND_INSURED_PERSON_SUCCESS = "xpath=//div[text()='Đã lưu']";
    public static final String CLICK_TO_VIEW_LIST_QUOTE = "xpath=//i[@class='fal fa-list-ul']";
    public static final String SPINNER_LOADING = "xpath=//i[@class='fa fa-spinner spinner']";
    public static final String CLOSED_QOUTE = "xpath=//i[@class='fal fa-times']";


    public static final String PAYMENT_FEES_A = "xpath=//table[@class='table table-xs has-sorting table-borderless ']/tbody/tr[1]/td[11]//input";
    public static final String PAYMENT_FEES_B = "xpath=//table[@class='table table-xs has-sorting table-borderless ']/tbody/tr[3]/td[11]//input";
    public static final String PAYMENT_FEES_ALL = "xpath=//table[@class='table table-xs has-sorting table-borderless ']/tbody/tr[10]/td[11]//b";
    public static final String CLICK_TO_REVIEW_QUOTE = "xpath=//div[@class='heading-elements']//i[@class='fal fa-clipboard-check']";
    public static final String VERIFY_REVIEW_QUOTE_SUCCESS = "xpath=//div[@class='card card-no-border shadow-none max-height']//div[@class='text-truncate']";

    public static final String CLICK_TO_CONVERT_INTO_POLICY = "xpath=//div[@class='heading-elements']//i[@class='fal fa-exchange-alt']";
    public static final String CLICK_TO_SUBMIT_CONVERT_INTO_POLICY = "xpath=//button[@class='btn btn-primary btn-min-width']";
    public static final String CLICK_TO_RELEASE_POLICY = "xpath=//span[@class='d-none d-sm-block']";
    public static final String CLICK_TO_SUBMIT_RELEASE_POLICY = "xpath=//div[@class='modal-content']//button[@class='btn btn-primary btn-min-width']";
    public static final String LOADING_SUBMIT_RELEASE_POLICY = "xpath=//i[@class='fa fa-spinner spinner']";

    public static final String CLICK_TO_SUBMIT_REVIEW_QUOTE = "xpath=//span[@class='d-none d-sm-block' and text()='Xác nhận']";
    public static final String LOADING_SUBMIT_REVIEW_QUOTE = "xpath=//i[@class='fa fa-spinner spinner']";

    public static final String CHECK_TO_TRIP_TYPE_CHECKBOX = "xpath=//label[text()='Loại chuyến đi']/following-sibling::article//input[@id='%s']";
    public static final String INPUT_END_DATE = "xpath=//form[@class='mt-2']//label[text()='Ngày kết thúc']/following-sibling::article//input";
    public static final String DROPDOWN_LABEL = "xpath=//label[text()='%s']/following-sibling::article//div[@class='select-box__indicators css-1wy0on6']";
    public static final String DROPDOWN_DATA = "xpath=//div[@class='select-box__menu css-26l3qy-menu']//div[text()='%s']";
    public static final String PROGRAM_LIMITS = "xpath=//label[text()='Hạn mức chương trình']/following-sibling::article//input";
    public static final String STANDARD_FEES = "xpath=//table[@class='table table-xs has-sorting table-borderless ']//tr[1]/td[6]//input";
    public static final String PAYMENT_FEES = "xpath=//table[@class='table table-xs has-sorting table-borderless ']//tr[1]/td[9]//input";
    public static final String PAYMENT_FEES_INDIVIDUAL_GROUP = "xpath=//table[@class='table table-xs has-sorting table-borderless ']//tr[1]/td[11]//input";

    public static final String NUMBER_OF_DAYS = "xpath=//label[text()='Số ngày']/following-sibling::article//input";
    public static final String BACK_TO_MAIN_INFO = "xpath=//a[text()='Thông tin chính']";
    public static final String INPUT_START_DATE = "xpath=//form[@class='mt-2']//label[text()='Ngày bắt đầu']/following-sibling::article//input";
    public static final String DATE_PICKER = "xpath=//div[@class='react-datepicker']";
    public static final String MENU_DATE_PICKER = "xpath=//div[@class='card-body card-scroll pt-0 animated slideInRight']//label[text()='Ngày kết thúc']/following-sibling::article//input";
}

