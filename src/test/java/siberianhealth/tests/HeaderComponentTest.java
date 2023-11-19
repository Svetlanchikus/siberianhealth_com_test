package siberianhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import siberianhealth.helpers.TestBase;
import siberianhealth.pages.ru.CentralPage;
import siberianhealth.pages.ru.Component.HeaderPage;

import static io.qameta.allure.Allure.step;

public class HeaderComponentTest extends TestBase {

    CentralPage centralForm = new CentralPage();
    HeaderPage headerAllPage = new HeaderPage();

    @Test
    @Tag("all_tests")
    @DisplayName("checking the \"Products\" menu")
    void checkingTheProductsMenuTest() {
        step("Opening a web page", () -> {
            centralForm
                    .openPage();
        });

        step("Opening the drop-down list", () -> {
            headerAllPage
                    .checkingMenuOnSite()
                    .openProductsMenu()
                    .checkingProductsMenu();
        });
    }
}
