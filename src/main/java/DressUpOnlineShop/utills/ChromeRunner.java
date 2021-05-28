package DressUpOnlineShop.utills;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    @BeforeTest
    public static void setUp(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        //Selenide.open("https://www.facebook.com/");
        Selenide.open("https://dressup.ge/ka/");

    }
}
