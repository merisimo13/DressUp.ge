package DressUpOnlineShop.stepsObjects;

import DressUpOnlineShop.pageObject.RegisterPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static DressUpOnlineShop.dataObject.RegisterData.checkProfile;
import static DressUpOnlineShop.dataObject.RegisterData.emaile;

public class RegisterSteps extends RegisterPage {

    @Step ("click login button ")
    public RegisterSteps Login(){
        loginButton.click();
        Assert.assertEquals(checkProfile,checkText.getText());
        return  this;
    }

    @Step("set email veliu - {emaile}")
    public RegisterSteps Emaile(String emaile){
        emeilinput.setValue(emaile);
        return  this;
    }

    @Step("click createProfile button")
    public RegisterSteps creatProfileButton(){
        creatProfile.click();
        return  this;
    }

    @Step ("choose gender - {chooseGender}")
    public RegisterSteps genderWoman(String chooseGender){
        gender.selectRadio(chooseGender);
        return  this;
    }

    @Step ("set firstName veliu - {firstName}")
    public RegisterSteps firstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    @Step ("set lastName veliu - {lastName}")
    public RegisterSteps lastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }
    @Step ("set idNumber veliu - {idNumber}")
    public RegisterSteps idNumber(String idNumber) {
        idNumberInput.setValue(idNumber);
        return this;

    }

    @Step ("set password veliu - {password}")
    public RegisterSteps password(String password) {
        paswwordInput.setValue(password);
        return this;
    }
    @Step ("check Email input ")
    public RegisterSteps checkEmail(){
        checkEmailInput.shouldHave(Condition.value(emaile));
        return this;
    }

    @Step ("choose birthday day - {birthdayDay}")
    public RegisterSteps birthdayDAy(String birthdayDay){
        birhdayDayInput.selectOption(birthdayDay);
        return  this;
    }

    @Step ("choose birthday month  - {birthdayMonth}")
    public RegisterSteps birthdayMonth(String birthdayMonth){
       birthdayMonthInput.selectOption(birthdayMonth);
        return  this;
    }

    @Step ("choose birthday Year - {birthdayYear}")
    public RegisterSteps birthdayYear(String birthdayYear) {
        birthdayYearInput.selectOption(birthdayYear);
        return this;

    }

    @Step ("click news with email button")
    public RegisterSteps newsWithEmail() {
        newsWithEmail.click();
        return this;

    }

    @Step ("click news with sms button")
    public RegisterSteps newsWithSms() {
        newsWithSms.click();
        return this;

    }
    @Step ("check alert message")
    public RegisterSteps checkAlert(boolean allertExist) {
        Assert.assertEquals(errorMessage.is(Condition.visible),allertExist);
        return this;

    }
    @Step ("click register Button")
    public RegisterSteps registeButton() {
        registerButton.click();
        return this;

    }


}

