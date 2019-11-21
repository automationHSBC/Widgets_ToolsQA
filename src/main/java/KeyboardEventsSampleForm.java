import org.bouncycastle.util.encoders.UrlBase64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yecht.Data;

public class KeyboardEventsSampleForm {
    WebDriver webDriver;
    By name = By.id("userName");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submint = By.id("submit");

    public KeyboardEventsSampleForm(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void findName(WebDriver webDriver, String nameForm){
        webDriver.findElement(name).sendKeys(nameForm);
    }

    public void findCurrentAddress(WebDriver webDriver, String currentAddressForm){
        webDriver.findElement(currentAddress).sendKeys(currentAddressForm);
    }

    public  void findPermanentAddress(WebDriver webDriver, String permanentAddressForm){
        webDriver.findElement(permanentAddress).sendKeys(permanentAddressForm);
    }

    public void submitForm(WebDriver webDriver){
        webDriver.findElement(submint).submit();
    }


}
