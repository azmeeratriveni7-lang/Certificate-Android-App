package com.example.mycertify;
import android.os.Bundle; 
import android.widget.*; 
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 EditText etName, etDomain; Button btn; TextView tv;
 protected void onCreate(Bundle s){ 
   super.onCreate(s); 
   setContentView(R.layout.activity_main);
   etName=findViewById(R.id.etName); 
   etDomain=findViewById(R.id.etDomain); 
   btn=findViewById(R.id.btnGenerate); 
   tv=findViewById(R.id.tvPreview);
   btn.setOnClickListener(v->{ 
     String cert="CERTIFICATE\nThis is to certify that\n"+etName.getText()+"\nhas completed "+etDomain.getText()+" at Tech Vedhu"; 
     tv.setText(cert); 
   });
 }
}