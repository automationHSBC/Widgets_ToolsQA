package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HTMLContactFormPage;
import pages.HomePage;

/**
 * Created by Slawek on 2019-11-24.
 */
public class HTMLContactFormTest extends TestBase{

    @Test
    public void fillInContactFormTest(){

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        HTMLContactFormPage htmlContactFormPage = PageFactory.initElements(driver,HTMLContactFormPage.class);
        homePage.enterHTMLContactFormPage();
        htmlContactFormPage.setFirstName("Slawomir");
        htmlContactFormPage.setLastName("Nycz");
        htmlContactFormPage.setCountry("Poland");
        htmlContactFormPage.clickOnGoogleLink1();
        driver.navigate().back();
        htmlContactFormPage.clickOnGoogleLink2();
        driver.navigate().back();
        htmlContactFormPage.insertTextAreaText("Text in Text Area");
        htmlContactFormPage.clickOnSubmitButton();
    }
}
