package com.example.androiduitest;

import android.app.Activity;
import android.os.Bundle;

public class SecondAndroidActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	}

}
