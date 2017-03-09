package com.example.mitch.debatefinder.iastate.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.example.mitch.debatefinder.R;
import com.example.mitch.debatefinder.iastate.models.Question;

/**
 * Created by mitch on 3/9/2017.
 */

public class PoliticalTestListViewItem extends RelativeLayout{

    public RelativeLayout rootView;
    public RadioButton bt1;
    public RadioButton bt2;
    public Question question;

    public RadioGroup radioGroup;

    public PoliticalTestListViewItem(Context context, final Question question) {
        super(context);
        rootView = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.testlistviewitem,null);
        this.question = question;

        bt1 = (RadioButton)findViewById(R.id.bt1_box);
        bt2 = (RadioButton)findViewById(R.id.bt2_box);

        bt1.setText("Agree");
        bt2.setText("Disagree");

        radioGroup = (RadioGroup)findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case 0: question.setAgree(true);
                        break;
                    case 1: question.setAgree(false);
                        break;
                }

            }
        });
    }

}
