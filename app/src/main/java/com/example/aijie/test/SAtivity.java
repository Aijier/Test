package com.example.aijie.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aijie on 16/3/25.
 */
public class SAtivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);

        ListView listView = (ListView)findViewById(R.id.listView);

        MyAdapter myAdapter = new MyAdapter();

        List<ItemModel> list = new ArrayList<ItemModel>();

        for (int i = 0; i < 10; i++) {
            ItemModel itemModel = new ItemModel(android.R.drawable.alert_dark_frame, "标题" + i,
                    "描述木奥斯" + i, "2015-4-4" + "  " + i);
            list.add(itemModel);
        }

        myAdapter.setList(list);



        listView.setAdapter(myAdapter);

    }
}
