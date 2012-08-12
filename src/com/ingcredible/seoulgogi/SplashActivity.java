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
