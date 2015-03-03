package com.hmade.cesilia.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.logging.Handler;


public class MainActivity extends Activity {

    /* kode untuk menampilkan splash screen salama 3 detik */
    private final int SPLASH_DISPLAY_LENGHT = 3000;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
		/* layout splashscreen dengan background gambar */
        setContentView(R.layout.activity_main);
	/* handler untuk menjalankan splashscreen selama 5 detik lalu
	 * membuat HomeActivity
	 */
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = null;

                mainIntent = new Intent(MainActivity.this,BerandaActivity.class);

                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
    }
}