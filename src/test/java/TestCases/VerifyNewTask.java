/*package TestCases;

import PageFactory.LoginPage;
import PageFactory.TaskTab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyNewTask {

    WebDriver driver;

    @Test

    public void VerifyCreatedTask()
    {
        //Launch browser and specific url
      //  driver = initBrowser("Chrome", "https://theservicebot.com/TMSStaging");

        //Created Page Object using PageFactory
        LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);

        //Call the method
        //login_page.loginToTDS("user1");

        TaskTab taskTab= PageFactory.initElements(driver, TaskTab.class);
       // taskTab.CreateNewTask();


    }
}
*/