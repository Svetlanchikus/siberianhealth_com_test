package siberianhealth.pages.ru;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CentralPage {
    public CentralPage openPage() {
        open("/ru");

        return this;
    }

    public CentralPage CheckingPageComposition(){
        $(".with-video-button-banner__title").shouldHave(text("Международный бизнес, рожденный в Сибири"));
        $(".sw21-benefits__item:nth-child(1) > .sw21-benefits__desk").shouldHave(text("лет стабильного бизнеса в России и других странах"));
        $(".sw21-benefits__item:nth-child(1) > .sw21-benefits__desk").shouldHave(text("27"));
        $(".info-card-base .info-card__title").shouldHave(text("Высокотехнологичное производство"));

        return this;
    }
}
