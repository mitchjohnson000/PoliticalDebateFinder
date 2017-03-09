package com.example.mitch.debatefinder.iastate.Activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mitch.debatefinder.R;

/**
 * Created by mitch on 3/9/2017.
 */

public class MainActivity extends Activity{

    public EditText login;
    public EditText password;
    public TextView register;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //inits
        login = (EditText) findViewById(R.id.login_box);
        password = (EditText) findViewById(R.id.password_box);
        register = (TextView) findViewById(R.id.register_box);
        //onClickListeners
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }
}
