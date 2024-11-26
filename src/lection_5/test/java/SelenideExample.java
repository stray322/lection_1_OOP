import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class SelenideExample {
    @Test
    public void test1() {
        open("https://zhcom.ru/");
        $(By.cssSelector("a[class='_js-link-flats']"))
                .shouldBe(visible)
                .shouldHave(text("Квартиры"))
                .click();
        $(By.cssSelector("a[href='/#projects']"))
                .shouldBe(visible)
                .click();
        webdriver().shouldHave(url("https://zhcom.ru/#projects"));
        $(By.xpath("//*[contains(@name, 'SubscriptionForm[name]')]"))
                .setValue("Анна")
                .click();
        $(By.xpath("//*[contains(@name, 'SubscriptionForm[email]')]"))
                .setValue("tsybizova.anya@mail.ru")
                .click();
        sleep(5000);

    }
}
