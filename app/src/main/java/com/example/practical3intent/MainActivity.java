package com.example.practical3intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends Activity {


    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    ArrayList<Integer> list3=new ArrayList<>();
    ArrayList<Integer> list4=new ArrayList<>();
    ArrayList<String>  india=new ArrayList<>();
    ArrayList<String>  austrila=new ArrayList<>();
    ArrayList<String>  southafrica=new ArrayList<>();
    ArrayList<String>  newzeland=new ArrayList<>();
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Team1.class);
                  i.putExtra("checked",list1);
                  i.putExtra("count",count);
                startActivityForResult(i,1);
            }
        });
        Button b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(getApplicationContext(),Team2.class);
                i2.putExtra("checked",list2);
                i2.putExtra("count",count);
                startActivityForResult(i2,2);
            }
        });
        Button b3=findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(getApplicationContext(),Team3.class);
                i3.putExtra("checked",list3);
                i3.putExtra("count",count);
                startActivityForResult(i3,3);
            }
        });
        Button b4=findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(getApplicationContext(),Team4.class);
                i4.putExtra("checked",list4);
                i4.putExtra("count",count);
                startActivityForResult(i4,4);
            }
        });

        Button submit=findViewById(R.id.submit);


            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(count>=11) {
                        Intent i5 = new Intent(getApplicationContext(), Display.class);
                        i5.putStringArrayListExtra("india", india);
                        i5.putStringArrayListExtra("austrila", austrila);
                        i5.putStringArrayListExtra("southafrica", southafrica);
                        i5.putStringArrayListExtra("newzeland", newzeland);
                        startActivityForResult(i5, 5);
                    }
                    else
                        Toast.makeText(getApplicationContext(),"Select 11 Players", Toast.LENGTH_LONG).show();
                }
            });



    }
    public void onActivityResult(int requestCode, int resultcode, Intent data)
    {   count=data.getIntExtra("count",0);
        if(requestCode==1)
        {   list1=data.getIntegerArrayListExtra("checked");
            india=data.getStringArrayListExtra("india");

            if(resultcode==RESULT_OK)
            {

                Toast.makeText(getApplicationContext(),"Players Added"+count,Toast.LENGTH_LONG).show();
            }else if (resultcode==RESULT_CANCELED)
            {
                Toast.makeText(getApplicationContext(),"Not Success", Toast.LENGTH_LONG).show();
            }
        }
        else if(requestCode==2){
            list2=data.getIntegerArrayListExtra("checked");
            austrila=data.getStringArrayListExtra("austrila");
            if(resultcode==RESULT_OK)
            {

                Toast.makeText(getApplicationContext(),"Players Added"+count,Toast.LENGTH_LONG).show();
            }else if (resultcode==RESULT_CANCELED)
            {
                Toast.makeText(getApplicationContext(),"Not Success", Toast.LENGTH_LONG).show();
            }
        }
        else if(requestCode==3){
            list3=data.getIntegerArrayListExtra("checked");
            southafrica=data.getStringArrayListExtra("southafrica");
            if(resultcode==RESULT_OK)
            {

                Toast.makeText(getApplicationContext(),"Players Added"+count,Toast.LENGTH_LONG).show();
            }else if (resultcode==RESULT_CANCELED)
            {
                Toast.makeText(getApplicationContext(),"Not Success", Toast.LENGTH_LONG).show();
            }
        }
        else if(requestCode==4){
            list4=data.getIntegerArrayListExtra("checked");
            newzeland=data.getStringArrayListExtra("newzeland");
            if(resultcode==RESULT_OK)
            {

                Toast.makeText(getApplicationContext(),"Players Added"+count,Toast.LENGTH_LONG).show();
            }else if (resultcode==RESULT_CANCELED)
            {
                Toast.makeText(getApplicationContext(),"Not Success", Toast.LENGTH_LONG).show();
            }
        }
        else if(requestCode==5){
            if(resultcode==RESULT_OK)
            {

                Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();
            }else if (resultcode==RESULT_CANCELED)
            {
                Toast.makeText(getApplicationContext(),"Not Success", Toast.LENGTH_LONG).show();
            }
        }
    }

}
