package com.example.passdataactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {
    private TextView name, email, contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        Toast.makeText(this, "Welcome to Second Activity", Toast.LENGTH_SHORT).show();
        name = (TextView) findViewById(R.id.textView_name);
        email = (TextView) findViewById(R.id.textview_email);
        contact = (TextView) findViewById(R.id.textview_contact);


        Intent intent = getIntent();
        String NAME_S = intent.getStringExtra("key1");
        name.setText("Welcome " + NAME_S);

        String EMAIL_S = intent.getStringExtra("key2");
        email.setText("Welcome " + EMAIL_S);

        String CONTACT_S = intent.getStringExtra("key3");
        contact.setText("Welcome " + CONTACT_S);
    }
}
