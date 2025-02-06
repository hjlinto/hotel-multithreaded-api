package edu.wgu.d387_sample_code.localization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

public class MessageFetcher {

    Locale locale;

    // Constructor
    public MessageFetcher(Locale locale) {
        this.locale = locale;
    }

    // Asynchronous method to fetch the welcome message
    public CompletableFuture<String> getMessage() {
        return CompletableFuture.supplyAsync(() -> {
            String bundleName = "messages"; // Base name for properties files
            String language = locale.getLanguage();

            // Determine which welcome message to load, defaults to English
            if ("fr".equals(language)) {
                bundleName += "_french";
            } else {
                bundleName += "_english";
            }

            ResourceBundle bundle = ResourceBundle.getBundle(bundleName, locale);

            // Returns welcome message
            return bundle.getString("welcome.message");
        });
    }
}
