import DressUpOnlineShop.stepsObjects.CloseForManSteps;
import DressUpOnlineShop.utills.ChromeRunner;
import DressUpOnlineShop.utills.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;


public class CloseForMan extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("choose product for men")
    public void menClose() {
        CloseForManSteps step = new CloseForManSteps();

        step
                .chooseGender_3()
                .chooseBrand_2()
                .selectProductSort()
                .checkSortedPrice();
    }


}
