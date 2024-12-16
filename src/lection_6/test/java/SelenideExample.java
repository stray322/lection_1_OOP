import dao.Person;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.*;

public class SelenideExample extends BaseTest{

    @BeforeMethod
    void initBeforeMethod() {
        open("/");
    }

    @Test(description = "Open Projects page, check Subscription, checkNameText, checkEmailText")
    public void projectsOpenTest() {
        page(MainPage.class)
                    .showProjects()
                    .checkSubscriptionVisible()
                    .checkTextInput();
        sleep(5000);
    }

    @Test(description = "Open Flats page")
    public void openFlatsPageTest() {
        page(MainPage.class)
                .goToFlats()
                .flatsPageIsOpen();
        sleep(7000);
    }

    @Test(description = "Create Person test")
    public void createPersonTest() {
        Person person = new Person.Builder()
                .withName("Solyannikova Anna Yuryevna")
                .withAge(23)
                .withWeight(55)
                .withHeight(162)
                .withSize("S")
                .build();
    }
}
