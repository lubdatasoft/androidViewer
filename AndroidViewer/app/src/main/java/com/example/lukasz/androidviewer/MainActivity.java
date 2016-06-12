package com.example.lukasz.androidviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setWebview((WebView) findViewById(R.id.webView));
        init();
    }

    private void init() {
       webview.setWebViewClient(new WebViewClient());
        setAddress("http://www.onet.pl");
        Toast.makeText(MainActivity.this, Application.getInstance().getApplicationState().toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, Application.getInstance().getApplicationState().toString(), Toast.LENGTH_LONG).show();
        PreferenceManager.set(this,"deeeee");
        Toast.makeText(MainActivity.this, PreferenceManager.get(this), Toast.LENGTH_LONG).show();
    }

    public WebView getWebview() {
        return webview;
    }
   public void setAddress(String url) {
       if (getWebview() != null) {
           getWebview().loadUrl(url);

       }
   }

    public void setWebview(WebView webview) {
        this.webview = webview;
    }
}
