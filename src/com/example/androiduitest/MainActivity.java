package com.example.androiduitest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onTextUpdate(View v) {
        EditText edit = (EditText) v.getRootView().findViewById(R.id.editer);
        TextView text = (TextView) v.getRootView().findViewById(R.id.result);
        text.setText(edit.getText());
    }

}
