import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Vasili");
        $("#lastName").setValue("Volishevskii");
        $("#userEmail").setValue("Volishevskii@mail.ru");
        $(byText("Male")).click();
        $("#userNumber").setValue("7877987897");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOptionByValue("3");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--028").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $(byText("English")).click();
        $(".form-file .form-control-file").uploadFile(new File("C:/Users/volis/Desktop/test.jpg"));
        $(byText("Reading")).click();
        $("#currentAddress").setValue("Krasnodar street gorkogo 53");
        $("#state").click();
        $(byText("Uttar Pradesh")).click();
        $("#city").click();
        $(byText("Merrut")).click();
        $("#submit").click();

        $(".table-responsive").shouldHave(text("Vasili Volishevskii"));
        $(".table-responsive").shouldHave(text("Volishevskii@mail.ru"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("7877987897"));
        $(".table-responsive").shouldHave(text("28 March,1994"));
        $(".table-responsive").shouldHave(text("English"));
        $(".table-responsive").shouldHave(text("Reading"));
        $(".table-responsive").shouldHave(text("test.jpg"));
        $(".table-responsive").shouldHave(text("Krasnodar street gorkogo 53"));
        $(".table-responsive").shouldHave(text("Uttar Pradesh Merrut"));
        $("#closeLargeModal").click();



    }
}

