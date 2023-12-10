package siberianhealth.config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
})


public interface  WebDriverConfig extends Config{
    @Key("baseUrl")
    @DefaultValue("https://siberianhealth.com/ru")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1280x800")
    String getBrowserSize();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String getRemoteUrl();
}
