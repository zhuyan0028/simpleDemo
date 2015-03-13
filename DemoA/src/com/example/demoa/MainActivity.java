package com.example.demoa;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	public Button b1;
	public Button b2;
	public Button b3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViews();
		initListener();
	}

	private void initViews() {
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
	}

	private void initListener() {
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			Intent intent1 = new Intent(MainActivity.this, Bactivity.class);
			startActivity(intent1);
			break;
		case R.id.button2:
			Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "18612774079"));
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(intent);
			break;
		case R.id.button3:
			Intent intent3= new Intent(Intent.ACTION_DIAL); 
			intent3.setClassName("com.huafoun.dynamicpw","com.huafoun.dynamicpw.activity.GetLockActivity");
			startActivity(intent3);  
			break;

		default:
			break;
		}
	}
}
