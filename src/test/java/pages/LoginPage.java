package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class LoginPage extends BaseTest {


    WebDriver driver;
    WebDriverWait wait;

    @FindBy(linkText = "Sign In")
    private WebElement logIn;
    @FindBy(xpath = "//*[@name='username']")
    private WebElement userField;
    @FindBy(xpath = "//*[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@name='signon']")
    private WebElement loginButton;


    // Validations

    @FindBy(xpath = "//*[@id='Catalog']/form/p[1]")
    private WebElement validate_correct_page;

    @FindBy(xpath = "//*[@id='WelcomeContent']")
    private WebElement validate_correct_user;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(this.driver, this);
    }

    public void Login(String email, String password) {
        logIn.click();
        userField.clear();
        userField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.click();
    }


    public boolean at(){
        return validate_correct_page.isDisplayed();
    }


    public boolean ok() {
        return validate_correct_user.isDisplayed();
    }
}




