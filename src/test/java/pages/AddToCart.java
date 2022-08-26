package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class AddToCart {

    public class HomePage extends BaseTest {

        private WebDriver driver;
        WebDriverWait wait;

        @FindBy(xpath="//input[@name='keyword']")
        private WebElement searchBox;


        public HomePage(WebDriver driver) {
            wait = new WebDriverWait(driver, 15);
            this.driver = driver;
            PageFactory.initElements(this.driver, this);
        }

        public void searchInTextBox(String reptileName){
            searchBox.clear();
            searchBox.sendKeys(reptileName);
            searchBox.sendKeys(Keys.ENTER);
        }

        public boolean at() {
            return searchBox.isDisplayed();
        }
    }


}
