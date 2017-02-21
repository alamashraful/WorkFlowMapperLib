package andlib.ashrafulbd.com.workflowmapperlibsample;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class HomeActivity extends AppCompatActivity {

    View vwRandomColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //TODO: Add library code for mapping (Activity Open)

        vwRandomColor = findViewById(R.id.vwRandomColor);

    }

    public void openLanding(View view) {
        //TODO: Add Library code for mapping (btnOpenLanding clicked)
        Intent intent = new Intent(this, LandingActivity.class);
        startActivity(intent);
    }

    public void openDetail(View view) {
        //TODO: Add Library code for mapping (btnOpenDetail clicked)
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    public void generateRandomColor(View view) {
        //TODO: Add Library code for mapping (btnGenerateRandomColor clicked)

        Random rand = new Random();
        StringBuffer sb = new StringBuffer("#");
        for(int i = 0; i<6; i++)
            sb.append(Integer.toHexString(rand.nextInt(16)));

        vwRandomColor.setBackgroundColor(Color.parseColor(sb.toString()));

    }

    @Override
    public void onBackPressed() {
        //TODO: Add Library code for mapping (back button pressed on this activity)
        super.onBackPressed();
    }

}
