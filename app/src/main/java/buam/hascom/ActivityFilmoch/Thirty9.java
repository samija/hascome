package buam.hascom.ActivityFilmoch;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import buam.hascom.R;
import buam.hascom.activity.AboutUs;
import buam.hascom.activity.ContactUs;
import buam.hascom.activity.TeleEshtaol;

/**
 * Created by mac on 1/4/16.
 */
public class Thirty9 extends AppCompatActivity {

    android.webkit.WebView web5;
    ProgressBar progressBar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filmoch39);

        web5 = (android.webkit.WebView) findViewById(R.id.wvFilmoch39);
        progressBar5 = (ProgressBar) findViewById(R.id.pbFilmoch39);

        web5.setWebViewClient(new myWebClient());
        web5.getSettings().setJavaScriptEnabled(true);
        web5.loadUrl("https://www.youtube.com/watch?v=nvTeDX8jZdw&list=PL5kXjOnjug3O_vDc4QbbwP9R496-OmIiQ&index=7");

    }

    public class myWebClient extends WebViewClient
    {

        @Override
        public void onPageFinished(android.webkit.WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);
            progressBar5.setVisibility(View.GONE);
        }

        @Override
        public void onPageStarted(android.webkit.WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(android.webkit.WebView view, String url) {
            // TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }

    }

    // To handle "Back" key press event for WebView to go back to previous screen.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if((keyCode == KeyEvent.KEYCODE_BACK) && web5.canGoBack())
        {
            web5.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aboutus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.call) {
            startActivity(new Intent(this, TeleEshtaol.class));
            return true;
        }
        if (item.getItemId() == R.id.contactus) {
            startActivity(new Intent(this, ContactUs.class));
            return true;
        }
        if (item.getItemId() == R.id.aboutus) {
            startActivity(new Intent(this, AboutUs.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}