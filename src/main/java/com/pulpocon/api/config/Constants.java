package com.pulpocon.api.config;

/**
 * Application constants.
 */
public final class Constants {

    // Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymoususer";
    public static final String DEFAULT_LANGUAGE = "en";

	// Resize criteria Bytes.
    public static final Long IMAGE_RESIZE_CRITERIA =  500000L;

    public static final String BLANK = "";


    private Constants() {
    }
}
