package com.example.passdataactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView buttonLogin;
    EditText fullName, email, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonLogin = (ImageView) findViewById(R.id.btn_Login);

        fullName = (EditText) findViewById(R.id.fullName);
        email = (EditText) findViewById(R.id.email);
        contact = (EditText) findViewById(R.id.contact);

        Toast.makeText(getApplicationContext(), "Welcome User", Toast.LENGTH_LONG).show();

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NAME = fullName.getText().toString();
                String EMAIL = email.getText().toString();
                String CONTACT = contact.getText().toString();

                Intent intent = new Intent(MainActivity.this, WelcomeScreen.class);
                intent.putExtra("key1", NAME);
                intent.putExtra("key2", EMAIL);
                intent.putExtra("key3", CONTACT);
                startActivity(intent);
            }

    });
}

}

