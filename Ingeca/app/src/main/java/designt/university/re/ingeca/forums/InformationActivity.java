package designt.university.re.ingeca.forums;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import designt.university.re.ingeca.ForumsActivity;
import designt.university.re.ingeca.R;
import designt.university.re.ingeca.forums.information.BureauActivity;
import designt.university.re.ingeca.forums.information.DiplomeActivity;

/**
 * Created by Meurgues Nicolas on 01/11/2016.
 */

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

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
        Intent intent = new Intent(this, ForumsActivity.class);
        startActivity(intent);
    }

    public void onBureau(View v) {
        Intent intent = new Intent(this, BureauActivity.class);
        startActivity(intent);
    }

    public void onDiplome(View v) {
        Intent intent = new Intent(this, DiplomeActivity.class);
        startActivity(intent);
    }
}
