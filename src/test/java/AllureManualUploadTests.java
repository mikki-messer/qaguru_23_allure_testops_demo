import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureManualUploadTests extends TestBase{
    @Test
    @DisplayName("Empty demo test")
    @Story("Footer menu")
    @Feature("Main page")
    void testAboutUsLink()
    {
        step("Opening the page");
        step("Scrolling to the bottom of the page");
        step("Clicking the About Us link");
        step("Checking the About Us header");
    }

    @Test
    @AllureId("10943")
    @Tags({@Tag("web"), @Tag("ui")})
    @DisplayName("Second demo test")
    void testVacanciesLink()
    {
        step("Opening the page");
        step("Scrolling to the bottom of the page");
        step("Clicking the About Us link");
        step("Checking the About Us header");
    }
}
