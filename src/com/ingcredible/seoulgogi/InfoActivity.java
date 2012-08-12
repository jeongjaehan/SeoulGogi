package com.ingcredible.seoulgogi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends Activity implements View.OnClickListener {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		
		// 리스너 초기화
		findViewById(R.id.menu_1).setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		switch(id){
		case R.id.menu_1:
			onBackPressed();
			break;
		}
	}
}
