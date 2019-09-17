package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecentNewsPage extends BasePage {

    @FindBy(xpath = "//section[@class='c-page-header-banner']")
    private WebElement pageHeaderBanner;

    /**
     * Constructor of RecentNewsPage
     * @param webDriver - webDriver instance
     */
    public RecentNewsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Method for checking Page loading conditions
     */
    public boolean isPageLoaded() {
        waitUntilElementIsVisible(pageHeaderBanner, 15);


        return pageHeaderBanner.isDisplayed();
    }
}
