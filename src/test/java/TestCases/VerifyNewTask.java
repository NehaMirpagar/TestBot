package TestCases;

import PageFactory.LoginPage;
import PageFactory.TaskTab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static TestSetUp.TestSetUp.initBrowser;

public class VerifyNewTask {

    WebDriver driver;

    @Test

    public void VerifyCreatedTask()
    {
        //Launch browser and specific url
        driver = initBrowser("Chrome", "https://theservicebot.com/TMSStaging");

        //Created Page Object using PageFactory
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);

        //Call the method
        //login_page.loginToTDS("nilesh@gmail.com","test");

        TaskTab taskTab= PageFactory.initElements(driver, TaskTab.class);
       // taskTab.CreateNewTask();


    }
}
