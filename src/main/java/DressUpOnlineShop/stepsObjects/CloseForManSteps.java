package DressUpOnlineShop.stepsObjects;

import DressUpOnlineShop.pageObject.CloseForManPage;
import io.qameta.allure.Step;

public class CloseForManSteps extends CloseForManPage {
    @Step("choose geder men")
    public CloseForManSteps chooseGender_3() {
        chooseGEnder_3.click();
        return this;
    }
    @Step("choose brand for man")
    public CloseForManSteps chooseBrand_2() {
        chooseBrand_2.click();
        return this;
    }

}