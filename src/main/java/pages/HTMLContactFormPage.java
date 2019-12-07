package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Slawek on 2019-11-24.
 */
public class HTMLContactFormPage {
    WebDriver driver;

    public HTMLContactFormPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@class='firstname']")
    WebElement FirstNameTextBox;
    @FindBy(xpath = "//input[ @id='lname']")
    WebElement LastNameTextBox;
    @FindBy(xpath = "//input[@name='country']")
    WebElement CountryTextBox;
    @FindBy(linkText = "Google Link")
    WebElement GoogleLink;
    @FindBy(xpath = "//a[contains(text(),'Google Link is here')]")
    WebElement GoogleLinkIsHere;
    @FindBy(xpath = "//textarea[@id='subject']")
    WebElement TextArea;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement SubmitButton;

    public void setFirstName(String firstName) {
        FirstNameTextBox.sendKeys(firstName);
    }
    public void setLastName(String lastName) {
        LastNameTextBox.sendKeys(lastName);
    }
    public void setCountry(String country) {
        CountryTextBox.sendKeys(country);
    }

    public void clickOnGoogleLink1() {
        GoogleLink.click();
    }

    public void clickOnGoogleLink2() {
        GoogleLinkIsHere.click();
    }

    public void insertTextAreaText(String s) {
        TextArea.sendKeys(s);
    }

    public void clickOnSubmitButton() {
        SubmitButton.submit();
    }
}

