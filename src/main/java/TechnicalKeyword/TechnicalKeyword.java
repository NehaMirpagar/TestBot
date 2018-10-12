package TechnicalKeyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TechnicalKeyword {


    public void selectDropDown(WebElement element, String dropdownValue) {

        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(dropdownValue);

    }

    public void enterText(WebDriver driver, WebElement element, String txttoenter) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        element.sendKeys(txttoenter);
    }

    public Boolean elementExists(WebDriver driver, WebElement table,
                                 String cellTextEquals, int intCellToFind) {
        try {

            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(table));
            WebElement tableBody = table.findElement(By.tagName("tbody"));
            List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                    List<WebElement> td = row.findElements(By.tagName("td"));
                    if ((td.size() > 0) && (td.get(intCellToFind).getText().equals(cellTextEquals)))
                        return true;
            }

        } catch (Exception e) {
            System.out.println("Table or Column not found or New task not listed or new user not listed");
        }
        return false;
    }

    public void radioButton(WebDriver driver, WebElement element){

        // Store all the elements of same category in the list of WebElements

        WebElement oRadioButton = driver.findElement(By.id("UserMasters_Gender"));

        boolean bValue = oRadioButton.isSelected();


        // This will check that if the bValue is True means if the first radio button is selected

        if(bValue = true){

            // This will select Second radio button, if the first radio button is selected by default

            oRadioButton.click();

        }
    }

}
