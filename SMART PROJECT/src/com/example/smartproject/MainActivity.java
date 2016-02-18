package com.example.smartproject;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	  String pasw ;
      String nama;
      String namaku ="wisnusetiawan";
      String pswd ="12345";
      EditText name;
      EditText pass,tampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            name = (EditText)findViewById(R.id.editText1);
            pass = (EditText)findViewById(R.id.editText2);
            Button submit = (Button)findViewById(R.id.button1);
            submit.setOnClickListener(new click());
            }
            @SuppressLint("ShowToast")
            class click implements Button.OnClickListener{
            @SuppressLint("ShowToast")
            public void onClick(View v){
            nama = name.getText().toString();
            pasw = pass.getText().toString();
            if((pasw.equals(pswd))&&(nama.equals(namaku))){
                   Toast.makeText(getApplicationContext(),"Selamat datang, anda berhasil login..." ,31).show();
                   Intent i = new Intent(MainActivity.this, Activity2MainActivity.class);
                   startActivity(i);
            }else
                   Toast.makeText(getApplicationContext(),"Ma'af..., Username atau password salah",23).show();
                   name.setText("");
                   pass.setText("");
            }
            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}