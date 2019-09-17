package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OnvansertibPage;

public class OnvansertibTest extends BaseTest {

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
}
