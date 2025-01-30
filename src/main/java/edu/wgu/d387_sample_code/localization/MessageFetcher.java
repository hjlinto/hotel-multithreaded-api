package edu.wgu.d387_sample_code.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFetcher {

    Locale locale;

    // Constructor
    public MessageFetcher(Locale locale) {
        this.locale = locale;
    }

    // Method to fetch the welcome message based on locale
    public String getMessage() {
        String bundleName = "messages"; // Base name for your properties files
        String language = locale.getLanguage();

        // Determine which welcome message to load, defaults to English
        if ("en".equals(language)) {
            bundleName += "_english";
        } else if ("fr".equals(language)) {
            bundleName += "_french";
        } else {

            bundleName += "_english";
        }


        ResourceBundle bundle = ResourceBundle.getBundle(bundleName, locale);

        // Returns welcome message
        return bundle.getString("welcome.message");
    }
}
