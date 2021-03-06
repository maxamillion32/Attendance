package com.eusecom.attendance;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;



@SuppressWarnings("deprecation")
public class SettingsActivity extends android.preference.PreferenceActivity {
	

	public static final String SERVER_NAME = "servername";
	public static final String USER_PSW = "userpsw";
	public static final String USER_NAME = "username";
	public static final String FIR = "fir";
	public static final String USER_TYPE = "ustype";
	public static final String USER_ICO = "usico";


	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		addPreferencesFromResource(R.xml.settings);
	}

	
	public static String getServerName(Context ctx){
		return PreferenceManager.getDefaultSharedPreferences(ctx).getString(SERVER_NAME, "");
	}


	public static String getFir(Context ctx){
		return PreferenceManager.getDefaultSharedPreferences(ctx).getString(FIR, "0");
	}


	public static String getUserName(Context ctx){
		return PreferenceManager.getDefaultSharedPreferences(ctx).getString(USER_NAME, "");
	}
	
	public static String getUserPsw(Context ctx){
		return PreferenceManager.getDefaultSharedPreferences(ctx).getString(USER_PSW, "");
	}

	public static String getUsType(Context ctx){
		return PreferenceManager.getDefaultSharedPreferences(ctx).getString(USER_TYPE,"0");
	}

	public static String getUsIco(Context ctx){
		return PreferenceManager.getDefaultSharedPreferences(ctx).getString(USER_ICO,"0");
	}
	

} 