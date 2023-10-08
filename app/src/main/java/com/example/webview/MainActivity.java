package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the WebView
        WebView webv = findViewById(R.id.web);



        // Set a WebViewClient to handle navigation within the WebView


        // Load a web page
        webv.loadUrl("https://www.codingal.com/");
    }
}
