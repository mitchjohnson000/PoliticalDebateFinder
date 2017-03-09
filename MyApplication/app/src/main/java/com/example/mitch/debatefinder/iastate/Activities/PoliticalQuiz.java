package com.example.mitch.debatefinder.iastate.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.mitch.debatefinder.R;
import com.example.mitch.debatefinder.iastate.models.Question;
import com.example.mitch.debatefinder.iastate.views.PoliticalTestListViewItem;

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


    class Adapter extends BaseAdapter{

        ArrayList<Question> questions;

        public Adapter(ArrayList<Question> questions) {
            super();
            this.questions = questions;

        }

        @Override
        public int getCount() {
            return questions.size();
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public Object getItem(int position) {
            return questions.get(position);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null){
                convertView = new PoliticalTestListViewItem(getApplicationContext(), questions.get(position));
            }



            return convertView;
        }
    }
}
