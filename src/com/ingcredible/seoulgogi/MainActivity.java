package com.ingcredible.seoulgogi;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.NavUtils;

//  MainActivity
//   - 스플래시 이후에 불러지는 어플 메인 화면 - 비스타 제작
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 리스너 초기화
        findViewById(R.id.menu_1).setOnClickListener(this);
        findViewById(R.id.menu_2).setOnClickListener(this);
        findViewById(R.id.menu_3).setOnClickListener(this);
        findViewById(R.id.menu_4).setOnClickListener(this);
        findViewById(R.id.menu_5).setOnClickListener(this);
        findViewById(R.id.goto_facebook).setOnClickListener(this);
    }
    
    // 메뉴 혹은 버튼 클릭시
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.menu_1:
			// 메뉴1 클릭 (박기한 담당)
			break; 
			
		case R.id.menu_2:
			// 메뉴2 클릭 (박기한 담당)
			break;

		case R.id.menu_3:
			// 메뉴3 클릭
			break;
			
		case R.id.menu_4:
			// 메뉴4 클릭 (박기한 담당)
			break;
		
		case R.id.menu_5:
			// 메뉴5 클릭
			break;

		case R.id.goto_facebook:
			// 페이스북 서울고기 페이지로
			Uri uri = Uri.parse("http://m.facebook.com/Seoulgogi");
			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(intent);
		}
	}
}
