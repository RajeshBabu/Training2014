package com.pcs.requestimplicitintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button showImageBtn = (Button)findViewById(R.id.show_image_btn);
		showImageBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
                  Intent mIntent = new Intent("com.pcs.customimplicitintent.SHOW_TEXT");	
                  mIntent.setData(Uri.parse("http://www.facebook.com"));
                  startActivity(mIntent);
			}
		});
	}

}
