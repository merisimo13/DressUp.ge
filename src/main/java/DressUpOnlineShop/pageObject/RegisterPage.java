package DressUpOnlineShop.pageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public SelenideElement

             loginButton = $(".login"),
             emeilinput = $(byName("email_create")),
             creatProfile = $(byName("SubmitCreate")),
             gender = $(byName("id_gender")),
             checkText= $("h3"),
             firstNameInput =$(byName("customer_firstname")),
             lastNameInput = $(byName("customer_lastname")),
             idNumberInput =$(byName("customer_prdNum")),
             paswwordInput = $(byName("passwd")),
             checkEmailInput = $(byName("email")),
             birhdayDayInput = $(byName("days")),
             birthdayMonthInput = $(byName("months")),
             birthdayYearInput = $(byName("years")),
             newsWithEmail = $(byName("newsletter")),
             newsWithSms = $(byName("optin")),
             errorMessage =$ (".alert-danger"),
             registerButton = $( byName( "submitAccount"));

}
