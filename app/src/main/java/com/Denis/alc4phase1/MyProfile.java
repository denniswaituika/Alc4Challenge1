package com.Denis.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MyProfile extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_profile);

		Toolbar mToolbar =  findViewById(R.id.toolbar);
		mToolbar.setTitle("My Profile");
		mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
		mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				onBackPressed();
			}
		});

		ImageView img = findViewById(R.id.imageView);
		img.setImageResource(R.drawable.profile);

	}
}
