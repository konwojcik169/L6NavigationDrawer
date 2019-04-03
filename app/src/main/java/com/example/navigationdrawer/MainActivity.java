package com.example.navigationdrawer;

import android.os.MemoryFile;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout d1;
    private ActionBarDrawerToggle abdt;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d1 = findViewById(R.id.activity_main);
        abdt = new ActionBarDrawerToggle(this, d1, 0, 0);
        d1.addDrawerListener(abdt);
        abdt.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nv = findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new
                NavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.account:
                        Toast.makeText(MainActivity.this,
                                "My Account", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.settings:
                        Toast.makeText(MainActivity.this,
                                "Settings", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.mycart:
                        Toast.makeText(MainActivity.this,
                                "My Cart", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return true;
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(abdt.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);

    }
}
