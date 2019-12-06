package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Slawek on 2019-11-24.
 */
public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[contains(text(),'HTML contact form')]")
    WebElement HTMLContactFormPage;

    public void enterHTMLContactFormPage(){
        HTMLContactFormPage.click();
    }

}
