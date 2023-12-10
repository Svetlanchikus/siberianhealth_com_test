package siberianhealth.pages.ru;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class BusinessWithUsPage {
    public final SelenideElement businessBannerTitle = $(".business-banner__title");
    public final String businessBannerText = "Начни бизнес в индустрии Wellness";
    public final SelenideElement howToStartTitle = $(".how-to-start__title");
    public final String howToStartText = "В чем суть нашего бизнеса?";
    public final SelenideElement businessHowToStartAdditionalIncomeAdditionalIncomeTitle = $(".left-column > h2");
    public final String businessHowToStartAdditionalIncomeAdditionalIncomeText = "Дополнительный доход или свой бизнес?";
    public final SelenideElement businessOpportunitiesTitle = $(".business-opportunities__header");
    public final String businessOpportunitiesText = "Твои дополнительные возможности";
    public final SelenideElement businessWhyWeTitle = $(".business-why-we__header");
    public final String businessWhyWeText = "Почему у тебя получится построить бизнес с нами?";
    public final SelenideElement businessVideTitle = $(".business-video__title");
    public final String businessVideText = "Десятки тысяч людей в разных странах выбирают бизнес с нами!";
    public final SelenideElement businessSupportTitle = $(".business-support__header");
    public final String businessSupportText = "Мы поддержим твой бизнес";
    public final SelenideElement businessJoinUsWrapperTitle = $(".business-join-us__title");
    public final String businessJoinUsWrapperText = "Присоединяйся – пора реализовываться!";
    public final SelenideElement modalWindowsButton = $(".modal__close");
    public final SelenideElement businessBannerButton = $(".business-banner__button > span");
    public final String businessBannerButtonText = "Начни бизнес сейчас";
    public final SelenideElement registrationButton = $(".link-button");
    public final String registrationButtonText = "Регистрируйся";
    public final SelenideElement marketingPlanButton = $("a:nth-child(3) > .button > span");
    public final String marketingPlanButtonText = "Смотреть Маркетинг-план";
    public final String marketingPlanButtonLink = "https://siberianhealth.com/ru/marketing-plan";
    public final SelenideElement startBusinessButton = $(".business-why-we__button");
    public final String startBusinessButtonText = "Начать бизнес";
    public final SelenideElement showMoreStoriesButton = $(".business-video__button-wrapper:nth-child(1) span");
    public final String showMoreStoriesButtonText = "Смотреть больше историй";
    public final String showMoreStoriesButtonLink = "https://siberianhealth.com/ru/stories";
    public final SelenideElement readStoriesButton = $(".business-video__button-wrapper:nth-child(2) span");
    public final String readStoriesButtonText = "Читать истории";
    public final String readStoriesButtonLink = "https://siberianhealth.com/ru/leadership";
    public final SelenideElement businessJoinUsButton = $(".business-join-us__button");
    public final String businessJoinButtonText = "Начни бизнес сейчас";


    public BusinessWithUsPage openPage() {
        open("/business");

        return this;
    }

    public BusinessWithUsPage checkingTitle() {
        businessBannerTitle.shouldHave(text(businessBannerText));
        howToStartTitle.shouldHave(text(howToStartText));
        businessHowToStartAdditionalIncomeAdditionalIncomeTitle.shouldHave(text(businessHowToStartAdditionalIncomeAdditionalIncomeText));
        businessOpportunitiesTitle.shouldHave(text(businessOpportunitiesText));
        businessWhyWeTitle.shouldHave(text(businessWhyWeText));
        businessVideTitle.shouldHave(text(businessVideText));
        businessSupportTitle.shouldHave(text(businessSupportText));
        businessJoinUsWrapperTitle.shouldHave(text(businessJoinUsWrapperText));

        return this;
    }

    public BusinessWithUsPage checkingButtons() {
        businessBannerButton.shouldHave(text(businessBannerButtonText));
        businessBannerButton.click();
        businessBannerButton.click();
        modalWindowsButton.click();
        registrationButton.shouldHave(text(registrationButtonText));
        registrationButton.click();
        modalWindowsButton.click();
        marketingPlanButton.shouldHave(text(marketingPlanButtonText));
        marketingPlanButton.click();
        checkingTheOpenTabAndThenClosing(marketingPlanButtonLink, false);
        startBusinessButton.shouldHave(text(startBusinessButtonText));
        startBusinessButton.click();
        modalWindowsButton.click();
        showMoreStoriesButton.shouldHave(text(showMoreStoriesButtonText));
        showMoreStoriesButton.click();
        checkingTheOpenTabAndThenClosing(showMoreStoriesButtonLink, false);
        readStoriesButton.shouldHave(text(readStoriesButtonText));
        readStoriesButton.click();
        checkingTheOpenTabAndThenClosing(readStoriesButtonLink, false);
        businessJoinUsButton.shouldHave(text(businessJoinButtonText));
        businessJoinUsButton.click();
        modalWindowsButton.click();

        return this;
    }

    public BusinessWithUsPage checkingTheOpenTabAndThenClosing(String urlWindow, Boolean openNewWindow) {
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
