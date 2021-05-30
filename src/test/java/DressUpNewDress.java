import DressUpOnlineShop.stepsObjects.NewDressStep;
import DressUpOnlineShop.utills.ChromeRunner;
import DressUpOnlineShop.utills.Retry;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners(DressUpOnlineShop.utills.TestLister.class)
public class DressUpNewDress extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("choose product, add shopping cart")
    public void newDress() {
        NewDressStep step = new NewDressStep();

        step
                .chooseGenderButton()
                .chooseClose()
                .chooseBrand()
                .chooseSize()
                .SelectFirstProduct()
                .addProduct()
                .backProductPage()
                .shoppingcart()
                .deleteProduct()
                .backMainPage();

    }


}
