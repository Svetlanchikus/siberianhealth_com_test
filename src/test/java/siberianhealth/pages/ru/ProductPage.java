package siberianhealth.pages.ru;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    public final SelenideElement headerLogoIcon = $(".sw21-header__logo > .icon");
    public final SelenideElement headerProductsButton = $(byText("Продукты"));
    public final SelenideElement menuHealthButton = $(byText("Витаминно-минеральные комплексы"));
    public String productNameText = null;
    public final SelenideElement productNameButton = $(".product-card:nth-child(1) .product-card__title");
    public final SelenideElement productNameTitleText = $(".product__name");
    public final SelenideElement shareLinkIcon = $(".product-sheet-b-aside__icon-share > .icon");
    public final SelenideElement shareLinkTitle = $(".popover-share");
    public String shareLinkTitleText = "Поделиться ссылкой";
    public final SelenideElement aboutProductButton = $(".product__menu-item_active > span");
    public String aboutProductButtonText = "О продукте";
    public final SelenideElement aboutProductTitle = $(".product__about > .product__about-title");
    public String aboutProductTitleText = "Описание";
    public final SelenideElement compositionButton = $(".product__menu-item:nth-child(2) > span");
    public String compositionButtonText = "Состав";
    public final SelenideElement compositionTitle = $(".product__about-title > span");
    public String compositionTitleText = "Состав";
    public final SelenideElement reviewsButton = $(".product__menu-item:nth-child(3)");
    public String reviewsButtonText = "Отзывы";
    public final SelenideElement reviewsTitle = $(".product-reviews__title");
    public String reviewsTitleText = "Мнения о продукте";


    public ProductPage openListProducts() {
        open("/c/-5331/");

        return this;
    }

    public ProductPage openProductsPage() {
        headerLogoIcon.click();
        headerProductsButton.click();
        menuHealthButton.click();
        productNameText = productNameButton.getText();
        productNameButton.click();
        productNameTitleText.shouldHave(text(productNameText));

        return this;
    }

    public ProductPage checkingProductsPage() {
        shareLinkIcon.click();
        shareLinkTitle.shouldHave(text(shareLinkTitleText));
        aboutProductButton.shouldHave(text(aboutProductButtonText));
        aboutProductButton.click();
        aboutProductTitle.shouldHave(text(aboutProductTitleText));
        compositionButton.shouldHave(text(compositionButtonText));
        compositionButton.click();
        compositionTitle.shouldHave(text(compositionTitleText));
        reviewsButton.shouldHave(text(reviewsButtonText));
        reviewsButton.click();
        reviewsTitle.shouldHave(text(reviewsTitleText));

        return this;
    }
}
