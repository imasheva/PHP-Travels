import org.openqa.selenium.By;

public class Locators {


    public static final By registerLink = By.xpath("//div[@class='container']//a[text()='Register']");

    //PERSONAL INFORMATION

    public static final By inputFirstName = By.cssSelector("#inputFirstName");
    public static final By inputLastName = By.cssSelector("#inputLastName");
    public static final By inputEmail = By.cssSelector("#inputEmail");
    public static final By inputPhoneNumber = By.cssSelector("#inputPhone");

   //UNORDERED LIST COUNTRY FLAG
   //UNORDERED LIST COUNTRY NAME
   //UNORDERED LIST COUNTRY CODE

    // public static final By DROP_DOWN_COUNTRY_SORT_BY_COUNTRY_NAME_TEXT= By.xpath("//li[@class='country preferred active']//span[@class='country-name']");
    // public static final By dropDownCountryArrow= By.xpath("//div[@class='selected-dial-code']");
    ////div[@class='selected-dial-code']

    //BILLING ADDRESS
    public static final By inputCompanyName = By.cssSelector("#inputCompanyName");
    public static final By inputStreetAddress = By.cssSelector("#inputAddress1");
    public static final By inputStreetAddress2 = By.cssSelector("#inputAddress2");
    public static final By inputCity = By.cssSelector("#inputCity");
    public static final By inputState = By.cssSelector("#stateinput");
    public static final By inputPostCode = By.cssSelector("#inputPostcode");
    public static final By DROP_DOWN_COUNTRY_SORT_BY_COUNTRY_NAME_TEXT_BILLING = By.xpath("//div[@class='col-sm-12']//select[@id='inputCountry']");
    public static final By inputTaxIdNumber = By.cssSelector("#inputTaxId");


    //ADDITIONAL REQUIRED INFORMATION

    public static final By DROP_DOWN_LIST_SORT_BY_HOW_DID_YOU_FIND_US= By.xpath("//div[@class='col-sm-6']//select[@id='customfield1']");
    public static final By inputPhoneNumberWhatsapp = By.cssSelector("input#customfield2");
    public static final By inputPassword = By.cssSelector("#inputNewPassword1");
    public static final By inputPasswordConfirmation = By.cssSelector("#inputNewPassword2");

    public static final By EMAIL_SWITCH_LOCATOR = By.xpath("//div[@class='bootstrap-switch-container']");
    public static final By checkBoxConfirmation = By.xpath("//div[@class='rc-anchor-center-item rc-anchor-checkbox-holder']");
    public static final By BUTTON_REGISTER = By.xpath("//input[@class='btn btn-large btn-primary btn-recaptcha']");




}
