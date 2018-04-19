package com.example.gpa_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CGPA extends Activity {
EditText et1,et2,et3,et4,et5,et6,et;
Button b;
TextView tv;
double t,t1,t2,t3,t4,t5,t6,total,cgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);
        et4=(EditText) findViewById(R.id.et4);
        et5=(EditText) findViewById(R.id.et5);
        et6=(EditText) findViewById(R.id.et6);
        et=(EditText) findViewById(R.id.et);
        tv=(TextView)findViewById(R.id.tv);
        b=(Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
				t1=Double.parseDouble(et1.getText().toString());
				t2=Double.parseDouble(et2.getText().toString());
				t3=Double.parseDouble(et3.getText().toString());
				t4=Double.parseDouble(et4.getText().toString());
				t5=Double.parseDouble(et5.getText().toString());
				t6=Double.parseDouble(et6.getText().toString());
				t=Double.parseDouble(et.getText().toString());
				}
				catch(Exception e){
					Toast.makeText(getBaseContext(),"Place 0 at empty location",Toast.LENGTH_SHORT).show();
					
				}
				total=t1+t2+t3+t4+t5+t6;
				cgpa=total/t;
				tv.setText(""+cgpa);
				
				
				
				
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
