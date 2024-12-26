package com.lab.missclp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class viewlist extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_viewlist);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView=findViewById(R.id.lv1);

        String [] names = {"Nafisa",  "Ashik", "Rafi", "Rifat", "Shaon"};
        String[] phonenum= {"019293u", "345367", "876545", "752054305","0943532"};
        String[] emails={"n.risha@gmail.com", "aminul@gmail.com", "rafi1@gmail.com","","shaon@hoto000mail.com"};


        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,names);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent= new Intent(viewlist.this,details.class);
                intent.putExtra("fname", names[i]);
                intent.putExtra("pnum", phonenum[i]);
                intent.putExtra("email",emails[i]);


                startActivity(intent);


            }
        });


    }
}