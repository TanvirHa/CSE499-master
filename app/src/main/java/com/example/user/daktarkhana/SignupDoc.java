package com.example.user.daktarkhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupDoc extends AppCompatActivity {
    EditText mTextName;
    EditText mTextAge;
    EditText mTextPhoneNo;
    EditText mTextPass;
    EditText mTextConfirmPass;
    Button mButtonCreateAccount;
    TextView mTextViewLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_doc);
        mTextName = (EditText)findViewById(R.id.edittext_name);
        mTextPass = (EditText)findViewById(R.id.edittext_pass);
        mButtonCreateAccount = (Button)findViewById(R.id.button_create_account);
        mTextViewLogin = (TextView) findViewById(R.id.textview_login);

    }

}
