package andlib.ashrafulbd.com.workflowmapperlibsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class DetailActivity extends AppCompatActivity {

    TextView txtLuckyDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //TODO: Add Library code for mapping (Activity started)

        txtLuckyDay = (TextView) findViewById(R.id.txtLuckyDay);
    }

    public void openLanding(View view) {

        //TODO: Add Library code for mapping (btnOpenLanding clicked)
        Intent intent = new Intent(this, LandingActivity.class);
        startActivity(intent);

    }

    public void openHome(View view) {
        //TODO: Add Library code for mapping (btnOhenHome clicked)
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }

    public void findRandomDay(View view) {
        //TODO: Add Library code for mapping (btnFindRandomDay clicked)
        Random random = new Random();
        int randomNum = random.nextInt(7);
        String day = "";
        switch (randomNum){
            case 0: day = "Saturday";
                break;
            case 1: day = "Sunday";
                break;
            case 2: day = "Monday";
                break;
            case 3: day = "Tuesday";
                break;
            case 4: day = "Wednesday";
                break;
            case 5: day = "Thursday";
                break;
            case 6: day = "Friday";
                break;
            default:
                day = "Sunday";
                break;
        }

        txtLuckyDay.setText(day);
    }

    @Override
    public void onBackPressed() {
        //TODO: Add Library code for mapping (back button pressed on this activity)
        super.onBackPressed();
    }

}
