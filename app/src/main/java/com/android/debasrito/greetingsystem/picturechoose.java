package com.android.debasrito.greetingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class picturechoose extends AppCompatActivity {
    ImageButton opt1;
    ImageButton opt2;
    ImageButton opt3;
    ImageButton opt4;
    Intent i;
    String opt;
    String namerec,namesen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picturechoose);
        opt1=(ImageButton)findViewById(R.id.opt1);
        opt2=(ImageButton)findViewById(R.id.opt2);
        opt3=(ImageButton)findViewById(R.id.opt3);
        opt4=(ImageButton)findViewById(R.id.opt4);
        i=getIntent();
        namesen=i.getStringExtra("namesen");
        namerec=i.getStringExtra("namerec");
        Toast.makeText(this,"Choose a picture",Toast.LENGTH_SHORT).show();
        opt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(picturechoose.this,writemessage.class);
                opt="opta";
                i.putExtra("namesen",namesen);
                i.putExtra("namerec",namerec);
                i.putExtra("value",opt);
                startActivity(i);
            }

        });
        opt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(picturechoose.this,writemessage.class);
                opt="optb";
                i.putExtra("namesen",namesen);
                i.putExtra("namerec",namerec);
                i.putExtra("value",opt);
                startActivity(i);
            }

        });
        opt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(picturechoose.this,writemessage.class);
                opt="optc";
                i.putExtra("namesen",namesen);
                i.putExtra("namerec",namerec);
                i.putExtra("value",opt);
                startActivity(i);
            }

        });
        opt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(picturechoose.this,writemessage.class);
                opt="optd";
                i.putExtra("namesen",namesen);
                i.putExtra("namerec",namerec);
                i.putExtra("value",opt);
                startActivity(i);
            }

        });
    }
}
