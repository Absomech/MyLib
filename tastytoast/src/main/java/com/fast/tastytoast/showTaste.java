package com.fast.tastytoast;

import android.content.Context;
import android.widget.Toast;

public class showTaste {
    public static void showTastyToast(Context context , String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
