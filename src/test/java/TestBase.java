import org.junit.jupiter.api.BeforeAll;

import static io.qameta.allure.Allure.step;

public class TestBase {
    @BeforeAll
    public static void setUp()
    {
        step("doing some preliminary set-up");
    }
}
