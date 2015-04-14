package edu.washington.wsmay1.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {
    private Log logger;
    private static final String tag = "activityspy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            logger.i(tag + " Bundle: ", savedInstanceState.toString());
        }
        logger.i(tag, "onCreate event fired");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logger.e(tag, "We're going down, Captain!");
    }

    @Override
    public void onPause() {
        super.onPause();
        logger.i(tag, "onPause event fired");
    }

    @Override
    public void onResume() {
        super.onResume();
        logger.i(tag, "onResume event fired");
    }

    @Override
    public void onStart() {
        super.onStart();
        logger.i(tag, "onStart event fired");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        logger.i(tag, "onRestart event fired");
    }
}
