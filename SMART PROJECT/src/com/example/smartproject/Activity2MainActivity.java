package com.example.smartproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Activity2MainActivity extends Activity {
 private final static String fileku="fileku.txt";
 private EditText editor;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity2_main);
        editor=(EditText)findViewById(R.id.editor);
        
        Button btn=(Button)findViewById(R.id.close);
        btn.setOnClickListener(new Button.OnClickListener() {
         public void onClick(View v){
          finish();
         }
        });
    }
    
    public void onResume(){
     super.onResume();
      try{
       InputStream in=openFileInput(fileku);
       if(in!=null){
        InputStreamReader tmp=new InputStreamReader(in);
        BufferedReader reader = new
        BufferedReader(tmp);
        String str;
        StringBuilder buf=new StringBuilder();
        while((str=reader.readLine())!=null){
         buf.append(str+"\n");
        }
        in.close();
        editor.setText(buf.toString());   
       }
      }
      catch(java.io.FileNotFoundException e){
       
      }
      
      catch(Throwable t){
       Toast.makeText(this, "Exception : "+t.toString(), 2000).show();
      }
    }
    
    public void onPause(){
     super.onPause();
     
     try{
      OutputStreamWriter out = new OutputStreamWriter(openFileOutput(fileku, 0));
      out.write(editor.getText().toString());
      out.close();
     }
     catch(Throwable t){
      Toast.makeText(this, "Exception : "+t.toString(), 2000).show();
     }
    }
}