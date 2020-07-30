package com.example.demochurch4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demochurch4.Adapter.RecyclerViewAdapter;

public class Blog extends AppCompatActivity {
    private Button button;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        recyclerView =(RecyclerView)findViewById(R.id.list);
        String[] data ={"Test 1", "Test 2", "Test 3", "Test 4"};
        RecyclerViewAdapter adapter =new RecyclerViewAdapter(Blog.this, data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        button =findViewById(R.id.but2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBlog();
            }
        });
    }
    public void openBlog()
    {
        Intent i =new Intent(Blog.this,Navigation.class);
        startActivity(i);

    }
}