package com.fankick.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.fankick.app.FKickApplication;
import com.fankick.app.FKickConstants;
import com.fankick.model.Banner;
import com.fankick.model.HomeSections;
import com.fankick.model.LabelsPojo;
import com.fankick.model.ReferrerIdList;
import com.fankick.model.SkipLogin;
import com.google.gson.Gson;

import java.util.List;


/**
 * Created by rbolli on 3/9/2017.
 */

public class FanKickPref {

    public static void saveLoginNotifyCount() {
        int playedCpCount = getLoginNotifyCount();
        putIntToSharedPreferences(FKickConstants.NOTIFY_LOGIN_COUNT_INT, ++playedCpCount);
    }

    public static int getLoginNotifyCount() {
        return getIntFromSharedPreferences(FKickConstants.NOTIFY_LOGIN_COUNT_INT);
    }


    public static void savePlayedCpCount() {
        int playedCpCount = getPlayedCpCount();
        putIntToSharedPreferences(FKickConstants.PLAYED_CP_COUNT_INT, ++playedCpCount);
    }

    public static int getPlayedCpCount() {
        return getIntFromSharedPreferences(FKickConstants.PLAYED_CP_COUNT_INT);
    }

    public static void setContactsRead(boolean isRead) {
        putBooleanToSharedPreferences(FKickConstants.FANKICK_CONTACTS_READ, isRead);
    }

    public static boolean isContactsRead() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.FANKICK_CONTACTS_READ);
    }

    //Nagaraj Created sharedpreferences
    public static void saveUserId(String userId) {
        putStringToSharedPreferences(FKickConstants.USER_ID, userId);
    }

    public static String getUserId() {
        return getStringFromSharedPrefrences(FKickConstants.USER_ID);
    }

    public static void saveSkippedLogin(boolean bool) {
        putBooleanToSharedPreferences(FKickConstants.SKIPPED_LOGIN, bool);
    }

    public static boolean getSkippedLogin() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.SKIPPED_LOGIN);
    }


    public static void saveFplLabel(String name) {
        putStringToSharedPreferences(FKickConstants.FPL_LABEL, name);
    }

    public static String getFplLabel() {
        return getStringFromSharedPrefrences(FKickConstants.FPL_LABEL);
    }

    public static void saveDOB(String name) {
        putStringToSharedPreferences(FKickConstants.DOB, name);
    }

    public static String getDOB() {
        return getStringFromSharedPrefrences(FKickConstants.DOB);
    }

    public static void saveFbUserPhoneNumber(String mobile) {
        putStringToSharedPreferences(FKickConstants.FB_USER_PHONE_NUMBER, mobile);
    }

    public static String getFbUserPhoneNumber() {
        return getStringFromSharedPrefrences(FKickConstants.FB_USER_PHONE_NUMBER);
    }

    public static void saveEmail(String email) {
        putStringToSharedPreferences(FKickConstants.EMAIL, email);
    }

    public static String getEmail() {
        return getStringFromSharedPrefrences(FKickConstants.EMAIL);
    }

    public static void saveUserName(String name) {
        putStringToSharedPreferences(FKickConstants.NAME, name);
    }

    public static String getUserName() {
        return getStringFromSharedPrefrences(FKickConstants.NAME);
    }

    public static void saveAvatarColor(String avatarColor) {
        putStringToSharedPreferences(FKickConstants.avatarColor_PARAM, avatarColor);
    }

    public static String getAvatarColor() {
        return getStringFromSharedPrefrences(FKickConstants.avatarColor_PARAM);
    }

    public static void saveAboutYou(String aboutyou) {
        putStringToSharedPreferences(FKickConstants.ABOUTYOU, aboutyou);
    }

    public static String getAboutYou() {
        return getStringFromSharedPrefrences(FKickConstants.ABOUTYOU);
    }

    public static void saveGender(String gender) {
        putStringToSharedPreferences(FKickConstants.GENDER, gender);
    }

    public static String getGender() {
        return getStringFromSharedPrefrences(FKickConstants.GENDER);
    }

    public static void saveLocation(String location) {
        putStringToSharedPreferences(FKickConstants.LOCATION, location);
    }

    public static String getLocation() {
        return getStringFromSharedPrefrences(FKickConstants.LOCATION);
    }

    public static void saveLoginType(String loginType) {
        putStringToSharedPreferences(FKickConstants.TYPE_KEY_PARAM, loginType);
    }

    public static String getLoginType() {
        return getStringFromSharedPrefrences(FKickConstants.TYPE_KEY_PARAM);
    }

    public static void saveFbId(String fbId) {
        putStringToSharedPreferences(FKickConstants.FB_ID_KEY_PARAM, fbId);
    }

    public static String getFbId() {
        return getStringFromSharedPrefrences(FKickConstants.FB_ID_KEY_PARAM);
    }

    public static void savePhoneNum(String phonenum) {
        putStringToSharedPreferences(FKickConstants.phoneNum_PARAM, phonenum);
    }

    public static String getPhoneNum() {
        return getStringFromSharedPrefrences(FKickConstants.phoneNum_PARAM);
    }

    public static void saveFCHomeData(String fcHomeData) {
        putStringToSharedPreferences(FKickConstants.FC_HOME_DATA, fcHomeData);
    }

    public static void saveProfileBitmap(String profileBitmap) {
        putStringToSharedPreferences(FKickConstants.PROFILE_BITMAP, profileBitmap);
    }

    public static String getProfileBitmap() {
        return getStringFromSharedPrefrences(FKickConstants.PROFILE_BITMAP);
    }

    public static String getFCHomeData() {
        return getStringFromSharedPrefrences(FKickConstants.FC_HOME_DATA);
    }

    public static void saveFKickHomeData(String fcHomeData) {
        putStringToSharedPreferences(FKickConstants.FAN_KICK_HOME_DATA, fcHomeData);
    }

    public static String getFKickHomeData() {
        return getStringFromSharedPrefrences(FKickConstants.FAN_KICK_HOME_DATA);
    }

    public static void saveHomeAd(String fcHomeData) {
        putStringToSharedPreferences(FKickConstants.HOME_AD, fcHomeData);
    }

    public static String getHomeAd() {
        return getStringFromSharedPrefrences(FKickConstants.HOME_AD);
    }

    public static void saveFanCoinsAd(String fcHomeData) {
        putStringToSharedPreferences(FKickConstants.FANCOINS_AD, fcHomeData);
    }

    public static String getFanCoinsAd() {
        return getStringFromSharedPrefrences(FKickConstants.FANCOINS_AD);
    }

    public static void saveLiveScore(String fcHomeData) {
        putStringToSharedPreferences(FKickConstants.LIVE_SCORE, fcHomeData);
    }

    public static String getLiveScore() {
        return getStringFromSharedPrefrences(FKickConstants.LIVE_SCORE);
    }

    public static void saveCelebHomeData(String fcHomeData) {
        putStringToSharedPreferences(FKickConstants.CELEB_HOME_DATA, fcHomeData);
    }

    public static String getCelebHomeData() {
        return getStringFromSharedPrefrences(FKickConstants.CELEB_HOME_DATA);
    }

    public static void saveIplPollHomeData(String iplPoll) {
        putStringToSharedPreferences(FKickConstants.IPL_POLL_HOME_DATA, iplPoll);
    }

    public static String getIplPollHomeData() {
        return getStringFromSharedPrefrences(FKickConstants.IPL_POLL_HOME_DATA);
    }

    public static void saveFun2WinHomeData(String fcHomeData) {
        putStringToSharedPreferences(FKickConstants.FAN_FUN2WIN_HOME_DATA, fcHomeData);
    }

    public static String getFun2WinHomeData() {
        return getStringFromSharedPrefrences(FKickConstants.FAN_FUN2WIN_HOME_DATA);
    }

    public static void saveFun2WinHomeCategories(String categoriesAndSections) {
        putStringToSharedPreferences(FKickConstants.FUN2WIN_HOME_CATEGORIES, categoriesAndSections);
    }

    public static String getFun2WinHomeCategories() {
        return getStringFromSharedPrefrences(FKickConstants.FUN2WIN_HOME_CATEGORIES);
    }

    public static void saveFCHomeCategories(String categoriesAndSections) {
        putStringToSharedPreferences(FKickConstants.FC_HOME_CATEGORIES, categoriesAndSections);
    }

    public static String getFCHomeCategories() {
        return getStringFromSharedPrefrences(FKickConstants.FC_HOME_CATEGORIES);
    }

    public static void saveCoinsKnowMoreSection(String knowMore) {
        putStringToSharedPreferences(FKickConstants.PREF_KNOW_MORE, knowMore);
    }

    public static String getCoinsKnowMoreSection() {
        return getStringFromSharedPrefrences(FKickConstants.PREF_KNOW_MORE);
    }

    public static void saveInvite(String coupons) {
        putStringToSharedPreferences(FKickConstants.INVITE, coupons);
    }

    public static String getInvite() {
        return getStringFromSharedPrefrences(FKickConstants.INVITE);
    }

    public static void saveCoupons(String coupons) {
        putStringToSharedPreferences(FKickConstants.COUPONS, coupons);
    }

    public static String getCoupons() {
        return getStringFromSharedPrefrences(FKickConstants.COUPONS);
    }

    public static void saveLuckyGoChallenges(String luckyGoChallenges) {
        putStringToSharedPreferences(FKickConstants.LUCKY_GO_CHALLENGES, luckyGoChallenges);
    }

    public static String getLuckyGoChallenges() {
        return getStringFromSharedPrefrences(FKickConstants.LUCKY_GO_CHALLENGES);
    }

    public static void saveCategories(String categorys) {
        putStringToSharedPreferences(FKickConstants.category_PARAMS, categorys);
    }

    public static String getCategories() {
        return getStringFromSharedPrefrences(FKickConstants.category_PARAMS);
    }

    public static void saveFCMUID(String categorys) {
        putStringToSharedPreferences(FKickConstants.FCM_AUTH_UID, categorys);
    }

    public static String getFCMUID() {
        return getStringFromSharedPrefrences(FKickConstants.FCM_AUTH_UID);
    }

    public static void setFanCoinsObj(String fanCoinsObj) {
        putStringToSharedPreferences(FKickConstants.FAN_COINS_OBJ, fanCoinsObj);
    }

    public static String getFanCoinsObj() {
        return getStringFromSharedPrefrences(FKickConstants.FAN_COINS_OBJ);
    }

    public static void saveCurrentCoins(String totalcoins) {
        putStringToSharedPreferences(FKickConstants.CURRENT_COINS, totalcoins);
    }

    public static String getCurrentCoins() {
        return getStringFromSharedPrefrences(FKickConstants.CURRENT_COINS);
    }

    public static void saveTotalCoins(String totalcoins) {
        putStringToSharedPreferences(FKickConstants.TOTAL_COINS, totalcoins);
    }

    public static String getTotalCoins() {
        return getStringFromSharedPrefrences(FKickConstants.TOTAL_COINS);
    }

    public static void saveTotalCoinsToday(String totalcoinstoday) {
        putStringToSharedPreferences(FKickConstants.TOTAL_COINS_TODAY, totalcoinstoday);
    }

    public static String getTotalCoinsToday() {
        return getStringFromSharedPrefrences(FKickConstants.TOTAL_COINS_TODAY);
    }

    public static void saveTotalCoinsThisWeek(String totalcoinsthisweek) {
        putStringToSharedPreferences(FKickConstants.TOTAL_COINS_THIS_WEEK, totalcoinsthisweek);
    }

    public static String getTotalCoinsThisWeek() {
        return getStringFromSharedPrefrences(FKickConstants.TOTAL_COINS_THIS_WEEK);
    }

    public static void saveTotalCoinsThisMonth(String totalcoinsthismonth) {
        putStringToSharedPreferences(FKickConstants.TOTAL_COINS_THIS_MONTH, totalcoinsthismonth);
    }

    public static String getTotalCoinsThisMonth() {
        return getStringFromSharedPrefrences(FKickConstants.TOTAL_COINS_THIS_MONTH);
    }

    public static void saveProfileImagePath(String profileimagepath) {
        putStringToSharedPreferences(FKickConstants.PROFILE_IMAGE_PATH, profileimagepath);
    }

    public static String getProfileImagePath() {
        return getStringFromSharedPrefrences(FKickConstants.PROFILE_IMAGE_PATH);
    }

    public static boolean isReferenceUsed() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.REFERENCE_USED);
    }

    public static void setReferenceUsed(boolean isUsed) {
        putBooleanToSharedPreferences(FKickConstants.REFERENCE_USED, isUsed);
    }

    public static boolean isFPL() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.IS_FPL);
    }

    public static void setFPL(boolean isFpl) {
        putBooleanToSharedPreferences(FKickConstants.IS_FPL, isFpl);
    }

    public static boolean isFullProfile() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.FULL_PROFILE);
    }

    public static void setFullProfile(boolean isfull) {
        putBooleanToSharedPreferences(FKickConstants.FULL_PROFILE, isfull);
    }

//    added rajesh for save referrer code ( from playStore)

    public static void saveReferrelCode(String referalcode) {
        putStringToSharedPreferences(FKickConstants.USER_REFERRER_CODE, referalcode);
    }

    public static String getReferrelCode() {
        return getStringFromSharedPrefrences(FKickConstants.USER_REFERRER_CODE);
    }


    public static void savePlayedContestIds(String ids) {
        putStringToSharedPreferences(FKickConstants.PLAYED_CONTEST_IDS, ids);
    }

    public static String getPlayedContestIds() {
        return getStringFromSharedPrefrences(FKickConstants.PLAYED_CONTEST_IDS);
    }

    public static boolean isWCConfirmationShowed() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.CONFIRMATION_POPUP);
    }

    public static void setWCConfirmationShowed(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.CONFIRMATION_POPUP, accessToken);
    }

    public static boolean isReferrerSavedFirst() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.USER_REFERRER_CODE_SAVED);
    }

    public static void setReferrerSavedFirst(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.USER_REFERRER_CODE_SAVED, accessToken);
    }

    public static boolean isAppConnectivityCall() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.APP_CONNECTIVITY_CALL);
    }

    public static void setAppConnectivityCall(boolean call) {
        putBooleanToSharedPreferences(FKickConstants.APP_CONNECTIVITY_CALL, call);
    }

    public static void saveClickId(String sharedUrl) {
        putStringToSharedPreferences(FKickConstants.CLICK_ID, sharedUrl);
    }

    public static String getClickId() {
        return getStringFromSharedPrefrences(FKickConstants.CLICK_ID);
    }

    public static void saveSharedUrl(String sharedUrl) {
        putStringToSharedPreferences(FKickConstants.SHARED_URL, sharedUrl);
    }

    public static String getSharedUrl() {
        return getStringFromSharedPrefrences(FKickConstants.SHARED_URL);
    }

//    is First in a day

    public static void saveDay(String day) {
        putStringToSharedPreferences(FKickConstants.DAY_VALUE, day);
    }

    public static String getDay() {
        return getStringFromSharedPrefrences(FKickConstants.DAY_VALUE);
    }

//    our reference code

    public static void saveReferenceCode(String referalcode) {
        putStringToSharedPreferences(FKickConstants.USER_REFERRAL_CODE, referalcode);
    }

    public static String getReferenceCode() {
        return getStringFromSharedPrefrences(FKickConstants.USER_REFERRAL_CODE);
    }

    public static void saveTotalPoints(String totalpoints) {
        putStringToSharedPreferences(FKickConstants.TOTAL_POINTS, totalpoints);
    }

    public static String getTotalPoints() {
        return getStringFromSharedPrefrences(FKickConstants.TOTAL_POINTS);
    }

    public static void saveSasAccessToken(String savesasaccesstoken) {
        putStringToSharedPreferences(FKickConstants.BLOB_SAS_ACCESS_TOKEN, savesasaccesstoken);
    }

    public static String getSasAccessToken() {
        return getStringFromSharedPrefrences(FKickConstants.BLOB_SAS_ACCESS_TOKEN);
    }

    public static void saveSasTokenExpiryTime(String savesastokenexptime) {
        putStringToSharedPreferences(FKickConstants.SAS_TOKEN_EXPIRY_TIME, savesastokenexptime);
    }

    public static String getSasTokenExpiryTime() {
        return getStringFromSharedPrefrences(FKickConstants.SAS_TOKEN_EXPIRY_TIME);
    }

    public static void saveFCMInAppPublicLastSyncKey(String savesastokenexptime) {
        putStringToSharedPreferences(FKickConstants.IN_APP_PUBLIC_TOPIC_SYNC_DATA, savesastokenexptime);
    }

    public static String getFCMInAppPublicLastSyncKey() {
        return getStringFromSharedPrefrences(FKickConstants.IN_APP_PUBLIC_TOPIC_SYNC_DATA);
    }


    public static void saveFCMInAppUserLastSyncKey(String savesastokenexptime) {
        putStringToSharedPreferences(FKickConstants.IN_APP_USER_SYNC_DATA, savesastokenexptime);
    }

    public static String getFCMInAppUserLastSyncKey() {
        return getStringFromSharedPrefrences(FKickConstants.IN_APP_USER_SYNC_DATA);
    }

    public static void saveFCMInstanceIdToken(String token) {
        putStringToSharedPreferences(FKickConstants.INSTANCE_ID_TOKEN, token);
    }

    public static String getFCMInstanceIdToken() {
        return getStringFromSharedPrefrences(FKickConstants.INSTANCE_ID_TOKEN);
    }

//    IS PROFILE FIRST

    public static long getPubNubHistorySynDate() {
        return getLongToSharedPreferences(FKickConstants.PUB_NUB_HISTORY_SYNC_DATE);
    }

    public static void setPubNubHistorySynDate(long accessToken) {
        putLongToSharedPreferences(FKickConstants.PUB_NUB_HISTORY_SYNC_DATE, accessToken);
    }

    public static boolean isProfileFirst() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.PROFILE_FIRST);
    }

    public static void setProfileFirst(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.PROFILE_FIRST, accessToken);
    }

    public static boolean isSentDeviceInfo() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.DEVICE_INFO_SEND);
    }

    public static void sentDeviceInfo(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.DEVICE_INFO_SEND, accessToken);
    }

//    help hints

    public static boolean isHintHomeFirst() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.HINT_HOME_FIRST);
    }

    public static void setHintHomeFirst(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.HINT_HOME_FIRST, accessToken);
    }

    public static boolean isHintFanClubsFirst() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.HINT_FAN_CLUBS_FIRST);
    }

    public static void setHintFanClubsFirst(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.HINT_FAN_CLUBS_FIRST, accessToken);
    }

    public static boolean isHintFanCoinsFirst() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.HINT_FAN_COINS_FIRST);
    }

    public static void setHintFanCoinsFirst(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.HINT_FAN_COINS_FIRST, accessToken);
    }

    public static boolean isHintFunToWinFirst() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.HINT_FUN_TO_WIN_FIRST);
    }

    public static void setHintFunToWinFirst(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.HINT_FUN_TO_WIN_FIRST, accessToken);
    }

    public static boolean getFun2WinAutoPlay() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.FUN_2_WIN_AUTO_PLAY);
    }


    public static void setFun2WinAutoPlay(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.FUN_2_WIN_AUTO_PLAY, accessToken);
    }

    public static boolean getNotificationSettings() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.NOTIFICATION_SETTINGS);
    }


    public static void setNotificationSettings(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.NOTIFICATION_SETTINGS, accessToken);
    }

    public static boolean getIsFeedUploaded() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.FEED_UPLOAD);
    }

    public static void isFeedUploaded(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.FEED_UPLOAD, accessToken);
    }


    //Nagaraj Created sharedpreferences


    public static boolean getLoginStatus() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.LOGIN_STATUS);
    }

    public static void saveLoginStatus(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.LOGIN_STATUS, accessToken);
    }

    public static boolean getProfilePrefChanged() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.USER_PREF_STATUS);
    }

    public static void saveProfilePrefChanged(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.USER_PREF_STATUS, accessToken);
    }

    public static boolean getProfileStatus() {
        if ((TextUtils.isEmpty(FanKickPref.getUserName()))) {
            return false;

        } else {
            return true;
        }

    }

    public static void saveProfileStatus(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.PROFILE_STATUS, accessToken);
    }

    public static void saveCountryCode(String countryCode) {
        putStringToSharedPreferences(FKickConstants.COUNTRY_CODE, countryCode);
    }

    public static String getCountryCode() {
        return getStringFromSharedPrefrences(FKickConstants.COUNTRY_CODE);
    }

    public static void saveAppVersionObject(String versionObject) {
        putStringToSharedPreferences(FKickConstants.APP_VERSION_OBJECT, versionObject);
    }

    public static String getAppVersionObject() {
        return getStringFromSharedPrefrences(FKickConstants.APP_VERSION_OBJECT);
    }

    public static void saveFBToken(String versionObject) {
        putStringToSharedPreferences(FKickConstants.FB_TOKEN, versionObject);
    }

    public static String getFBToken() {
        return getStringFromSharedPrefrences(FKickConstants.FB_TOKEN);
    }

    public static void saveFplCoins(int coins) {
        putIntToSharedPreferences(FKickConstants.FPL_COINS_INT, coins);
    }

    public static int getFplCoins() {
        return getIntFromSharedPreferences(FKickConstants.FPL_COINS_INT);
    }

    public static void saveNotificationCount(int notificationCount) {
        putIntToSharedPreferences(FKickConstants.NOTIFICATION_COUNT_INT, notificationCount);
    }

    public static int getNotificationCount() {
        return getIntFromSharedPreferences(FKickConstants.NOTIFICATION_COUNT_INT);
    }

    public static void saveSelectedTab(String selectedTab) {
        putStringToSharedPreferences(FKickConstants.SELECTED_TAB, selectedTab);
    }

    public static String getSelectedTab() {
        return getStringFromSharedPrefrences(FKickConstants.SELECTED_TAB);
    }

    public static boolean getChallengeUserAction() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.CHALLENGE_POPUP_STATUS);
    }

    public static void saveChallengeUserAction(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.CHALLENGE_POPUP_STATUS, accessToken);
    }

    public static boolean getHomeStatus() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.HOME_STATUS);
    }

    public static void setHomeStatus(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.HOME_STATUS, accessToken);
    }


    public static boolean getIsShowedMCHint() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.MC_HINT);
    }

    public static void isShowedMCHint(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.MC_HINT, accessToken);
    }


    public static boolean getSlideStatus() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.SLIDE_STATUS);
    }

    public static void saveSlideStatus(boolean accessToken) {
        putBooleanToSharedPreferences(FKickConstants.SLIDE_STATUS, accessToken);
    }

    public static void saveLoginObject(SkipLogin skipLogin) {
        Gson gson = new Gson();
        String json = gson.toJson(skipLogin);
        putStringToSharedPreferences(FKickConstants.LOGIN_SKIP_DATA, json);
    }

    public static SkipLogin getLoginObject() {
        Gson gson = new Gson();
        String json = getSharedPreferences().getString(FKickConstants.LOGIN_SKIP_DATA, "");
        if (TextUtils.isEmpty(json)) {
            return null;
        } else {
            return gson.fromJson(json, SkipLogin.class);
        }
    }

    public static void saveReferrerIdList(ReferrerIdList referrerIdList) {
        Gson gson = new Gson();
        String json = gson.toJson(referrerIdList);
        putStringToSharedPreferences(FKickConstants.REFERRER_LIST_IDS, json);
    }

    public static ReferrerIdList getReferrerIdList() {
        Gson gson = new Gson();
        String json = getSharedPreferences().getString(FKickConstants.LOGIN_SKIP_DATA, "");
        if (TextUtils.isEmpty(json)) {
            return null;
        } else {
            return gson.fromJson(json, ReferrerIdList.class);
        }
    }

    public static void saveLablesData(LabelsPojo lablesPojo) {
        Gson gson = new Gson();
        String json = gson.toJson(lablesPojo);
        putStringToSharedPreferences(FKickConstants.LABLES_DATA, json);
    }

    private static LabelsPojo lablesPojo;


    public static LabelsPojo getLablesData() {

        if (lablesPojo == null) {
            Gson gson = new Gson();
            String json = getSharedPreferences().getString(FKickConstants.LABLES_DATA, "");
            lablesPojo = gson.fromJson(json, LabelsPojo.class);
            /*lablesPojo = null;
            if (lablesPojo == null) {
                return new LabelsPojo();
            }*/
            if (lablesPojo == null) {
                return new LabelsPojo();
            }
            return lablesPojo;
        } else {
            return lablesPojo;
        }
    }


    public static void saveFPLHomeSection(Banner banner) {
        Gson gson = new Gson();
        String json = gson.toJson(banner);
        putStringToSharedPreferences(FKickConstants.FPL_HOME_POJO, json);
    }

    public static Banner getFPLHomeSection() {
        Gson gson = new Gson();
        String json = getSharedPreferences().getString(FKickConstants.FPL_HOME_POJO, "");
        if (TextUtils.isEmpty(json)) {
            return null;
        } else {
            return gson.fromJson(json, Banner.class);
        }
    }

    public static void saveHomeAdObj(HomeSections homeSections) {
        Gson gson = new Gson();
        String json = gson.toJson(homeSections);
        putStringToSharedPreferences(FKickConstants.HOME_AD_OBJ, json);
    }

    public static HomeSections getHomeAdObj() {
        Gson gson = new Gson();
        String json = getSharedPreferences().getString(FKickConstants.HOME_AD_OBJ, "");
        if (TextUtils.isEmpty(json)) {
            return null;
        } else {
            return gson.fromJson(json, HomeSections.class);
        }
    }

    public static boolean getBottomFeeds() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.BOTTOM_FEEDS);
    }

    public static void saveBottomFeeds(boolean isShow) {
        putBooleanToSharedPreferences(FKickConstants.BOTTOM_FEEDS, isShow);
    }

    /********************************common methods of shared prefs put and get *********************************/
    private static boolean getBooleanValueFromSharedPrefrences(String key) {
        return getSharedPreferences().getBoolean(key, false);
    }

    private static void putBooleanToSharedPreferences(String key, boolean value) {
        getEditor().putBoolean(key, value).apply();       //editor.commit();
    }

    private static int getIntFromSharedPreferences(String key) {
        return getSharedPreferences().getInt(key, 0);
    }

    private static void putIntToSharedPreferences(String key, int value) {
        getEditor().putInt(key, value).apply();       //editor.commit();
    }

    private static long getLongToSharedPreferences(String key) {
        return getSharedPreferences().getLong(key, -1);
    }

    private static void putLongToSharedPreferences(String key, long value) {
        getEditor().putLong(key, value).apply();       //editor.commit();
    }

    private static String getStringFromSharedPrefrences(String key) {
        return getSharedPreferences().getString(key, "");
    }

    private static void putStringToSharedPreferences(String key, String value) {
        getEditor().putString(key, value).apply();       //editor.commit();
    }


    private static SharedPreferences.Editor getEditor() {
        return getSharedPreferences().edit();
    }

    private static SharedPreferences getSharedPreferences() {
        return FKickApplication.getInstance().getSharedPreferences(FKickConstants.FAN_KICK_PREF, Context.MODE_PRIVATE);
    }


    public static void saveName(String name) {
        putStringToSharedPreferences(FKickConstants.SPLASH_NAME, name);
    }

    public static String getName() {
        return getStringFromSharedPrefrences(FKickConstants.SPLASH_NAME);
    }

    public static void saveSelectedPostion(int selectedPosition) {
        putIntToSharedPreferences(FKickConstants.SELECTED_ITEM_POSITION, selectedPosition);
    }

    public static int getSelectedPostion() {
        return getIntFromSharedPreferences(FKickConstants.SELECTED_ITEM_POSITION);
    }

    public static void saveTokenSentToServer(boolean b) {
        putBooleanToSharedPreferences(FKickConstants.FCM_TOKEN_UPDATED, b);
    }

    public static boolean getTokenSentToServer() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.FCM_TOKEN_UPDATED);
    }

   /* public static String getValueFromSharedPrefrences(String key, Context context) {
        return getSharedPreferences(context).getString(key, "");
    }

    public static void putValueToSharedPrefrences(String key, String value, Context context) {
        getEditor(context).putString(key, value).apply();
    }*/

    //Fpl Tasks for playAgain

    public static void saveSharedTask(String timeStamp) {
        putStringToSharedPreferences(FKickConstants.SHARED_TASK, timeStamp);
    }

    public static String getSharedTask() {
        return getStringFromSharedPrefrences(FKickConstants.SHARED_TASK);
    }

    public static void savePlay4kickTask(String timeStamp) {
        putStringToSharedPreferences(FKickConstants.PLAY4KICK_TASK, timeStamp);
    }

    public static String getPlay4kickTask() {
        return getStringFromSharedPrefrences(FKickConstants.PLAY4KICK_TASK);
    }

    public static void saveFCJoinTask(String timeStamp) {
        putStringToSharedPreferences(FKickConstants.FC_JOIN_TASK, timeStamp);
    }

    public static String getFCJoinTask() {
        return getStringFromSharedPrefrences(FKickConstants.FC_JOIN_TASK);
    }

    public static void savePinCelebTask(String timeStamp) {
        putStringToSharedPreferences(FKickConstants.PIN_TASK, timeStamp);
    }

    public static String getPinCelebTask() {
        return getStringFromSharedPrefrences(FKickConstants.PIN_TASK);
    }

    public static void saveNetSessAllowed(boolean isAllowed) {
        putBooleanToSharedPreferences(FKickConstants.IS_NET_SESS, isAllowed);
    }

    public static boolean getNetSessAllowed() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.IS_NET_SESS);
    }

    public static void saveMatchNumber(String timeStamp) {
        putStringToSharedPreferences(FKickConstants.MATCH_NUMBER, timeStamp);
    }

    public static String getMatchNumber() {
        return getStringFromSharedPrefrences(FKickConstants.MATCH_NUMBER);
    }

    public static boolean getDialogStatus() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.DIALOG_STATUS);
    }

    public static void saveDialogStatus(boolean b) {
        putBooleanToSharedPreferences(FKickConstants.DIALOG_STATUS, b);
    }

    public static boolean isWC() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.IS_WC);
    }

    public static void setWC(boolean isWC) {
        putBooleanToSharedPreferences(FKickConstants.IS_WC, isWC);
    }

    public static void saveWcLabel(String name) {
        putStringToSharedPreferences(FKickConstants.WC_LABEL, name);
    }

    public static String getWCLabel() {
        return getStringFromSharedPrefrences(FKickConstants.WC_LABEL);
    }

    public static void saveWcCoins(int coins) {
        putIntToSharedPreferences(FKickConstants.WC_COINS_INT, coins);
    }

    public static int getWcCoins() {
        return getIntFromSharedPreferences(FKickConstants.WC_COINS_INT);
    }

    public static void saveFromReferralProgram(boolean b) {
        putBooleanToSharedPreferences(FKickConstants.FROM_REFERRAL_PROGRAM, b);
    }

    public static boolean getFromReferralProgram() {
        return getBooleanValueFromSharedPrefrences(FKickConstants.FROM_REFERRAL_PROGRAM);
    }
}
