package DressUpOnlineShop.stepsObjects;

import DressUpOnlineShop.pageObject.NewDressPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class NewDressStep extends NewDressPage {

    @Step ("choose geder women")
    public NewDressStep chooseGenderButton() {
        chooseGEnder_2.click();
        return this;
    }
    @Step("choose close for women")
    public NewDressStep chooseClose() {
        chooseClose.click();
        return this;
    }

    @Step("choose brand")
    public NewDressStep chooseBrand() {
        chooseBrand.click();
        return this;
    }
    @Step("choose size M")
    public NewDressStep chooseSize() {
        chooseSize.click();
        return this;
    }
    @Step("choose first product")
    public NewDressStep SelectFirstProduct() {
        selectFirstProduct.click();
        return this;
    }
    @Step ("add product in shoppingcart")
    public NewDressStep addProduct() {
        addProduct.click();
        //Assert.assertEquals();
        return this;
    }
    @Step ("continue shopping page")
    public NewDressStep backProductPage() {
        backproductpage.click();
        return this;
    }
    @Step ("go in shopping cart")
    public NewDressStep shoppingcart() {
       shoppingcart.click();
        return this;
    }
    @Step("delete product from shopping cart")
    public NewDressStep deleteProduct() {
        deleteProduct.click();
        return this;
    }
    @Step ("back home page")
    public NewDressStep backMainPage() {
        backMainPaga.click();
        return this;
    }

}
