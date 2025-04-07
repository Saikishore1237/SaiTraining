package Framework.constants;

import Framework.BrowserUtils;

public enum BrowserTypes {

    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    SAFARI("safari"),
    OPERA("opera");

    private String browser;

    BrowserTypes(String browser)
    {
        this.browser=browser;
    }

    public String getBrowser()
    {
        return browser;
    }
}
