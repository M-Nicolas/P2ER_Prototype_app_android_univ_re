package designt.university.re.ingeca.forums.information;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import designt.university.re.ingeca.R;
import designt.university.re.ingeca.forums.InformationActivity;

/**
 * Created by Meurgues Nicolas on 01/11/2016.
 */

public class DiplomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diplome);

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
        Intent intent = new Intent(this, InformationActivity.class);
        startActivity(intent);
    }
}
