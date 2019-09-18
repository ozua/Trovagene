package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurClinicalTrialsPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'c-phase-card')]//a[contains(text(),'NCT03303339')]")
    private WebElement externalLink1;

    @FindBy(xpath = "//div[contains(@class,'c-page-header-banner')]")
    private WebElement pageHeaderBanner;

    @FindBy(xpath = "//img[@id='wistia_61.thumbnail_img']")
    private WebElement newVideo;

    /**
     * Constructor of OurClinicalTrialsPage
     * @param webDriver - webDriver instance
     */
    public OurClinicalTrialsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }


    /**
     * Method for checking Page loading conditions
     */
    public boolean isPageLoaded() {
        waitUntilElementIsVisible(pageHeaderBanner, 15);
        waitUntilElementIsClickable(newVideo, 15);

        return pageHeaderBanner.isDisplayed();
    }
}
