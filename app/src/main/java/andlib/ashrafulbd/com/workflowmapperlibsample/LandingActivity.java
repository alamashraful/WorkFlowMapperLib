package andlib.ashrafulbd.com.workflowmapperlibsample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LandingActivity extends AppCompatActivity {

    TextView txtRandomNum;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        //TODO: Add library code for mapping (LandingActivity open)

        context = this;
        txtRandomNum = (TextView) findViewById(R.id.txtRandomNum);
        txtRandomNum.setText("0");
    }

    public void openHome(View view) {
        //TODO: Add library code for mapping (openHomeButton click)
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openDetail(View view) {
        //TODO: Add Library code for mapping (openDetailButton click)
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    public void generateRandomNumber(View view) {
        //TODO: Add Library code for mapping (generateRandomNumberButt0n click)
        int random = (int )(Math.random() * 100 + 1);
        txtRandomNum.setText(random + "");
    }

    @Override
    public void onBackPressed() {
        //TODO: Add Library code for mapping (back button pressed on this activity)
        super.onBackPressed();
    }

}
