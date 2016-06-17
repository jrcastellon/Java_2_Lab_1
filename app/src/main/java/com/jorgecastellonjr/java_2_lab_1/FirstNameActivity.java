package com.jorgecastellonjr.java_2_lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_name);
    }

    public void BtnOkFirst(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("first",text);

        setResult(RESULT_OK,intent);

        finish();
    }

    public void BtnCancelFirst(View view){
        finish();
    }
}
