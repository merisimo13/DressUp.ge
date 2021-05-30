import DressUpOnlineShop.stepsObjects.CloseForManSteps;
import DressUpOnlineShop.utills.ChromeRunner;
import DressUpOnlineShop.utills.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class CloseForMan extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("choose product, add shopping cart")
    public void menClose() {
        CloseForManSteps step = new CloseForManSteps();

        step
                .chooseGender_3()
                .chooseBrand_2();


        sleep(5000);
    }


}
