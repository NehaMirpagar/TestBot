package PageFactory;


import TechnicalKeyword.TechnicalKeyword;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TaskTab {

    WebDriver driver;

    TechnicalKeyword technicalKeyword = new TechnicalKeyword();
    String taskNameNewVerify;

    @FindBy(id = "liTask")
    public
    WebElement taskTab;

    @FindBy(id = "CreateNewTask")
    public WebElement taskButton;

    @FindBy(id = "WorkCategory")
    public WebElement workCategory;
  /*  public Select getWorkCategory(){
        return new Select(workCategory);
    }*/

    @FindBy(id = "TaskName")
    public WebElement taskName;

    @FindBy(id = "EstimatedTime")
    public WebElement estimatedTime;

    @FindBy(xpath = "//div[@class='example']//div[4]//div[2]//div[1]//label[2]")
    public WebElement priority;

    @FindBy(xpath = "//label[@id='No']")
    public WebElement addStage;

    @FindBy(id = "WorkSubCategories")
    public WebElement subcategory;

    @FindBy(id = "DueDate")
    public WebElement dueDate;

    @FindBy(id = "ClientName")
    public WebElement clientNameValue;

    public Select getClientName() {
        return new Select(clientNameValue);
    }

    @FindBy(id = "Description")
    public WebElement description;

    @FindBy(id = "Assignee")
    public WebElement assigneeValue;

    public Select getAssignee() {

        return new Select(assigneeValue);
    }

    @FindBy(id = "SaveTask")
    public WebElement saveButton;

    @FindBy(id = "TaskList")
    public WebElement taskListTable;

    @FindBy (id = "TaskList_next")
    public WebElement nextButton;


    public TaskTab(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void TaskTabButton() {
        taskTab.click();
    }

    public void NewTaskButton() {
        taskButton.click();
    }
    public void WorkCategory() {
        technicalKeyword.selectDropDown(workCategory, "IT");
    }

    public void TaskName(String taskNameNew) {
        technicalKeyword.enterText(driver,taskName, taskNameNew);
        taskNameNewVerify = taskNameNew;
            }

    public void EstiTime() {
        technicalKeyword.enterText(driver,estimatedTime,"444");
    }

    public void Priority() {
        priority.click();
    }

    public void AddStage() {
        addStage.click();
    }

    public void Subcategory() {
        subcategory.click();
    }

    public void DueDate() {
        dueDate.clear();
        dueDate.sendKeys("10-11-2018 15:48:21");
    }

    public void ClientName() {
        getClientName().selectByVisibleText("Testing");
    }

    public void Description() {

        technicalKeyword.enterText(driver,description,"Description text box");
    }

    public void Assignee() {
        getAssignee().selectByVisibleText("N T");
    }

    public void SaveButton() {

        saveButton.click();
    }


    public Boolean verifyTaskName() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Boolean isFound = false;
        while (!isFound && nextButton.isEnabled()){
                isFound = technicalKeyword.elementExists(driver, taskListTable, taskNameNewVerify, 1);
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                nextButton.click();
            }
         return isFound;
    }
}
