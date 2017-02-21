package andlib.ashrafulbd.com.workflowmapperlibsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);

        //TODO: Add library code for mapping (Splash activity start -> App Start)

        Intent intent = new Intent(this, LandingActivity.class);
        startActivity(intent);
        finish();

        //TODO: Add library code for mapping (Splash activity destroy)
    }
}
