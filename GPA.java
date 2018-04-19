	 package com.example.gpa_calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GPA extends Activity  {
	EditText c1,c2,c3,c4,c5,c6,m1,m2,m3,m4,m5,m6;
	TextView tv;
	Button b;
	int ch1,ch2,ch3,ch4,ch5,ch6;
	int mk1,mk2,mk3,mk4,mk5,mk6;
	double marks1,marks2,marks3,marks4,marks5,marks6;
	int totalch;
	double s1,s2,s3,s4,s5,s6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sgpa);
		tv=(TextView) findViewById(R.id.tv);
		 b=(Button) findViewById(R.id.b1);
	        c1=(EditText) findViewById(R.id.c1);
	        c2=(EditText) findViewById(R.id.c2);
	        c3=(EditText) findViewById(R.id.c3);
	        c4=(EditText) findViewById(R.id.c4);
	        c5=(EditText) findViewById(R.id.c5);
	        c6=(EditText) findViewById(R.id.c6);
	        m1=(EditText) findViewById(R.id.m1);
	        m2=(EditText) findViewById(R.id.m2);
	        m3=(EditText) findViewById(R.id.m3);
	        m4=(EditText) findViewById(R.id.m4);
	        m5=(EditText) findViewById(R.id.m5);
	        m6=(EditText) findViewById(R.id.m6);
	       
	       
	       b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				try{
				
				 ch1=Integer.parseInt(c1.getText().toString());
			        ch2=Integer.parseInt(c2.getText().toString());
			        ch3=Integer.parseInt(c3.getText().toString());
			        ch4=Integer.parseInt(c4.getText().toString());
			        ch5=Integer.parseInt(c5.getText().toString());
			        ch6=Integer.parseInt(c6.getText().toString());
				}
				catch(Exception ex){
					
				}
			      
			     try{  
			       
			       mk1=Integer.parseInt(m1.getText().toString());
			       if((mk1>=80)&&(mk1<=100)){
			       	marks1=4.0;
			       }
			       else if((mk1>=77)&&(mk1<=79)){
			       	marks1=3.66;
			       }
			       else if((mk1>=74)&&(mk1<=76)){
			       	marks1=3.33;
			       }
			       else if((mk1>=70)&&(mk1<=73)){
			       	marks1=3.0;
			       }
			       else if((mk1>=67)&&(mk1<=69)){
			       	marks1=2.66;
			       }
			       else if((mk1>=64)&&(mk1<=66)){
			       	marks1=2.33;
			       }
			       else if((mk1>=60)&&(mk1<=63)){
			       	marks1=2.0;
			       }
			       else if((mk1>=50)&&(mk1<=59)){
			       	marks1=1.5;
			       }
			       else if((mk1>=0)&&(mk1<=49)){
			       	marks1=0.0;
			       }
			       else
			       	marks1=0.0;
			     
			       mk2=Integer.parseInt(m2.getText().toString());
			       if((mk2>=80)&&(mk2<=100)){
			          	marks2=4.0;
			          }
			          else if((mk2>=77)&&(mk2<=79)){
			          	marks2=3.66;
			          }
			          else if((mk2>=74)&&(mk2<=76)){
			          	marks2=3.33;
			          }
			          else if((mk2>=70)&&(mk2<=73)){
			          	marks2=3.0;
			          }
			          else if((mk2>=67)&&(mk2<=69)){
			          	marks2=2.66;
			          }
			          else if((mk2>=64)&&(mk2<=66)){
			          	marks2=2.33;
			          }
			          else if((mk2>=60)&&(mk2<=63)){
			          	marks2=2.0;
			          }
			          else if((mk2>=50)&&(mk2<=59)){
			          	marks2=1.5;
			          }
			          else if((mk2>=0)&&(mk2<=49)){
			          	marks2=0.0;
			          }
			          else
			          	marks2=0.0;
			       mk3=Integer.parseInt(m3.getText().toString());
			       if((mk3>=80)&&(mk3<=100)){
			          	marks3=4.0;
			          }
			          else if((mk3>=77)&&(mk3<=79)){
			          	marks3=3.66;
			          }
			          else if((mk3>=74)&&(mk3<=76)){
			          	marks3=3.33;
			          }
			          else if((mk3>=70)&&(mk3<=73)){
			          	marks3=3.0;
			          }
			          else if((mk3>=67)&&(mk3<=69)){
			          	marks3=2.66;
			          }
			          else if((mk3>=64)&&(mk3<=66)){
			          	marks3=2.33;
			          }
			          else if((mk3>=60)&&(mk3<=63)){
			          	marks3=2.0;
			          }
			          else if((mk3>=50)&&(mk3<=59)){
			          	marks3=1.5;
			          }
			          else if((mk3>=0)&&(mk3<=49)){
			          	marks3=0.0;
			          }
			          else
			          	marks3=0.0;
			       mk4=Integer.parseInt(m4.getText().toString());
			       if((mk4>=80)&&(mk4<=100)){
			          	marks4=4.0;
			          }
			          else if((mk4>=77)&&(mk4<=79)){
			          	marks4=3.66;
			          }
			          else if((mk4>=74)&&(mk4<=76)){
			          	marks4=3.33;
			          }
			          else if((mk4>=70)&&(mk4<=73)){
			          	marks4=3.0;
			          }
			          else if((mk4>=67)&&(mk4<=69)){
			          	marks4=2.66;
			          }
			          else if((mk4>=64)&&(mk4<=66)){
			          	marks4=2.33;
			          }
			          else if((mk4>=60)&&(mk4<=63)){
			          	marks4=2.0;
			          }
			          else if((mk4>=50)&&(mk4<=59)){
			          	marks4=1.5;
			          }
			          else if((mk4>=0)&&(mk4<=49)){
			          	marks4=0.0;
			          }
			          else
			          	marks4=0.0;
			       mk5=Integer.parseInt(m5.getText().toString());
			       if((mk5>=80)&&(mk5<=100)){
			          	marks5=4.0;
			          }
			          else if((mk5>=77)&&(mk5<=79)){
			          	marks5=3.66;
			          }
			          else if((mk5>=74)&&(mk5<=76)){
			          	marks5=3.33;
			          }
			          else if((mk5>=70)&&(mk5<=73)){
			          	marks5=3.0;
			          }
			          else if((mk5>=67)&&(mk5<=69)){
			          	marks5=2.66;
			          }
			          else if((mk5>=64)&&(mk5<=66)){
			          	marks5=2.33;
			          }
			          else if((mk5>=60)&&(mk5<=63)){
			          	marks5=2.0;
			          }
			          else if((mk5>=50)&&(mk5<=59)){
			          	marks5=1.5;
			          }
			          else if((mk5>=0)&&(mk5<=49)){
			          	marks5=0.0;
			          }
			          else
			          	marks5=0.0;
			       mk6=Integer.parseInt(m6.getText().toString());
			       if((mk6>=80)&&(mk6<=100)){
			          	marks6=4.0;
			          }
			          else if((mk6>=77)&&(mk6<=79)){
			          	marks6=3.66;
			          }
			          else if((mk6>=74)&&(mk6<=76)){
			          	marks6=3.33;
			          }
			          else if((mk6>=70)&&(mk6<=73)){
			          	marks6=3.0;
			          }
			          else if((mk6>=67)&&(mk6<=69)){
			          	marks6=2.66;
			          }
			          else if((mk6>=64)&&(mk6<=66)){
			          	marks6=2.33;
			          }
			          else if((mk6>=60)&&(mk6<=63)){
			          	marks6=2.0;
			          }
			          else if((mk6>=50)&&(mk6<=59)){
			          	marks6=1.5;
			          }
			          else if((mk6>=0)&&(mk6<=49)){
			          	marks6=0.0;
			          }
			          else
			          	marks6=0.0;
			     }
			     catch(Exception ex){
						
					}
			     
			     
			      
			     s1=ch1*marks1;			    
			    s2=ch2*marks2;
			       s3=ch3*marks3;
			       s4=ch4*marks4;
			       s5=ch5*marks5;
			       s6=ch6*marks6;
			       totalch=ch1+ch2+ch3+ch4+ch5+ch6;
			       
				double gpa=(s1+s2+s3+s4+s5+s6)/totalch;
				tv.setText(""+gpa); 
				 
				
			      
			       
			}
		});
	}
	
	
	    
}
