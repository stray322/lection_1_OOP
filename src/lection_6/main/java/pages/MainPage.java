package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    @FindBy(xpath = "//a[@href='/#projects']")
    private SelenideElement projects;

    @FindBy(xpath = "//a[@class='_js-link-flats']")
    private SelenideElement flats;

    @Step("Проверить, что страница проекты открылась")
    public Projects showProjects() {
        projects
                .shouldBe(visible)
                .shouldHave(text("Проекты"))
                .click();
        return page(Projects.class);
    }

    @Step("Проверить, что страница квартиры открылась")
    public FlatsPage goToFlats() {
        flats
                .shouldBe(visible)
                .shouldHave(text("Квартиры"))
               .click();
        return page(FlatsPage.class);
    }
}
