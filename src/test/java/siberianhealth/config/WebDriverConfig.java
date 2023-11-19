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
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();

    @Key("remoteUrl")
    String getRemoteUrl();
}
