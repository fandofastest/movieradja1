package com.moviehd.freemovies;

public class Config {

    // copy your api url from php admin dashboard & paste below
    public static final String API_SERVER_URL = "https://hdcinemakaca.xyz/new/new_api/";

    //copy your api key from php admin dashboard & paste below
    public static final String API_KEY = "c83u6zus8v4akvl1zkr64w5u";

    //copy your terms url from php admin dashboard & paste below
    public static final String TERMS_URL = "https://hdcinemakaca.xyz/new/terms/";

    //youtube video auto play
    public static boolean YOUTUBE_VIDEO_AUTO_PLAY = true;

    //default theme
    public static boolean DEFAULT_DARK_THEME_ENABLE = false;

    // First, you have to configure firebase to enable facebook, phone and google login
    // facebook authentication
    public static final boolean ENABLE_FACEBOOK_LOGIN = false;

    //Phone authentication
    public static final boolean ENABLE_PHONE_LOGIN = false;

    //Google authentication
    public static final boolean ENABLE_GOOGLE_LOGIN = false;
}
