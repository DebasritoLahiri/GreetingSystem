package com.android.debasrito.greetingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class finalviewc extends AppCompatActivity {
    TextView t;
    Button b;
    String namerec,namesen,message,email;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalviewc);
        t=(TextView) findViewById(R.id.finalmessage);
        i=getIntent();
        namesen=i.getStringExtra("namesen");
        namerec=i.getStringExtra("namerec");
        message=i.getStringExtra("message");
        email=i.getStringExtra("email");
        t.setText("Dear "+namerec+",\n            "+message+"\nWith love and care,\n"+namesen);
        b=(Button)findViewById(R.id.send);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                finish();
            }

        });
    }
}
