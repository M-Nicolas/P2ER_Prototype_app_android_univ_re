package designt.university.re.ingeca.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import designt.university.re.ingeca.ActivityActivity;
import designt.university.re.ingeca.R;

/**
 * Created by Meurgues Nicolas on 31/10/2016.
 */

public class GlobalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);
    }

    public void onReturn(View v) {
        Intent intent = new Intent(this, ActivityActivity.class);
        startActivity(intent);
    }
}
