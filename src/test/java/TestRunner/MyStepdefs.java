package TestRunner;
import PageFactory.LoginPage;
import PageFactory.TaskTab;
import PageFactory.UserPage;
import TechnicalKeyword.TechnicalKeyword;
import TestSetUp.TestSetUp;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;


public class MyStepdefs extends TestSetUp {

    static WebDriver driver;

    TaskTab taskTab = new TaskTab(driver);
    UserPage userPage = new UserPage(driver);
    TechnicalKeyword technicalKeyword = new TechnicalKeyword();


    @Given("^user is on login page$")
    public void user_is_on_login_page() {

       // Launch browser and specific url
       driver = initBrowser("chrome", "https://theservicebot.com/TMSStaging");
    }

     @When("^he provides valid credentials$")
     public void he_provides_valid_credentials(DataTable dt) throws Throwable {
         LoginPage loginPage = new LoginPage(driver);
             List<Map<String, String>> list = dt.asMaps(String.class, String.class);
             System.out.println(list.get(0).get("Username"));
             System.out.println(list.get(0).get("Password"));
             loginPage.Username(list.get(0).get("Username"));
             loginPage.Password(list.get(0).get("Password"));

       //  loginPage.FillInDetails();
         loginPage.LoginButton();
         }


    @Then("^he should be able to login successfully$")
    public void he_should_be_able_to_login_successfully() throws Throwable {
        //Verify the HomePage URL or Login Successful
        String ActualHomePageUrl =driver.getCurrentUrl();
        String ExpectedHomePageUrl = "https://theservicebot.com/TMSStaging/Home/DashBoard";
        Assert.assertEquals(ActualHomePageUrl, ExpectedHomePageUrl );

       // driver.quit();

    }
    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        System.out.println("One the home page");

    }

    @When("^he creates new task and assign it to assignee$")
    public void he_creates_new_task_and_assign_it_to_assignee(DataTable dataTable) throws Throwable {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        taskTab.TaskTabButton();
        taskTab.NewTaskButton();
        taskTab.WorkCategory();
        taskTab.TaskName(list.get(0).get("Taskname"));
        taskTab.EstiTime();
        taskTab.Priority();
        taskTab.AddStage();
        taskTab.Subcategory();
        taskTab.DueDate();
        taskTab.ClientName();
        taskTab.Description();
        taskTab.Assignee();
        taskTab.SaveButton();
    }

    @Then("^new task should be created and Task list should be updated$")
    public void new_task_should_be_created_and_Task_list_should_be_updated() throws Throwable {

       Assert.assertEquals(true,taskTab.verifyTaskName());


    }


    @When("^creates new user$")
    public void createsNewUser(DataTable dataTable) throws Throwable {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        userPage.createNewUser(list.get(0).get("firstName"),
                list.get(0).get("middleName"),
                list.get(0).get("lastName"),
                list.get(0).get("role"),
                list.get(0).get("emailId"),
                list.get(0).get("contact"),
                list.get(0).get("dateOfBirth"),
                list.get(0).get("country"),
                list.get(0).get("state"),
                list.get(0).get("suburb"),
                list.get(0).get("dateOfJoining"),
                list.get(0).get("zipCode")
                );
    }

    @Then("^new user should ne listed in the user list$")
    public void newUserShouldNeListedInTheUserList() throws Throwable {
        Assert.assertEquals(true, userPage.verifyNewUser());
    }

/*    @When("^clicks on add attachment$")
    public void clicksOnAddAttachment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the new attachment should be successfully added$")
    public void theNewAttachmentShouldBeSuccessfullyAdded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
