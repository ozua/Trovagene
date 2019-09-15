package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import pages.HomePage;


/**
 * BaseTest object class
 */
public class BaseTest {
    HomePage homePage;
    WebDriver webDriver;

    @BeforeMethod
    public void beforeTest(@Optional("firefox") String browserType,
                           @Optional("https://trovageneoncology.com/") String envURL) {

        switch (browserType.toLowerCase()){
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            default :
                WebDriverManager.iedriver().setup();
                webDriver = new InternetExplorerDriver();
        }

        webDriver.navigate().to(envURL);
        homePage = new HomePage(webDriver);
    }

    @AfterMethod
    public void atfer() {
        webDriver.close();
    }

}