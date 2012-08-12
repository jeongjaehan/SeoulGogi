package com.ingcredible.seoulgogi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// SplashActivity
// - �������� �ΰ� ������ ���÷��� ȭ�� - ��Ÿ ����
public class SplashActivity extends Activity {

	// ��Ƽ��Ƽ�� ǥ���������� ���� ����
	boolean paused = false;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 900�� �Ŀ� ��Ƽ��Ƽ ���� �޼����� ����
		handler.sendEmptyMessageDelayed(0, 900);
	}

	@Override
	public void onPause() {
		super.onPause();
		paused = true; // ��Ƽ��Ƽ�� ǥ������ �ƴҶ��� ��Ƽ��Ƽ�� �����ϸ� �ȵǴϱ� �÷��׸� �����.
	};

	// �ڵ鷯 �Լ�
	Handler handler = new Handler() {
		public void handleMessage(Message message) {
			if (!paused) {
				// ����ȭ�� ����
				Intent intent = new Intent(SplashActivity.this,	MainActivity.class);
				SplashActivity.this.startActivity(intent);
			}
			
			// ����!
			finish();
		}
	};
}
