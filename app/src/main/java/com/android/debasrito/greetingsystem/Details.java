package com.android.debasrito.greetingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.*;

public class Details extends AppCompatActivity {
    Button b;
    TextView o;
    TextView d;
    Intent i;
    String namesen,namerec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        o = (TextView) findViewById(R.id.origin);
        d = (TextView) findViewById(R.id.destination);
        b = (Button) findViewById(R.id.create_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namesen= o.getText().toString();
                namerec= d.getText().toString();
                Intent i = new Intent(Details.this, picturechoose.class);
                i.putExtra("namesen",namesen);
                i.putExtra("namerec",namerec);
                startActivity(i);
            }
        });
    }

    ;
}
