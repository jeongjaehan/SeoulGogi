package com.ingcredible.seoulgogi;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MenuActivity extends Activity implements View.OnClickListener {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		findViewById(R.id.menu_1).setOnClickListener(this);
		
		
		ArrayList<listitem> arraylist = new ArrayList<listitem>();//ListView�� �� ��ü �迭 ����

        ListView listview = (ListView)findViewById(R.id.foodList);//����Ʈ�� ��ü ��������

        arraylist.add(new listitem(R.drawable.title, "���", "100g�� 10000��", "��Ⱑ ���ֽ��ϴ�. �����ְ� ���ֽ��ϴ�. +��+)b"));
        arraylist.add(new listitem(R.drawable.title, "���", "100g�� 20000��", "��Ⱑ ���ֽ��ϴ�. �����ְ� ���ֽ��ϴ�. +��+)b"));
        arraylist.add(new listitem(R.drawable.title, "���", "100g�� 30000��", "��Ⱑ ���ֽ��ϴ�. �����ְ� ���ֽ��ϴ�. +��+)b"));

        CustomListAdapter customlistadapter =
                        new CustomListAdapter(this, R.layout.object_list, arraylist);//Ŀ���� ����Ʈ ����� ����

        listview.setAdapter(customlistadapter);//Ŀ���� ����Ʈ ����� ����
        
        listview.setOnItemClickListener(listener);//������Ŭ�� ������ ����

	}

	AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener()
    {
        public void onItemClick(AdapterView<?> adapterview, View view, int index, long l)
        {
        	switch(index){
        		
        	}
        }
	
    };
	

	public class listitem
	{

    	int image;
    	String name, fee, desc;

    	listitem(int id, String text1, String text2, String text3)
    	{
        	image = id;
        	name = text1;
        	fee = text2;
        	desc = text3;
    	}
	}
	
	public class CustomListAdapter extends BaseAdapter
    {
        Context context;
        LayoutInflater inflater;
        int layoutid;
        ArrayList<listitem> sourcearray;

        public CustomListAdapter(Context context, int id, ArrayList<listitem> arraylist)
        {
            this.context = MenuActivity.this;
            LayoutInflater layoutinflater = (LayoutInflater)context.getSystemService("layout_inflater");
            inflater = layoutinflater;
            layoutid = id;
            sourcearray = arraylist;
        }

                public long getItemId(int position) {
                        return position;
                }

                public Object getItem(int position) {
                        // TODO Auto-generated method stub
                        return null;
                }


        public int getCount()
        {
            return sourcearray.size();
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            if(view == null)
            {
                LayoutInflater layoutinflater = inflater;
                int j = layoutid;
                view = layoutinflater.inflate(j, viewgroup, false);
            }
            ImageView imageview = (ImageView)view.findViewById(R.id.image);
            int k = ((listitem)sourcearray.get(i)).image;
            imageview.setImageResource(k);
            TextView textview = (TextView)view.findViewById(R.id.name);
            String s = ((listitem)sourcearray.get(i)).name;
            textview.setText(s);
            TextView textview2 = (TextView)view.findViewById(R.id.fee);
            String s2 = ((listitem)sourcearray.get(i)).fee;
            textview2.setText(s2);
            TextView textview3 = (TextView)view.findViewById(R.id.desc);
            String s3 = ((listitem)sourcearray.get(i)).desc;
            textview3.setText(s3);
            return view;
        }
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();
		switch (id) {
		case R.id.menu_1:
			onBackPressed();
			break;
		}
	}
}

