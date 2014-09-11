package com.pcs.customimplicitintent;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		TextView thirdTxt = (TextView)findViewById(R.id.third);
		Uri uri = getIntent().getData();
		if(uri != null){
		thirdTxt.setText(uri.toString());
		}else{
			Toast.makeText(ThirdActivity.this, getResources().getString(R.string.no_data), Toast.LENGTH_LONG).show();
		}
	}

}
