package designt.university.re.ingeca;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Meurgues Nicolas on 30/10/2016.
 */

public class MoufiaCampusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moufia_campus);

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

    public void onCartes(View v) {
        Intent intent = new Intent(this, CartesActivity.class);
        startActivity(intent);
    }

    public void onActivity(View v) {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    public void onForums(View v) {
        Intent intent = new Intent(this, ForumsActivity.class);
        startActivity(intent);
    }

    public void onNews(View v) {
        Intent intent = new Intent(this, ActivityActivity.class);
        startActivity(intent);
    }

    public void onServices(View v) {
        Intent intent = new Intent(this, ServicesActivity.class);
        startActivity(intent);
    }
}
