package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * HomePage object class
 */
public class HomePage extends BasePage {

    @FindBy(id = "logo")
    private WebElement mainLogo;

    @FindBy(id = "menu-item-7342")
    private WebElement mainMenuAboutUs;

    @FindBy(id = "menu-item-7346")
    private WebElement mainMenuOnvansertib;

    @FindBy(id = "menu-item-7350")
    private WebElement mainMenuOurClinicalTrials;

    @FindBy(id = "menu-item-7351")
    private WebElement mainMenuInvestors;

    @FindBy(id = "menu-item-7352")
    private WebElement mainMenuContact;

    @FindBy(xpath = "//a[@class='c-bannner-nav__link'][contains(text(),'About Us')]")
    private WebElement navMenuAboutUs;

    @FindBy(xpath = "//a[@class='c-bannner-nav__link'][contains(text(),'Onvansertib')]")
    private WebElement navMenuOnvansertib;

    @FindBy(xpath = "//a[@class='c-bannner-nav__link'][contains(text(),'Our Clinical Trials')]")
    private WebElement navMenuOurClinicalTrials;

    @FindBy(xpath = "//a[@class='c-bannner-nav__link'][contains(text(),'Pipeline')] ")
    private WebElement navMenuPipeline;

    @FindBy(xpath = "//a[@class='c-bannner-nav__link'][contains(text(),'Recent News')]")
    private WebElement navMenuRecentNews;

    @FindBy(xpath = "//li[@id='menu-item-7358']//a[contains(text(),'Onvansertib')]")
    private WebElement footerOnvansertib;

    @FindBy(xpath = "//li[@id='menu-item-7356']//a[contains(text(),'About Us')]")
    private WebElement footerAboutUs;

    @FindBy(xpath = "//a[contains(@class,'c-button c-button--middle c-button--blue-gradient')]")
    private WebElement learnMoreAboutOnvansertibButton;

    @FindBy(xpath = "//li[@id='menu-item-7357']//a[contains(text(),'Clinical Trials')]")
    private WebElement footerOurClinicalTrials;

    @FindBy(xpath = "//li[@id='menu-item-7359']//a[contains(text(),'Pipeline')]")
    private WebElement footerPipeline;

    @FindBy(xpath = "//li[@id='menu-item-7414']//a[contains(text(),'Recent News')]")
    private WebElement footerRecentNews;

    @FindBy(xpath = "//a[contains(text(),'Sitemap')]")
    private WebElement footerSitemap;

    @FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
    private WebElement footerPrivacyPolicy;

    @FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
    private WebElement footerTermsOfUse;

    @FindBy(xpath = "//aside[@id='custom_html-4']//a[1]")
    private WebElement footerFacebook;

    @FindBy(xpath = "//aside[@id='custom_html-4']//a[2]")
    private WebElement footerLinkedIn;

    @FindBy(xpath = "//aside[@id='custom_html-4']//a[3]")
    private WebElement footerTwitter;

    @FindBy(xpath = "//li[@id='menu-item-7347']")
    private WebElement subMenuPipeline;

    @FindBy(xpath = "//li[@id='menu-item-7345']")
    private WebElement subMenuOurFocus;

    @FindBy(xpath = "//li[@id='menu-item-7348']")
    private WebElement subMenuOnvansertibOverview;

    @FindBy(xpath = "//a[@id='tpbr_calltoaction']")
    private WebElement watchNewVideoFromTopBarButton;

    /**
     * Constructor of LoginPage
     * @param webDriver - webDriver instance
     */
    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Method for click on About Us item on the HomePage
     * @return - returns new AboutUsPage
     */
    public AboutUsPage clickOnNavMenuAboutUsItem() {
        navMenuAboutUs.click();

        return new AboutUsPage(webDriver);
    }

    public AboutUsPage clickOnAboutUsMainMenuItem() {
        mainMenuAboutUs.click();

        return new AboutUsPage(webDriver);
    }

    public AboutUsPage clickOnFooterAboutUsItem() {
        footerAboutUs.click();

        return new AboutUsPage(webDriver);
    }

    public AboutUsPage clickOnSubMenuOurFocusItem() {
        Actions builder = new Actions(webDriver);
        waitUntilElementIsClickable(mainMenuAboutUs, 10);
        builder.moveToElement(mainMenuAboutUs).build().perform();
        waitUntilElementIsClickable(subMenuOurFocus, 10);
        subMenuOurFocus.click();

        return new AboutUsPage(webDriver);
    }

    /**
     * Method for click on Onvansertib item on the HomePage
     * @return - returns new OnvansertibPage
     */
    public OnvansertibPage clickOnNavMenuOnvansertibItem() {
        navMenuOnvansertib.click();

        return new OnvansertibPage(webDriver);
    }

    public OnvansertibPage clickOnOnvansertibMainMenuItem() {
        mainMenuOnvansertib.click();

        return new OnvansertibPage(webDriver);
    }

    public OnvansertibPage clickOnFooterOnvansertibItem() {
        footerOnvansertib.click();

        return new OnvansertibPage(webDriver);
    }

    public OnvansertibPage clickOnLearnMoreAboutOnvansertibButton() {
        learnMoreAboutOnvansertibButton.click();

        return new OnvansertibPage(webDriver);
    }

    public OnvansertibPage clickOnSubMenuOnvansertibOverviewItem() {
        Actions builder = new Actions(webDriver);
        waitUntilElementIsClickable(mainMenuOnvansertib, 10);
        builder.moveToElement(mainMenuOnvansertib).build().perform();
        waitUntilElementIsClickable(subMenuOnvansertibOverview, 10);
        subMenuOnvansertibOverview.click();

        return new OnvansertibPage(webDriver);
    }

    /**
     * Method for click on Our Clinical Trials item on the HomePage
     * @return - returns new OurClinicalTrialsPage
     */
    public OurClinicalTrialsPage clickOnOurClinicalTrialsMainMenuItem() {
        mainMenuOurClinicalTrials.click();

        return new OurClinicalTrialsPage(webDriver);
    }

    public OurClinicalTrialsPage clickOnNavMenuOurClinicalTrialsItem() {
        navMenuOurClinicalTrials.click();

        return new OurClinicalTrialsPage(webDriver);
    }

    public OurClinicalTrialsPage clickOnFooterOurClinicalTrialsItem() {
        footerOurClinicalTrials.click();

        return new OurClinicalTrialsPage(webDriver);
    }

    public OurClinicalTrialsPage clickOnwatchNewVideoFromTopBarItem() {
        watchNewVideoFromTopBarButton.click();


        return new OurClinicalTrialsPage(webDriver);
    }

    /**
     * Method for click on Investors item on the HomePage
     * @return - returns new InvestorsPage
     */
    public InvestorsPage clickOnInvestorsMainMenuItem() {
        mainMenuInvestors.click();

        return new InvestorsPage(webDriver);
    }

    /**
     * Method for click on Contact item on the HomePage
     * @return - returns new ContactPage
     */
    public ContactPage clickOnContactMainMenuItem() {
        mainMenuContact.click();

        return new ContactPage(webDriver);
    }

    /**
     * Method for click on Pipeline item on the HomePage
     * @return - returns new PipelinePage
     */
    public PipelinePage clickOnNavMenuPipelineItem() {
        navMenuPipeline.click();

        return new PipelinePage(webDriver);
    }

    public PipelinePage clickOnFooterPipelineItem() {
        footerPipeline.click();

        return new PipelinePage(webDriver);
    }

    public PipelinePage clickOnSubMenuPipelineItem() {
        Actions builder = new Actions(webDriver);
        waitUntilElementIsClickable(mainMenuOnvansertib, 10);
        builder.moveToElement(mainMenuOnvansertib).build().perform();
        waitUntilElementIsClickable(subMenuPipeline, 10);
        subMenuPipeline.click();

        return new PipelinePage(webDriver);
    }

    /**
     * Method for click on Recent News item on the HomePage
     * @return - returns new RecentNewsPage
     */
    public RecentNewsPage clickOnNavMenuRecentNewsItem() {
        navMenuRecentNews.click();

        return new RecentNewsPage(webDriver);
    }

    public RecentNewsPage clickOnFooterRecentNewsItem() {
        footerRecentNews.click();

        return new RecentNewsPage(webDriver);
    }
//
//    /**
//     * Method for click on Contact item on the HomePage
//     * @return - returns new ContactPage
//     */
//    public ContactPage clickOnContactMainMenuItem() {
//        mainMenuContact.click();
//
//        return new ContactPage(webDriver);
//    }
//
//    /**
//     * Method for click on Contact item on the HomePage
//     * @return - returns new ContactPage
//     */
//    public ContactPage clickOnContactMainMenuItem() {
//        mainMenuContact.click();
//
//        return new ContactPage(webDriver);
//    }
//
//    /**
//     * Method for click on Contact item on the HomePage
//     * @return - returns new ContactPage
//     */
//    public ContactPage clickOnContactMainMenuItem() {
//        mainMenuContact.click();
//
//        return new ContactPage(webDriver);
//    }
//
//    /**
//     * Method for click on Facebook item on the HomePage
//     * @return - returns new FacebookPage
//     */
//    public FacebookPage clickOnFooterFacebookItem() {
//        footerFacebook.click();
//
//        return new FacebookPage(webDriver);
//    }
//
//    /**
//     * Method for click on LinkedIn item on the HomePage
//     * @return - returns new LinkedInPage
//     */
//    public LinkedInPage clickOnFooterLinkedInItem() {
//        footerLinkedIn.click();
//
//        return new LinkedInPage(webDriver);
//    }
//
//    /**
//     * Method for click on Twitter item on the HomePage
//     * @return - returns new TwitterPage
//     */
//    public TwitterPage clickOnFooterTwitterItem() {
//        footerTwitter.click();
//
//        return new TwitterPage(webDriver);
//    }

    /**
     * Method for checking HomePage loading conditions
     */
    public boolean isPageLoaded() {
        waitUntilElementIsVisible(mainLogo, 10);

        return mainLogo.isDisplayed();
    }
}
