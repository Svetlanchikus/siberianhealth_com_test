package siberianhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import siberianhealth.helpers.TestBase;
import siberianhealth.pages.ru.CompanyNewsPage;
import siberianhealth.pages.ru.Component.HeaderPage;

import static io.qameta.allure.Allure.step;

public class CompanyNewsTest extends TestBase {

    CompanyNewsPage companyNewsPage = new CompanyNewsPage();
    HeaderPage headerAllPage = new HeaderPage();

    @Test
    @Tag("smoke")
    @Tag("all_tests")
    @DisplayName("Checking the \"Company news\" page")
    void checkingTheCompanyNewsPageTest() {
        step("Opening a web page", () -> {
            companyNewsPage
                    .openPage();
        });

        step("Checking the composition of the Header", () -> {
            headerAllPage
                    .checkingMenuOnSite()
                    .checkingMenuButtons();
        });

        step("Checking the page composition", () -> {
            companyNewsPage
                    .CheckingPageComposition();
        });
    }
}
