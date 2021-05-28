package DressUpOnlineShop.stepsObjects;

import DressUpOnlineShop.pageObject.RegisterPage;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class RegisterSteps extends RegisterPage {
    public RegisterSteps Login(){
        loginButton.click();
        return  this;
    }

    public RegisterSteps Emaile(String emaile){
        emeilinput.setValue(emaile);
        return  this;
    }

    public RegisterSteps creatProfileButton(){
        creatProfile.click();
        return  this;
    }
    public RegisterSteps genderWoman(String chooseGender){
        gender.selectRadio(chooseGender);
        return  this;
    }

    public RegisterSteps firstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }
    public RegisterSteps lastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }


}
