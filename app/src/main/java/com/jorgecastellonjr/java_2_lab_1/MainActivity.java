package com.jorgecastellonjr.java_2_lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button button;

    public static final int FIRST_NAME_ACTIVITY = 0;
    public static final int MIDDLE_NAME_ACTIVITY = 1;
    public static final int LAST_NAME_ACTIVITY = 2;
    public static final int DOB_ACTIVITY = 3;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == FIRST_NAME_ACTIVITY) {
                String text = data.getStringExtra("first");
                button = (Button) findViewById(R.id.btn_first);
                button.setText(text);
            }
            if (requestCode == MIDDLE_NAME_ACTIVITY) {
                String text = data.getStringExtra("middle");
                button = (Button) findViewById(R.id.btn_middle);
                button.setText(text);
            }
            if (requestCode == LAST_NAME_ACTIVITY) {
                String text = data.getStringExtra("last");
                button = (Button) findViewById(R.id.btn_last);
                button.setText(text);
            }
            if (requestCode == DOB_ACTIVITY) {
                String text = data.getStringExtra("dob");
                button = (Button) findViewById(R.id.btn_dob);
                button.setText(text);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickFirst(View view){
        intent = new Intent(this, FirstNameActivity.class);
        startActivityForResult(intent, FIRST_NAME_ACTIVITY);
    }

    public void ClickMiddle(View view){
        intent = new Intent(this, MiddleNameActivity.class);
        startActivityForResult(intent, MIDDLE_NAME_ACTIVITY);
    }

    public void ClickLast(View view){
        intent = new Intent(this, LastNameActivity.class);
        startActivityForResult(intent, LAST_NAME_ACTIVITY);
    }

    public void ClickDOB(View view){
        intent = new Intent(this, DateOfBirthActivity.class);
        startActivityForResult(intent, DOB_ACTIVITY);
    }

}
