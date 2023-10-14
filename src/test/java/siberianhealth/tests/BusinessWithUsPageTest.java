package siberianhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import siberianhealth.helpers.TestBase;
import siberianhealth.pages.ru.BusinessWithUsPage;
import siberianhealth.pages.ru.HeaderAllPage;

import static io.qameta.allure.Allure.step;

public class BusinessWithUsPageTest extends TestBase {
    BusinessWithUsPage businessWithUsPage = new BusinessWithUsPage();
    HeaderAllPage headerAllPage = new HeaderAllPage();

    @Test
    @Tag("smoke")
    @Tag("all_tests")
    @DisplayName("Checking the \"Business With Us\" page")
    void checkingTheBusinessWithUsTest() {
        step("Opening a web page", () -> {
            businessWithUsPage
                    .openPage();
        });

        step("Checking the composition of the Header", () -> {
            headerAllPage
                    .checkingMenuOnSite()
                    .checkingMenuButtons();
        });

        step("Checking the page composition", () -> {
            businessWithUsPage
                    .CheckingPageComposition();
        });
    }
}
