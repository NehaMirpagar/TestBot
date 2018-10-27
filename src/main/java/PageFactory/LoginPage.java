package PageFactory;

import TechnicalKeyword.TechnicalKeyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    WebDriver driver;

    @FindBy(id = "EmailId")
    public
    WebElement username;

    @FindBy(id = "Password")
    public
    WebElement password;

    @FindBy(id = "loginclk")
    public
    WebElement loginButton;



    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void Username(String userId){
        username.sendKeys(userId);

    }
    public void Password(String pass){
        password.sendKeys(pass);

    }
    public void LoginButton(){


        loginButton.click();

    }

    public void FillInDetails(){

        Username("user1");
        Password("pass");


    }

}



