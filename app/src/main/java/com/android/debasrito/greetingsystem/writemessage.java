package com.android.debasrito.greetingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class writemessage extends AppCompatActivity {
    EditText t1;
    EditText t2;
    Button b;
    String namerec,namesen,message,email;
    String opt;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writemessage);
        t1=(EditText)findViewById(R.id.message);
        t2=(EditText)findViewById(R.id.email);
        b=(Button)findViewById(R.id.viewfinal);
        i=getIntent();
        namesen=i.getStringExtra("namesen");
        namerec=i.getStringExtra("namerec");
        opt=i.getStringExtra("value");
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent in;
                if(opt.equals("opta"))
                {
                    in=new Intent(writemessage.this, finalview.class);
                }
                else if(opt.equals("optb"))
                {
                    in=new Intent(writemessage.this, finalviewb.class);
                }
                else if(opt.equals("optc"))
                {
                    in=new Intent(writemessage.this, finalviewc.class);
                }
                else
                {
                    in=new Intent(writemessage.this, finalviewd.class);
                }
                message= t1.getText().toString();
                email= t2.getText().toString();
                in.putExtra("namesen",namesen);
                in.putExtra("namerec",namerec);
                in.putExtra("message",message);
                in.putExtra("email",email);
                in.putExtra("value",opt);
                startActivity(in);
            }

        });
    }
}
