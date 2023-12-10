package siberianhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import siberianhealth.helpers.TestBase;
import siberianhealth.pages.ru.*;
import siberianhealth.pages.ru.Component.HeaderPage;

import static io.qameta.allure.Allure.step;

public class GUItests extends TestBase {
    @Test
    @DisplayName("Checking the \"Central\" page")
    void checkingTheCentralPageTest() {
        CentralPage centralForm = new CentralPage();
        step("Opening a web page", () -> {
            centralForm
                    .openPage();
        });

        step("Checking the page composition", () -> {
            centralForm
                    .checkingPageComposition()
                    .checkingButtons();
        });
    }

    @Test
    @DisplayName("Checking the \"About Us\" page")
    void checkingTheAboutUsPageTest() {
        AboutUsPage aboutUsPage = new AboutUsPage();
        step("Opening a web page", () -> {
            aboutUsPage
                    .openPage();
        });
        ;

        step("Checking the page composition", () -> {
            aboutUsPage
                    .checkingPageComposition()
                    .checkingButtons();
        });
    }


    @Test
    @DisplayName("Checking the \"Business With Us\" page")
    void checkingTheBusinessWithUsTest() {
        BusinessWithUsPage businessWithUsPage = new BusinessWithUsPage();
        step("Opening a web page", () -> {
            businessWithUsPage
                    .openPage();
        });

        step("Checking the page composition", () -> {
            businessWithUsPage
                    .checkingTitle()
                    .checkingButtons();
        });
    }


    @Test
    @DisplayName("Checking the \"Company news\" page")
    void checkingTheCompanyNewsPageTest() {
        CompanyNewsPage companyNewsPage = new CompanyNewsPage();
        step("Opening a web page", () -> {
            companyNewsPage
                    .openPage();
        });

        step("Checking the page composition", () -> {
            companyNewsPage
                    .checkingPageComposition()
                    .checkingCalendar()
                    .checkingNewsLinks();
        });
    }


    @Test
    @DisplayName("Checking the \"Header\" menu")
    void checkingTheHeaderMenuTest() {
        HeaderPage headerAllPage = new HeaderPage();

        step("Opening the drop-down list", () -> {
            headerAllPage
                    .openCentralPage()
                    .checkingMenuOnSite()
                    .checkingMenuButtons();
        });
    }

    @Test
    @DisplayName("Checking the products page")
    void checkingProductsPageTest() {
        ProductPage productPage = new ProductPage();

        step("Open the list of products", () -> {
            productPage
                    .openListProducts();
        });

        step("Opening the product page", () -> {
            productPage
                    .openProductsPage()
                    .checkingProductsPage();
        });
    }
}
