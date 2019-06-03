package com.example.a1795536.a1795536_classactivity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.1795536_activity1);

        Object edt_name = findViewById(R.id.edt_name);
        edt_email = findViewById(R.id.edt_email);
        edt_pass = findViewById(R.id.edt_numpass);

        btn_sub = findViewById(R.id.btn_submit);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edt_name.getText().toString();
                String email = edt_email.getText().toString();

                Log.v(TAG,name);
                Log.v(TAG,email);
                Log.v(TAG,edt_pass.getText().toString());

            }
        });

    }
}