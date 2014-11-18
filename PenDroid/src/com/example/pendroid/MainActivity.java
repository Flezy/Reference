package com.example.pendroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	TextView Mytext;
	Button SettingsButton;
	ImageButton MainButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mytext = (TextView) findViewById(R.id.textView1);
        SettingsButton = (Button) findViewById(R.id.button1);
        MainButton = (ImageButton) findViewById(R.id.imageButton1);
        
        SettingsButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
			}
		});
        MainButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
			}
		});
        
    }


}
