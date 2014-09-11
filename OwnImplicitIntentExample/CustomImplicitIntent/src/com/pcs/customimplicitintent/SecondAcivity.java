package com.pcs.customimplicitintent;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class SecondAcivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		Uri uri = getIntent().getData();
		if (uri != null) {
			Toast.makeText(SecondAcivity.this, uri.toString(),
					Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(SecondAcivity.this,
					getResources().getString(R.string.no_data),
					Toast.LENGTH_LONG).show();

		}
	}

}
