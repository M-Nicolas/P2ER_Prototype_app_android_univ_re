package designt.university.re.ingeca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import designt.university.re.ingeca.activities.AllActivity;
import designt.university.re.ingeca.activities.CovoitActivity;
import designt.university.re.ingeca.activities.GlobalActivity;
import designt.university.re.ingeca.activities.HelpActivity;

/**
 * Created by Meurgues Nicolas on 30/10/2016.
 */

public class ActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
    }

    public void onReturn(View v) {
        Intent intent = new Intent(this, MoufiaCampusActivity.class);
        startActivity(intent);
    }

    public void onCovoit(View v) {
        Intent intent = new Intent(this, CovoitActivity.class);
        startActivity(intent);
    }

    public void onHelp(View v) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

    public void onGlobal(View v) {
        Intent intent = new Intent(this, GlobalActivity.class);
        startActivity(intent);
    }

    public void onAll(View v) {
        Intent intent = new Intent(this, AllActivity.class);
        startActivity(intent);
    }
}