package com.example.lukasz.androidviewer;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by lukasz on 12.06.2016.
 */
public class PreferenceManager {
    public static String PREFS_KEY= "com.example.lukasz.androidviewer";
    public static String ADDRESS_KEY= PREFS_KEY+"address";
    private static SharedPreferences getPrefs(Activity acivity){
        SharedPreferences prefs = acivity.getSharedPreferences(
                PREFS_KEY, Context.MODE_PRIVATE);
        return prefs;
    }
    public static String get(Activity acivity){
        SharedPreferences prefs=getPrefs(acivity);

       return prefs.getString(ADDRESS_KEY,null);
    }
    public static void set(Activity acivity,String value){
        SharedPreferences prefs=getPrefs(acivity);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(ADDRESS_KEY,value);
        editor.apply();

    }
}
