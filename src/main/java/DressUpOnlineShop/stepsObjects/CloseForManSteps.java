package DressUpOnlineShop.stepsObjects;

import DressUpOnlineShop.pageObject.CloseForManPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

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
    @Step("choose brand for man")
    public CloseForManSteps selectProductSort() {
        selectProductSort.selectOption("ფასი: დაბალი > მაღალი");
        return this;
    }
    @Step("check sorted price")
    public CloseForManSteps checkSortedPrice(){
        for (int i = 0; i< allProduct.size()-1; i++){

            String prev = $(".price",i).getText();
            String next = $(".price",i+1).getText();
            int isless = prev.compareTo(next);
            Assert.assertTrue(isless != 1);
        }
        return this;
    }

}