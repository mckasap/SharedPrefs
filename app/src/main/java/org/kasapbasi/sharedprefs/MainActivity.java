package org.kasapbasi.sharedprefs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onStop() {
        super.onStop();
        String str= et.getText().toString();
        SharedPreferences.Editor edit= pref.edit();
        edit.putString("theKey",str);
        edit.commit();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
    SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            et=(EditText) findViewById(R.id.theText);

         pref= getSharedPreferences("TEST",MODE_PRIVATE);
        String str=pref.getString("theKey","");
        et.setText(str);


    }



}
