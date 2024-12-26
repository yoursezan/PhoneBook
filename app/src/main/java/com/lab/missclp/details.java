package com.lab.missclp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class details extends AppCompatActivity {

    TextView friendsName;
    TextView friendEmail;
    TextView friendNumber;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        friendsName= findViewById(R.id.friendsname);
        friendEmail= findViewById(R.id.friendemail);
        friendNumber= findViewById(R.id.friendnumber);


        Intent intent=getIntent();


        String pnum = intent.getStringExtra("pnum");
        String email = intent.getStringExtra("email");
        int photo = intent.getIntExtra("photo", R.drawable.bangladesh);
        String fname= intent.getStringExtra("fname");


        friendsName.setText(fname);
        friendEmail.setText( email);
        friendNumber.setText( pnum);


    }
}