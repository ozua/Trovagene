package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'www.trovageneoncology.com')]")
    private WebElement linkToMainPage;

    @FindBy(xpath = "//div[@class='c-page-header-banner']")
    private WebElement pageHeaderBanner;

    /**
     * Constructor of ContactPage
     * @param webDriver - webDriver instance
     */
    public ContactPage(WebDriver webDriver) {
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
