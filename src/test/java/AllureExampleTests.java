import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureExampleTests extends TestBase {
    @Test
    @AllureId("10928")
    @DisplayName("Simple example test")
    @Story("Main menu")
    @Tags({@Tag("web"), @Tag("ui")})
    @Feature("Main page")
    void testNewsLink()
    {
        step("Opening the page");
        step("Clicking the news link");
        step("Checking the news page header");
    }

    @Test
    @Tags({@Tag("web"), @Tag("ui")})
    @DisplayName("Test Jobs link")
    void testJobsLink()
    {
        step("Opening the page");
        step("Clicking the jobs link");
        step("Checking the jobs page header");
    }

    @Test
    @AllureId("10930")
    @DisplayName("Open some link")
    @Story("Main menu")
    @Tags({@Tag("web"), @Tag("ui")})
    @Owner("allure8")
    @Feature("Main page")
    void testSomeLink() {
        step("Open main page");
        step("Click some link");
        step("Check page header equals Some page");
    }

    @Test
    @AllureId("10931")
    @DisplayName("Open some random link")
    @Story("Main menu")
    @Owner("Mike")
    @Tags({@Tag("web"), @Tag("ui")})
    @Feature("Main page")
    void testSomeRandomLink() {
        step("Open main page");
        step("Click some random link");
        step("Check page header equals Some random page");
    }

    @Test
    @AllureId("10941")
    @DisplayName("Open totally different link")
    @Story("Main menu")
    @Owner("Big Bad Mutuch")
    @Tags({@Tag("web"), @Tag("ui")})
    @Feature("Main page")
    void totallyDifferentLink() {
        step("Open main page");
        step("Click some totally different link");
        step("Check page header equals Some totally different page");
    }
}
