package PageFactory;

import TechnicalKeyword.TechnicalKeyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

    WebDriver driver;
    TechnicalKeyword technicalKeyword = new TechnicalKeyword();
    String first_Name, last_Name;

    @FindBy(id = "liUser")
    public WebElement userButton;

    @FindBy(id = "CreateNewUser")
    public WebElement createNewUserButton;

    @FindBy(id = "UserMasters_FirstName")
    public WebElement firstNameText;

    @FindBy(id = "UserMasters_MiddleName")
    public WebElement middleNameText;

    @FindBy(id = "UserMasters_LastName")
    public WebElement lastNameText;


    @FindBy(id = "dllRole")
    public WebElement role;

    @FindBy(id = "UserMasters_EmailId")
    public WebElement emailIdText;

    @FindBy(id = "UserMasters_Contact")
    public WebElement contactText;

    @FindBy(id = "UserMasters_Gender")
    public WebElement gender;

    @FindBy(id = "UserMasters_DateOfBirth")
    public WebElement dateOfBirthText;

    @FindBy(id = "dllCountry")
    public WebElement country;

    @FindBy(id = "dllState")
    public WebElement state;

    @FindBy(id = "dllSuburb")
    public WebElement suburb;

    @FindBy(id = "UserMasters_DateOfJoining")
    public WebElement dateOfJoiningText;

    @FindBy(id = "UserProfileDetails_ZipCode")
    public WebElement zipCodeText;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(id = "listOfUser")
    public  WebElement userList;


    public UserPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void createNewUser(String firstName, String middleName, String lastName, String role1,
                              String emailId, String contact, String dateOfBirth, String country1, String state1,
                              String suburb1, String dateOfJoining, String zipCode  ) {

        first_Name = firstName;
        last_Name = lastName;
        userButton.click();
        createNewUserButton.click();
        technicalKeyword.enterText(driver,firstNameText, first_Name);
        technicalKeyword.enterText(driver, middleNameText, middleName);
        technicalKeyword.enterText(driver,lastNameText, last_Name);
        technicalKeyword.selectDropDown(role, role1);
        technicalKeyword.enterText(driver, emailIdText, emailId);
        technicalKeyword.enterText(driver,contactText, contact);
        technicalKeyword.radioButton(driver, gender);
        technicalKeyword.enterText(driver,dateOfBirthText,dateOfBirth);
        technicalKeyword.selectDropDown(country, country1);
        technicalKeyword.selectDropDown(state, state1);
        technicalKeyword.selectDropDown(suburb, suburb1);
        technicalKeyword.enterText(driver, dateOfJoiningText, dateOfJoining);
        technicalKeyword.enterText(driver,zipCodeText, zipCode);
        saveButton.click();
    }

    public Boolean verifyNewUser(){
        return technicalKeyword.elementExists(driver, userList, first_Name +" "+last_Name, 1 );

    }


}