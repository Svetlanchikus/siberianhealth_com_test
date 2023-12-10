package siberianhealth.pages.ru.Component;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class HeaderPage {
    public final SelenideElement headerProductsButton = $(".sw21-header__nav").closest("div");

    public final String headerProductsButtonText = "Продукты";
    public final SelenideElement headerAboutCompanyButton = $(".sw21-header__nav").closest("div").closest("div");
    public final String headerAboutCompanyButtonText = "О компании";
    public final SelenideElement headerBusinessButton = $(".sw21-header__nav").closest("div").closest("div").closest("div");
    public final String headerBusinessButtonText = "Бизнес";
    public final SelenideElement headerBargainPurchaseButton = $(".sw21-header__nav").closest("div").closest("div").closest("div").closest("div");
    public final String headerBargainPurchaseButtonText = "Купить выгодн";
    public final SelenideElement headerShopButton = $(".sw21-snippet-icon-button__text > span");
    public final String headerShopButtonText = "Магазин";
    public final SelenideElement headerRegisterButton = $(".sw21-main-button");
    public final String headerRegisterButtonText = "Зарегистрироваться";


    public HeaderPage openCentralPage() {
        open("");
        return this;
    }

    public HeaderPage checkingMenuOnSite() {
        $(headerProductsButton).shouldHave(text(headerProductsButtonText));
        $(headerAboutCompanyButton).shouldHave(text(headerAboutCompanyButtonText));
        $(headerBusinessButton).shouldHave(text(headerBusinessButtonText));
        $(headerBargainPurchaseButton).shouldHave(text(headerBargainPurchaseButtonText));
        return this;
    }

    public HeaderPage checkingMenuButtons() {
        $(headerShopButton).shouldHave(text(headerShopButtonText));
        $(headerRegisterButton).shouldHave(text(headerRegisterButtonText));
        return this;
    }
}
