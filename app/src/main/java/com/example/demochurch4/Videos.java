package com.example.demochurch4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Videos extends AppCompatActivity {
    private Button button;

    AdapterClass adapterClass;
    RecyclerView recyclerView;
    String[] title,subtitle;
    int [] images={R.drawable.badal,R.drawable.address1,R.drawable.aboutus1,R.drawable.church1,R.drawable.aboutus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        recyclerView =findViewById(R.id.recyclerViewId);
        title=getResources().getStringArray(R.array.title);
        subtitle=getResources().getStringArray(R.array.sub_title);



        adapterClass =new AdapterClass(getApplicationContext(),title,subtitle,images);
        recyclerView.setAdapter(adapterClass);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        button =findViewById(R.id.but2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVideos();
            }
        });
    }

    public void openVideos()
    {
        Intent i =new Intent(Videos.this,Navigation.class);
        startActivity(i);

    }
}