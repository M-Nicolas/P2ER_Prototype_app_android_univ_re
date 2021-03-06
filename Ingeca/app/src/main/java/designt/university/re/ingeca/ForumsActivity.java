package designt.university.re.ingeca;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import designt.university.re.ingeca.activities.AllActivity;
import designt.university.re.ingeca.activities.CovoitActivity;
import designt.university.re.ingeca.activities.GlobalActivity;
import designt.university.re.ingeca.activities.HelpActivity;
import designt.university.re.ingeca.forums.InformationActivity;
import designt.university.re.ingeca.forums.VariousActivity;

/**
 * Created by Meurgues Nicolas on 30/10/2016.
 */

public class ForumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forums);

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    public void onReturn(View v) {
        Intent intent = new Intent(this, MoufiaCampusActivity.class);
        startActivity(intent);
    }

    public void onVarious(View v) {
        Intent intent = new Intent(this, VariousActivity.class);
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
