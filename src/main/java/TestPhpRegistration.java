import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TestPhpRegistration extends ParentClassBaseUI {

    @Test
    public void testPhpRegister() {

        driver.findElement(Locators.registerLink).click();

        //PERSONAL INFORMATION

        driver.findElement(Locators.inputFirstName).sendKeys(Data.inputFirstName);
        driver.findElement(Locators.inputLastName).sendKeys(Data.inputLastName);
        driver.findElement(Locators.inputEmail).sendKeys(Data.email);
        driver.findElement(Locators.inputPhoneNumber).sendKeys(Data.phoneNumber);

        //BILLING ADDRESS
        driver.findElement(Locators.inputCompanyName).sendKeys(Data.companyName);
        driver.findElement(Locators.inputStreetAddress).sendKeys(Data.streetAddress);
        driver.findElement(Locators.inputStreetAddress2).sendKeys(Data.streetAddress2);
        driver.findElement(Locators.inputCity).sendKeys(Data.cityName);
        driver.findElement(Locators.inputState).sendKeys(Data.stateName);
        driver.findElement(Locators.inputPostCode).sendKeys(Data.postCode);

        //DROPDOWN
        getDropDownListByText(Locators.DROP_DOWN_COUNTRY_SORT_BY_COUNTRY_NAME_TEXT_BILLING,  Data.countryNameBilling);
        driver.findElement(Locators.inputTaxIdNumber).sendKeys(Data.taxIdNumber);

        //ADDITIONAL REQUIRED INFORMATION
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY_HOW_DID_YOU_FIND_US, Data.textHowFoundUs);
        driver.findElement(Locators.inputPhoneNumber).sendKeys(Data.phoneNumber);
        driver.findElement(Locators.inputPhoneNumberWhatsapp).sendKeys(Data.phoneNumberWhatsapp);
        driver.findElement(Locators.inputPassword).sendKeys(Data.password);
        driver.findElement(Locators.inputPasswordConfirmation).sendKeys(Data.passwordConfirmation);


        driver.findElement(Locators.EMAIL_SWITCH_LOCATOR).click();

       // driver.findElement(Locators.checkBoxConfirmation).click();

     /*   WebElement checkBoxConf = driver.findElement(Locators.checkBoxConfirmation);
        checkBoxConf.click();
        boolean checkBoxChecked = checkBoxConf.isSelected();
        System.out.println(checkBoxChecked);
        driver.findElement(Locators.BUTTON_REGISTER).click();
*/


        // Selecting CheckBox
/*
        WebElement checkBox = driver.findElement(Locators.checkBoxConfirmation);
        // This will Toggle the Check box
        checkBox.click();

        // Check whether the Check box is toggled on
        if (checkBox.isSelected()) {
            System.out.println("Checkbox is Toggled On");

        } else {
            System.out.println("Checkbox is Toggled Off");
        }
*/

/*
        //DropDownListflag //TRIED DIFFERENT LOCATORS

        //driver.findElement(Locators.dropDownCountryArrow).click();
        // driver.findElement(By.xpath("//div[@class='flag-container']//div[@class='selected-dial-code'][text()='"+ Data.textCountryCode+"']")).click();

        //  driver.findElement(Locators.dropDownCountryListFlagContainer).click();
        //  driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY_COUNTRY_CODE_TEXT).click();

        //getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY_COUNTRY_CODE_TEXT, Data.textCountryCode);
*/
    }


        public void getDropDownListByIndex (By Locators,int index){
            Select select = new Select(driver.findElement(Locators));
            select.selectByIndex(index);
        }

        public void getDropDownListByText (By Locators, String text){
            Select select = new Select(driver.findElement(Locators));
            select.selectByVisibleText(text);
        }


        public void getDropDownListByValue (By Locators, String value){
            Select select = new Select(driver.findElement(Locators));
            select.selectByValue(value);
        }



    }

  /*
        1. DROP DOWN COUNTRY FLAG ---UNORDERED LIST
        2. DROP DOWN COUNTRY NAME ---UNORDERED LIST
        3. DROP DOWN COUNTRY CODE ---UNORDERED LIST

        LOCATORS
        public static final By DROP_DOWN_COUNTRY_SORT_BY_COUNTRY_NAME_TEXT= By.xpath("//li[@class='country preferred active']//span[@class='country-name']");
        public static final By dropDownCountryArrow= By.xpath("//div[@class='selected-dial-code']");
        //div[@class='selected-dial-code']

       JAVA METHODS
       1 Method --> WebE

       WebElement dropDownCountryListElement = driver.findElement(Locators.dropDownCountryArrow);
       dropDownCountryListElement.click();
       dropDownCountryListElement.findElement(By.xpath("//li[@class='country preferred']//span[@class='country-name'][contains(text(),'"+Data.countryName+"')]"));

        //li[@class='country preferred']//span[@class='country-name'][contains(text(),'United States')]

       2 Method -->   Select
       getDropDownListByText(Locators.DROP_DOWN_COUNTRY_SORT_BY_COUNTRY_NAME_TEXT,  Data.textCountryName);

      */



//COUNTRY DROP DOWN METHOD SELECT

//CALL METHOD
// getDropDownListByText(Locators.DROP_DOWN_COUNTRY_SORT_BY_COUNTRY_NAME_TEXT_BILLING,  Data.countryNameBilling);

// DECLARE BELOW
       /*  public void getDropDownListByText (By Locators, String text){
            Select select = new Select(driver.findElement(Locators));
            select.selectByVisibleText(text);
        }
        */



