package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AboutUsPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'NCT03303339')]")
    private WebElement externalLink1;

    @FindBy(xpath = "//div[contains(@class,'c-page-header-banner')]")
    private WebElement pageHeaderBanner;

    /**
     * Constructor of AboutUsPage
     * @param webDriver - webDriver instance
     */
    public AboutUsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Method for checking Page loading conditions
     */
    public boolean isPageLoaded() {
        waitUntilElementIsVisible(pageHeaderBanner, 15);

        String expectedTitle = "PLK1 Cancer, Treatment Acute Myeloid Leukemia | Trovagene";
        Assert.assertEquals(getCurrentTitle(), expectedTitle);

        String expectedUrl = "https://trovageneoncology.com/about/";
        Assert.assertEquals(getCurrentUrl(), expectedUrl);

        return pageHeaderBanner.isDisplayed();
    }
}
