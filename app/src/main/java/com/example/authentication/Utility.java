package com.example.authentication;

import android.content.Context;
import android.widget.Toast;

public class Utility {

    static void showToast(Context context, String message) {
        //For all toasts-
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
