package com.nectotech.with.colabration.innerhourchatappdemo.service;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by shaikh on 11/25/2016.
 */

public class MyFireBaseINstantIdService extends FirebaseInstanceIdService {

    private static final String REG_TOKEN = "TOKEN";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String tokenId = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN, "---token--------------------" + tokenId);
    }
}
