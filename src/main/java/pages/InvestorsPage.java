package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestorsPage extends BasePage {

    @FindBy(xpath = "//a[@id='home_ove_btn_1']")
    private WebElement downloadCompanyOverviewButton;

    /**
     * Constructor of InvestorsPage
     * @param webDriver - webDriver instance
     */
    public InvestorsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Method for checking Page loading conditions
     */
    public boolean isPageLoaded() {
        waitUntilElementIsClickable(downloadCompanyOverviewButton, 15);


        return downloadCompanyOverviewButton.isEnabled();
    }
}
