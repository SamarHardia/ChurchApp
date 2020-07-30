package com.example.demochurch4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Navigation extends AppCompatActivity {
        ActionBarDrawerToggle tg;
        DrawerLayout dl;
        NavigationView nv;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_drawer_layout);

        dl=(DrawerLayout)findViewById(R.id.drawerlayout);
        tg=new ActionBarDrawerToggle(this, dl, R.string.drawer_open, R.string.drawer_close);
        dl.addDrawerListener(tg);
        tg.syncState();

    //load fragment default
    fragmentManager =getSupportFragmentManager();
    fragmentTransaction=fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.container_fragment,new NavMain());
    fragmentTransaction.commit();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nv =(NavigationView)findViewById(R.id.nav);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id =menuItem.getItemId();
                switch(id){
                    case R.id.home:
                     Toast.makeText(Navigation.this, "Tapped on Home", Toast.LENGTH_SHORT).show();
                     break;
                    case R.id.email:
                        Toast.makeText(Navigation.this, "Tapped on Email", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.settings:
                        Toast.makeText(Navigation.this, "Tapped on Setting", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.help:
                        Toast.makeText(Navigation.this, "Tapped on Help", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
        }
@Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

    tg.onOptionsItemSelected((item));
    return super.onOptionsItemSelected(item);
}

        }