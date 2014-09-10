package com.pcs.sendcustomobj;

import com.pcs.helpers.Constants;
import com.pcs.model.User;

import android.app.Activity;
import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		Button submitBtn = (Button) findViewById(R.id.submit);
		submitBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(FirstActivity.this,
						SecondActivity.class);
				User user = new User();
				user.setUsername("ParadigmCreatives");
				user.setAddress("Hill-3");
				user.setEmail("pcs@paradigmcreatives.com");
				user.setPassword("1234");
				user.setPhonenumber("1234567890");
				intent.putExtra(Constants.IntentExtras.USER_INFO, user);
				startActivity(intent);
			}
		});
	}

}
