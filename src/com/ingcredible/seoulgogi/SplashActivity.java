/*
 * Copyright (C) 2012 The Provision Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ingcredible.seoulgogi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import android.app.*;
import android.content.*;
import android.os.*;

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
