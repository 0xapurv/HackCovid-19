package project.dheeraj.hackcovid_19.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import project.dheeraj.hackcovid_19.MainActivity;
import project.dheeraj.hackcovid_19.R;
import project.dheeraj.hackcovid_19.Util.UtilMethod;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        if (!UtilMethod.checkLocationPermission(SplashScreenActivity.this)) {
            Toast.makeText(SplashScreenActivity.this, "Give permission to continue using the app", Toast.LENGTH_SHORT).show();;
        }
        Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over

                if (UtilMethod.checkLocationPermission(SplashScreenActivity.this)){
                    startActivity(i);
                    finish();
                }
            }
        }, 2000);

    }
}
