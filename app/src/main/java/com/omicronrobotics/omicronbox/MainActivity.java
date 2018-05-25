package com.omicronrobotics.omicronbox;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String PERMISSION_DEBUG = "Permissions_Debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(PERMISSION_DEBUG,"Start App");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            MainActivity.this.requestPermissions(new String[]{Manifest.permission.INTERNET},1);
            Log.d(PERMISSION_DEBUG,"Asking for Perms");
        }

        /*
        |--------------------------------|
         @TODO
         @TODO
        |--------------------------------|
         */

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            Log.d(PERMISSION_DEBUG,"Granted");
        }else{
            Log.d(PERMISSION_DEBUG,"Denied");
        }
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "App Started!",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
