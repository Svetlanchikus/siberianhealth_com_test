package siberianhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import siberianhealth.helpers.TestBase;
import siberianhealth.pages.ru.AboutUsPage;
import siberianhealth.pages.ru.HeaderAllPage;

import static io.qameta.allure.Allure.step;

public class AboutUsPageTest extends TestBase {
    AboutUsPage aboutUsPage = new AboutUsPage();
    HeaderAllPage headerAllPage = new HeaderAllPage();

    @Test
    @Tag("smoke")
    @Tag("all_tests")
    @DisplayName("Checking the \"About Us\" page")
    void checkingTheAboutUsPageTest() {
        step("Opening a web page", () -> {
            aboutUsPage
                    .openPage();
        });

        step("Checking the composition of the Header", () -> {
            headerAllPage
                    .checkingMenuOnSite()
                    .checkingMenuButtons();
        });

        step("Checking the page composition", () -> {
            aboutUsPage
                    .CheckingPageComposition();
        });
    }
}
