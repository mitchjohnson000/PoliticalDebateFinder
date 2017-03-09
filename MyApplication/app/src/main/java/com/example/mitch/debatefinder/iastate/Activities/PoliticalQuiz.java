package com.example.mitch.debatefinder.iastate.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;


import com.example.mitch.debatefinder.R;

import java.util.ArrayList;

/**
 * Created by nate on 3/8/17.
 */

public class PoliticalQuiz extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.political_quiz_layout);

        //* *EDIT* *
        ListView listview = (ListView) findViewById(R.id.listView1);

    }

    public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        // Then you start a new Activity via Intent
        Intent intent = new Intent();
        //intent.setClass(this, ListItemDetail.class);
        //intent.putExtra("position", position);
        // Or / And
        //intent.putExtra("id", id);
        //startActivity(intent);
    }

    class Adapter extends BaseAdapter{

        ArrayList<String> data = new ArrayList<>();

        public Adapter(ArrayList<String> data) {
            super();
            this.data = data;

        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null){

            }

            return null;
        }
    }
}
