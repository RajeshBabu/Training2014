package com.pcs.sampleimplicitintent;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	private Button dailBtn;
	public static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.implicit);
		dailBtn = (Button) findViewById(R.id.dial_btn);
		dailBtn.setOnClickListener(this);
		Button emailBtn = (Button) findViewById(R.id.email_btn);
		emailBtn.setOnClickListener(this);
		Button browse = (Button) findViewById(R.id.browse_btn);
		Button editContactsBtn = (Button) findViewById(R.id.editcontact_btn);
		Button viewContactsBtn = (Button) findViewById(R.id.contact_btn);
		browse.setOnClickListener(this);
		editContactsBtn.setOnClickListener(this);
		viewContactsBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent mIntent = new Intent();
		switch (v.getId()) {
		case R.id.dial_btn:
			mIntent = new Intent(Intent.ACTION_VIEW);
			mIntent.setData(Uri.parse("tel:9490570889"));
			break;
		case R.id.email_btn:
			mIntent = new Intent(Intent.ACTION_SEND);
			mIntent.putExtra(Intent.EXTRA_TEXT, "Hi How are you");
			mIntent.putExtra(Intent.EXTRA_SUBJECT, "Leave");
			mIntent.putExtra(Intent.EXTRA_EMAIL, "rajehsmca38@gmail.com");

			break;
		case R.id.browse_btn:
			mIntent = new Intent(Intent.ACTION_VIEW);
			mIntent.setData(Uri.parse("http://paradigmcreatives.com"));
			break;
		case R.id.editcontact_btn:
			mIntent = new Intent(Intent.ACTION_EDIT);
			mIntent.setData(Uri.parse("content://contacts/people/1"));

			break;
		case R.id.contact_btn:
			mIntent = new Intent("android.media.action.IMAGE_CAPTURE");
			// mIntent.setData(Uri.parse("content://contacts/people/"));
			break;
		default:
			break;
		}
		if(checkIntent(mIntent)){
		startActivity(Intent.createChooser(mIntent,
				getResources().getString(R.string.choose)));
		}else{
			Log.i(TAG,"None of the application supporting top open.");
		}

	}

	private boolean checkIntent(Intent inent) {
		List<ResolveInfo> info = getPackageManager().queryIntentActivities(
				inent, 0);
		if (info != null && info.size() != 0) {
			return true;
		} else {
			return false;
		}

	}

}
