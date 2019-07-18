package com.example.myproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public void sendMessage(View view)
    {


        EditText
        Intent intent = new Intent(this,MessageActivity.class);
        startActivity(intent);
    }
}
