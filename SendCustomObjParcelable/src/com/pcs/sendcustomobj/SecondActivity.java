package com.pcs.sendcustomobj;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.pcs.helpers.Constants;
import com.pcs.model.User;

public class SecondActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		TextView textView = (TextView)findViewById(R.id.message_txt);
		User user = (User) getIntent().getSerializableExtra(Constants.IntentExtras.USER_INFO);
		if(user != null){
			textView.setText(user.toString());
		}
	}

}
