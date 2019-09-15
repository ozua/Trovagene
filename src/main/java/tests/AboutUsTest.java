package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;

public class AboutUsTest extends BaseTest {

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
}
