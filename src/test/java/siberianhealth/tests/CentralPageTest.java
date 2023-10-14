package siberianhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import siberianhealth.helpers.TestBase;
import siberianhealth.pages.ru.CentralPage;
import siberianhealth.pages.ru.HeaderAllPage;

import static io.qameta.allure.Allure.step;

public class CentralPageTest extends TestBase {
    CentralPage centralForm = new CentralPage();
    HeaderAllPage headerAllPage = new HeaderAllPage();

    @Test
    @Tag("smoke")
    @Tag("all_tests")
    @DisplayName("Checking the \"Central\" page")
    void checkingTheCentralPageTest() {
        step("Opening a web page", () -> {
            centralForm
                    .openPage();
        });

        step("Checking the composition of the Header", () -> {
            headerAllPage
                    .checkingMenuOnSite()
                    .checkingMenuButtons();
        });

        step("Checking the page composition", () -> {
            centralForm
                    .CheckingPageComposition();
        });
    }
}
