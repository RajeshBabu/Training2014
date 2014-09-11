package com.pcs.customimplicitintent;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		ImageView imageView = (ImageView) findViewById(R.id.imageview);
		imageView.setImageResource(R.drawable.image);
		Uri uri = getIntent().getData();
		if (uri != null) {
			Toast.makeText(FirstActivity.this, uri.toString(),
					Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(FirstActivity.this,
					getResources().getString(R.string.no_data),
					Toast.LENGTH_LONG).show();

		}
	}

}
