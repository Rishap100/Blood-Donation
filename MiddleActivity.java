package com.example.rishap.blooddonation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MiddleActivity extends AppCompatActivity {

    EditText bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);

        bg = (EditText)findViewById(R.id.bloodg);
        Button submitbtn = (Button)findViewById(R.id.sbtn);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MiddleActivity.this, SeekerActivity.class);
                String bloodgroup = bg.getText().toString();
                i.putExtra("stuff",bloodgroup);
                startActivity(i);
            }
        });
    }
}
