package com.example.gpa_calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		 b1=(Button) findViewById(R.id.b1);
		 b2=(Button) findViewById(R.id.b2);
		 b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(MainActivity.this,GPA.class);
			startActivity(i);
			overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
			}
		});
		 b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,CGPA.class);
				startActivity(i);
				overridePendingTransition(R.anim.right_to_left, R.anim.left_to_right);
				
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
