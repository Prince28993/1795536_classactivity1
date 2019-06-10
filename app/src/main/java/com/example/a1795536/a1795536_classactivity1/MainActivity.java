package com.example.a1795536.a1795536_classactivity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText edt_name,    edt_numpass;
    Button  btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         String TAG, btn_sub;
        Button btn;
        Text View reg;
        EditText name , email, password;

        final Object edt_name = findViewById(R.id.edt_name);
       // edt_email = findViewById(R.id.edt_email);
        edt_numpass = findViewById(R.id.edt_numpass);

        btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edt_name.getText().toString();
               // String email = edt_email.getText().toString();

                Log.v(TAG,name);

                Log.v(TAG,edt_name.getText().toString());

            }
        });

    }
}