package com.example.practical3intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class Display extends Activity {
ArrayList<String> myteam=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent i=getIntent();

        myteam.addAll(i.getStringArrayListExtra("india"));
        myteam.addAll(i.getStringArrayListExtra("austrila"));
        myteam.addAll(i.getStringArrayListExtra("southafrica"));
        myteam.addAll(i.getStringArrayListExtra("newzeland"));

        final ListView lv=findViewById(R.id.myteam);

        ArrayAdapter<String> arr=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,myteam);

        lv.setAdapter(arr);

        Button b1=findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}
