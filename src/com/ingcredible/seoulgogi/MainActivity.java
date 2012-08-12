package com.ingcredible.seoulgogi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

//  MainActivity
//   - ���÷��� ���Ŀ� �ҷ����� ���� ���� ȭ�� - ��Ÿ ����
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ������ �ʱ�ȭ
        findViewById(R.id.menu_1).setOnClickListener(this);
        findViewById(R.id.menu_2).setOnClickListener(this);
        findViewById(R.id.menu_3).setOnClickListener(this);
        findViewById(R.id.menu_4).setOnClickListener(this);
        findViewById(R.id.menu_5).setOnClickListener(this);
        findViewById(R.id.goto_facebook).setOnClickListener(this);
    }
    
    // �޴� Ȥ�� ��ư Ŭ����
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.menu_1:
			// �޴�1 Ŭ�� (�ڱ��� ���)
			Intent i = new Intent(MainActivity.this, InfoActivity.class);
			startActivity(i);
			break; 
			
		case R.id.menu_2:
			// �޴�2 Ŭ�� (�ڱ��� ���)
			Intent i2 = new Intent(MainActivity.this, MenuActivity.class);
			startActivity(i2);
			break;

		case R.id.menu_3:
			// �޴�3 Ŭ��
			break;
			
		case R.id.menu_4:
			// �޴�4 Ŭ�� (�ڱ��� ���)
			// �� ���� ���� �ʿ���ٰ� ��ö���� �׷��Ŵ�. ���� OUT!
			break;
		
		case R.id.menu_5:
			// �޴�5 Ŭ��
			break;

		case R.id.goto_facebook:
			// ���̽��� ������ ��������
			Uri uri = Uri.parse("http://m.facebook.com/Seoulgogi");
			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(intent);
		}
	}
}
