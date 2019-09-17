package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OurClinicalTrialsPage;

public class OurClinicalTrialsTest extends BaseTest {

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
}
