import DressUpOnlineShop.stepsObjects.LogInLogOutStep;
import DressUpOnlineShop.utills.ChromeRunner;
import DressUpOnlineShop.utills.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import java.awt.*;

import static DressUpOnlineShop.dataObject.LogInLogOutData.*;

public class LogInLogOut extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("log in and log out in dreesup")
    public void LogInLogOutPage() {
        LogInLogOutStep step = new LogInLogOutStep();

        step
                .Login_2()
                .emileInput_2(emaile_2)
                .passwordInput_2(pass)
                .authorizationButton()
                .checkHelloText(true)
                .logOutButton()
                .checkHelloText(false);

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.MINOR)
    @Description("wish list")
    public void wishlist() throws AWTException {
        LogInLogOutStep step = new LogInLogOutStep();

        step
                .Login_2()
                .emileInput_2(emaile_2)
                .passwordInput_2(pass)
                .authorizationButton()
                .wishListButton()
                .wishListName(nameForWishList)
                .submitWishlist()
                .removeWishList()
                .logOutButton();

    }


}