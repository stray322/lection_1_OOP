package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
/**
 * Класс проверки страницы квартиры
 * @autor Солянникова Анна
 * @version 1
 */
public class FlatsPage {
    /**
     * Функция открытия страницы квартиры
     */
    @Step("Проверить, что страница квартиры открылась")
    public FlatsPage flatsPageIsOpen() {
       $(By.xpath("//h1"))
                .shouldHave(partialText("планиров"))
                .shouldBe(visible);
        return this;
    }
}
