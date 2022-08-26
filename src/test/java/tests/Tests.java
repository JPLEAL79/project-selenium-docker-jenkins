package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {


    @Test
    public void testSearch() {

        String reptileName = "iguana";

        loginPage.Login(getProperty("emptyUser"),getProperty("emptyPass"));
        Assert.assertTrue(loginPage.at());
        loginPage.Login(getProperty("user"),getProperty("pass"));
        homePage.searchInTextBox(reptileName);



    }

}
