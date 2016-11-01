package designt.university.re.ingeca;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView loadingTextView;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        loadingTextView = (TextView) findViewById(R.id.loadingText);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                loadingTextView.setText("Salvating Kitties");
            }
        }, 3000);

        handler.postDelayed(new Runnable() {
            public void run() {
                loadingTextView.setText("Getting Rid of P2ER");
            }
        }, 6000);

        intent = new Intent(this, MoufiaCampusActivity.class);
        handler.postDelayed(new Runnable() {
            public void run() {
                startActivity(intent);
            }
        }, 9000);

    }
}
