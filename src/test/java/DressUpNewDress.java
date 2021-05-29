import DressUpOnlineShop.stepsObjects.NewDressStep;
import DressUpOnlineShop.utills.ChromeRunner;
import DressUpOnlineShop.utills.Retry;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class DressUpNewDress extends ChromeRunner {
    @Test (retryAnalyzer = Retry.class)
    public void newDress (){
        NewDressStep step = new NewDressStep();

        step
                .chooseGenderButton();






        sleep(500);



    }

}
