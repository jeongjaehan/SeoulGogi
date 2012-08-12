package com.ingcredible.seoulgogi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// SplashActivity
// - 서울고깃집 로고가 나오는 스플래시 화면 - 비스타 제작
public class SplashActivity extends Activity {

	// 액티비티가 표시중인지에 대한 정보
	boolean paused = false;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 900초 후에 액티비티 종료 메세지를 전송
		handler.sendEmptyMessageDelayed(0, 900);
	}

	@Override
	public void onPause() {
		super.onPause();
		paused = true; // 액티비티가 표시중이 아닐때는 액티비티를 종료하면 안되니까 플래그를 세운다.
	};

	// 핸들러 함수
	Handler handler = new Handler() {
		public void handleMessage(Message message) {
			if (!paused) {
				// 메인화면 실행
				Intent intent = new Intent(SplashActivity.this,	MainActivity.class);
				SplashActivity.this.startActivity(intent);
			}
			
			// 운지!
			finish();
		}
	};
}
