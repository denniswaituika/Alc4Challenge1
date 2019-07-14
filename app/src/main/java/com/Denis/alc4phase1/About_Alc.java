package com.Denis.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About_Alc extends AppCompatActivity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about__alc);

		Toolbar mToolbar =  findViewById(R.id.toolbar);
		mToolbar.setTitle("About Alc");
		mToolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
		mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
		mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				onBackPressed();
			}
		});

		WebView myWebView = findViewById(R.id.webView);
		WebSettings webSettings= myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webSettings.setLoadsImagesAutomatically(true);
		webSettings.setBuiltInZoomControls(true);
		String url = "https://andela.com/alc/";
		myWebView.loadUrl(url);
		// Line of Code for opening links in app
		myWebView.setWebViewClient(new WebViewClient() {
			@Override
			public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
				handler.proceed();
			}
		});
	}
}
