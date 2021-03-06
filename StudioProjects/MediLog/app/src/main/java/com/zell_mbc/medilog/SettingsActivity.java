package com.zell_mbc.medilog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    public static final String KEY_PREF_DELIMITER = "delimiter";
    public static final String KEY_PREF_WEIGHTUNIT = "weightUnit";
    public static final String KEY_PREF_VERBOSE = "verbose";
    public static final String KEY_PREF_showWeightTab = "showWeightTab";
    public static final String KEY_PREF_showBloodPressureTab = "showBloodPressureTab";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
