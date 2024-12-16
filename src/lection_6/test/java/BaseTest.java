import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    void initBeforeClass() {
        Configuration.baseUrl = "https://zhcom.ru";
        Configuration.browserSize = "1366x768";
        Configuration.timeout = 30000;
    }
}
