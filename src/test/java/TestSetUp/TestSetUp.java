package TestSetUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestSetUp {


    public WebDriver driver;

    public WebDriver initBrowser(String browserName, String url) {

        if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Chrome")) {

            System.setProperty("webdriver.chrome.driver", "C://test//new//chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get(url);
        return driver;
    }

}
