package com.example.pcbuildervasvlay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CheckGoogle extends AppCompatActivity {
    private WebView webView;
    private String myUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_google);

        Intent intent = getIntent();
        myUrl = intent.getStringExtra("My url");

        webView = findViewById(R.id.my_web_view);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(myUrl);

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}