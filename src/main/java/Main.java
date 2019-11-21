import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/lidiakucab/Downloads/chromedriver-2");
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://demoqa.com/keyboard-events-sample-form/");

        KeyboardEventsSampleForm keyboardEvents = new KeyboardEventsSampleForm(webdriver);
        keyboardEvents.findName(webdriver,"Lidia");
        keyboardEvents.findCurrentAddress(webdriver,"Krakow");
        keyboardEvents.findPermanentAddress(webdriver,"Płaszów");
        keyboardEvents.submitForm(webdriver);
    }
}
