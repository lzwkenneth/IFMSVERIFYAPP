package kenneth.jf.siaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//import com.facebook.shimmer.ShimmerFrameLayout;

import static android.R.attr.id;
import static android.R.attr.layout_height;
import static android.R.attr.layout_width;
import static kenneth.jf.siaapp.R.id.container;

/**
 * Created by User on 17/10/2016.
 */

public class SplashActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

/*        ShimmerFrameLayout container =
                (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
        container.setDuration(1700);
        container.startShimmerAnimation();*/

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(1700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, login.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
