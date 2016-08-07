package alissapaluska.deadoralive.util;

import alissapaluska.deadoralive.BuildConfig;

/**
 * Created by ali on 8/7/16.
 */
public class Constants {
    public static final String FIREBASE_URL = BuildConfig.FIREBASE_ROOT_URL;

    public static final String FIREBASE_LOCATION_SEARCHED_LOCATION = "searchedLocation";
    public static final String FIREBASE_URL_SEARCHED_LOCATION = FIREBASE_URL + "/" + FIREBASE_LOCATION_SEARCHED_LOCATION;

    public static final String FIREBASE_LOCATION_CLOTHING = "clothing";
    public static final String FIREBASE_URL_CLOTHING = FIREBASE_URL + "/" + FIREBASE_LOCATION_CLOTHING;

    public static final String FIREBASE_LOCATION_USERS = "users";
    public static final String FIREBASE_URL_USERS = FIREBASE_URL + "/" + FIREBASE_LOCATION_USERS;
    public static final String KEY_USER_EMAIL = "email";
    public static final String KEY_UID = "UID";
}
