package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class GreenGrowLoginTest extends BaseTest {

    @Test
    public void loginFlowTest() {
        HomePage home = new HomePage(driver);
        home.clickLoginLink();

        LoginPage login = new LoginPage(driver);
        login.login("tomsmith", "SuperSecretPassword!");

        Assert.assertTrue(driver.getPageSource().contains("You logged into a secure area"));
    }
}
