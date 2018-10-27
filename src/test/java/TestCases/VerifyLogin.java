/*package TestCases;
import PageFactory.LoginPage;
import TestSetUp.TestSetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin extends TestSetUp {

    WebDriver driver;
    @Test
    public void verifyValidLogin()

    {
        //Launch browser and specific url
        driver = initBrowser("Chrome", "https://theservicebot.com/TMSStaging");

        //Created Page Object using PageFactory
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);

        //Call the method
       login_page.Username("user1");
       login_page.Password("pass");
       login_page.LoginButton();

        //Verify the HomePage URL or Login Successful
        String ActualHomePageUrl =driver.getCurrentUrl();
        String ExpectedHomePageUrl = "https://theservicebot.com/TMSStaging/Home/DashBoard";
        Assert.assertEquals(ExpectedHomePageUrl, ActualHomePageUrl);


        driver.quit();

    }


}*/