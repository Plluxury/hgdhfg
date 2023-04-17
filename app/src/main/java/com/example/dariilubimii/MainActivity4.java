package com.example.dariilubimii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView txt = (TextView) findViewById(R.id.skip);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, REG.class);
                startActivity(intent);
            }

        });

    }

    public boolean onTouchEvent(MotionEvent me){

        if (me.getAction()==MotionEvent.ACTION_DOWN){
            Intent intent = new Intent(MainActivity4.this, REG.class);
            startActivity(intent);
        }
        return false;
    }

}
