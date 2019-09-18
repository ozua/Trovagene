package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.Iterator;
import java.util.Set;

public class MainTest extends BaseTest {

    @Test
    public void loadAboutUsPageFromNavMenuTest(){
        AboutUsPage aboutUsPage = homePage.clickOnNavMenuAboutUsItem();
        Assert.assertTrue(aboutUsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadAboutUsPageFromMainMenuTest(){
        AboutUsPage aboutUsPage = homePage.clickOnAboutUsMainMenuItem();
        Assert.assertTrue(aboutUsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadAboutUsPageFromFooterTest(){
        AboutUsPage aboutUsPage = homePage.clickOnFooterAboutUsItem();
        Assert.assertTrue(aboutUsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadAboutUsPageFromSubMenuTest(){
        AboutUsPage aboutUsPage = homePage.clickOnSubMenuOurFocusItem();
        Assert.assertTrue(aboutUsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadOnvansertibPageFromNavMenuTest(){
        OnvansertibPage onvansertibPage = homePage.clickOnNavMenuOnvansertibItem();
        Assert.assertTrue(onvansertibPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadOnvansertibPageFromMainMenuTest(){
        OnvansertibPage onvansertibPage = homePage.clickOnOnvansertibMainMenuItem();
        Assert.assertTrue(onvansertibPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadOnvansertibPageFromFooterTest(){
        OnvansertibPage onvansertibPage = homePage.clickOnFooterOnvansertibItem();
        Assert.assertTrue(onvansertibPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadOnvansertibPageFromButtonTest(){
        OnvansertibPage onvansertibPage = homePage.clickOnLearnMoreAboutOnvansertibButton();
        Assert.assertTrue(onvansertibPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadOnvansertibPageFromSubMenuTest(){
        OnvansertibPage onvansertibPage = homePage.clickOnSubMenuOnvansertibOverviewItem();
        Assert.assertTrue(onvansertibPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadOurClinicalTrialsPageFromNavMenuTest(){
        OurClinicalTrialsPage ourClinicalTrialsPage = homePage.clickOnNavMenuOurClinicalTrialsItem();
        Assert.assertTrue(ourClinicalTrialsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadOurClinicalTrialsPageFromMainMenuTest(){
        OurClinicalTrialsPage ourClinicalTrialsPage = homePage.clickOnOurClinicalTrialsMainMenuItem();
        Assert.assertTrue(ourClinicalTrialsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadOurClinicalTrialsPageFromFooterTest(){
        OurClinicalTrialsPage ourClinicalTrialsPage = homePage.clickOnFooterOurClinicalTrialsItem();
        Assert.assertTrue(ourClinicalTrialsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void watchNewVideoFromTopBarTest(){
        OurClinicalTrialsPage ourClinicalTrialsPage = homePage.clickOnwatchNewVideoFromTopBarItem();
        Assert.assertTrue(ourClinicalTrialsPage.isPageLoaded(), "About Us page wasn't loaded");

        WebElement video = webDriver.findElement(By.xpath("//div[@id='wistia_77.big_play_button_graphic']"));
        video.click();
        String subWindowHandler = null;
        Set<String> handles = webDriver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        webDriver.switchTo().window(subWindowHandler); // switch to popup window
    }

    @Test
    public void loadInvestorsPageFromMainMenuTest(){
        InvestorsPage investorsPage = homePage.clickOnInvestorsMainMenuItem();
        String subWindowHandler = null;
        Set<String> handles = webDriver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        webDriver.switchTo().window(subWindowHandler); // switch to popup window
        Assert.assertTrue(investorsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadContactPageFromMainMenuTest(){
        ContactPage contactPage = homePage.clickOnContactMainMenuItem();
        Assert.assertTrue(contactPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadPipelinePageFromNavMenuTest(){
        PipelinePage pipelinePage = homePage.clickOnNavMenuPipelineItem();
        Assert.assertTrue(pipelinePage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadPipelinePageFromFooterTest(){
        PipelinePage pipelinePage = homePage.clickOnFooterPipelineItem();
        Assert.assertTrue(pipelinePage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadPipelinePageFromSubMenuTest(){
        PipelinePage pipelinePage = homePage.clickOnSubMenuPipelineItem();
        Assert.assertTrue(pipelinePage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadRecentNewsPageFromNavMenuTest(){
        RecentNewsPage recentNewsPage = homePage.clickOnNavMenuRecentNewsItem();
        String subWindowHandler = null;
        Set<String> handles = webDriver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        webDriver.switchTo().window(subWindowHandler); // switch to popup window
        Assert.assertTrue(recentNewsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

    @Test
    public void loadRecentNewsPageFromFooterTest(){
        RecentNewsPage recentNewsPage = homePage.clickOnFooterRecentNewsItem();
        String subWindowHandler = null;
        Set<String> handles = webDriver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        webDriver.switchTo().window(subWindowHandler); // switch to popup window
        Assert.assertTrue(recentNewsPage.isPageLoaded(), "About Us page wasn't loaded");
    }

}
