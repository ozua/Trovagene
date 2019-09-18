package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TwitterPage extends BasePage {

    @FindBy(xpath = "//img[contains(@class,'ProfileAvatar-image')]")
    private WebElement profileAvatarPicture;

    /**
     * Constructor of AboutUsPage
     * @param webDriver - webDriver instance
     */
    public TwitterPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Method for checking Page loading conditions
     */
    public boolean isPageLoaded() {
        waitUntilElementIsVisible(profileAvatarPicture, 15);

        String expectedTitle = "Trovagene (@trovagene) | Twitter";
        Assert.assertEquals(getCurrentTitle(), expectedTitle);

        String expectedUrl = "https://twitter.com/trovagene";
        Assert.assertEquals(getCurrentUrl(), expectedUrl);

        return profileAvatarPicture.isDisplayed();
    }
}
