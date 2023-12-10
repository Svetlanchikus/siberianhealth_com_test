package siberianhealth.pages.ru;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class CentralPage {
    public final SelenideElement bannerTitle = $(".with-video-button-banner__title");
    public final String bannerTitleText = "Международный бизнес, рожденный в Сибири";
    public final SelenideElement highTechProductionTitle = $(".info-card-base .info-card__title");
    public final String highTechProductionTitleText = "Высокотехнологичное производство";
    public final SelenideElement greenCompositeTitle = $(".green-composite__title");
    public final String greenCompositeTitleText = "«Зеленые» составы";
    public final SelenideElement indexPageInvestingForFutureTitle = $(".info-card-investments .info-card__title");
    public final String indexPageInvestingForFutureTitleText = "Инвестиции в будущее";
    public final SelenideElement mamalandBannerTitle = $(".mamaland-main-banner__title");
    public final String mamalandBannerTitleText = "Женский онлайн-клуб, полный теплой поддержки, добрых советов и выгодных предложений";
    public final SelenideElement twoCardTitle = $(".two-card-banner__title");
    public final String twoCardTitleText = "Реальная возможность создать международный бизнес";
    public final SelenideElement newsMainTitle = $(".news-main__title");
    public final String newsMainTitleText = "Новости компании";
    public final SelenideElement topLeadersTitle = $(".blog-news-main__text .blog-news-main__title");
    public final String topLeadersTitleText = "ТОП-Лидеры Siberian Wellness";
    public final SelenideElement highTechProductionButton = $(".info-card:nth-child(3) span");
    public final String highTechProductionButtonText = "Узнать больше";
    public final String highTechProductionButtonLink = "https://valeolab.com/ru/";
    public final SelenideElement indexPageInvestingForFutureButton = $(".info-card-investments .sw21-base-button");
    public final String indexPageInvestingForFutureButtonText = "Наши экопроекты";
    public final String indexPageInvestingForFutureButtonLink = "https://worldaroundyou.org/?language=ru";
    public final SelenideElement mamalandBannerButton = $(".mamaland-main-banner__button");
    public final String mamalandBannerButtonText = "Вступить в MAMALAND";
    public final String mamalandBannerButtonLink = "https://siberianhealth.com/ru/mamaland";
    public final SelenideElement twoCardButton = $(".two-card-banner__button > .sw21-base-button");
    public final String twoCardButtonText = "Узнать больше";
    public final String twoCardButtonLink = "https://siberianhealth.com/ru/international_business";
    public final SelenideElement newsMainButton = $(".news-main__person-button");
    public final String newsMainButtonText = "Больше новостей";
    public final String newsMainButtonLink = "https://siberianhealth.com/ru/news";
    public final SelenideElement topLeadersButton = $(".blog-news-main__person-button");
    public final String topLeadersButtonText = "Подробнее";
    public final String topLeadersButtonLink = "https://siberianhealth.com/ru/leadership";


    public CentralPage openPage() {
        open("");

        return this;
    }

    public CentralPage checkingPageComposition() {
        bannerTitle.shouldHave(text(bannerTitleText));
        highTechProductionTitle.shouldHave(text(highTechProductionTitleText));
        greenCompositeTitle.shouldHave(text(greenCompositeTitleText));
        indexPageInvestingForFutureTitle.shouldHave(text(indexPageInvestingForFutureTitleText));
        mamalandBannerTitle.shouldHave(text(mamalandBannerTitleText));
        twoCardTitle.shouldHave(text(twoCardTitleText));
        newsMainTitle.shouldHave(text(newsMainTitleText));
        topLeadersTitle.shouldHave(text(topLeadersTitleText));
        return this;
    }

    public CentralPage checkingButtons() {
        highTechProductionButton.shouldHave(text(highTechProductionButtonText));
        highTechProductionButton.click();
        checkingTheOpenTabAndThenClosing(highTechProductionButtonLink, true);
        indexPageInvestingForFutureButton.shouldHave(text(indexPageInvestingForFutureButtonText));
        indexPageInvestingForFutureButton.click();
        checkingTheOpenTabAndThenClosing(indexPageInvestingForFutureButtonLink, true);
        mamalandBannerButton.shouldHave(text(mamalandBannerButtonText));
        mamalandBannerButton.click();
        checkingTheOpenTabAndThenClosing(mamalandBannerButtonLink, false);
        twoCardButton.shouldHave(text(twoCardButtonText));
        twoCardButton.click();
        checkingTheOpenTabAndThenClosing(twoCardButtonLink, false);
        newsMainButton.shouldHave(text(newsMainButtonText));
        newsMainButton.click();
        checkingTheOpenTabAndThenClosing(newsMainButtonLink, false);
        topLeadersButton.shouldHave(text(topLeadersButtonText));
        topLeadersButton.click();
        checkingTheOpenTabAndThenClosing(topLeadersButtonLink, false);

        return this;
    }

    public CentralPage checkingTheOpenTabAndThenClosing(String urlWindow, Boolean openNewWindow) {
        if (openNewWindow) {
            switchTo().window(1);
            webdriver().shouldHave(url(urlWindow));
            switchTo().window(1).close();
            switchTo().window(0);
        } else {
            webdriver().shouldHave(url(urlWindow));
            back();
        }

        return this;
    }
}
