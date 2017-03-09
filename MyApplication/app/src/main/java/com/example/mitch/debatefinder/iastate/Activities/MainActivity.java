package com.example.mitch.debatefinder.iastate.Activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mitch.debatefinder.R;

/**
 * Created by mitch on 3/9/2017.
 */

public class MainActivity extends Activity{

    public EditText login;
    public EditText password;
    public Button register;
    public Button signIn;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //inits
        login = (EditText) findViewById(R.id.login_box);
        password = (EditText) findViewById(R.id.password_box);
        register = (Button) findViewById(R.id.register_box);
        signIn = (Button) findViewById(R.id.sign_in);
        //onClickListeners
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goto register

            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call API
            }
        });





    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }
}
