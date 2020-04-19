package com.example.lab1_lozovytska;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.lab1_lozovytska.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyLog";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"Activity onCreate");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }
    protected void onStart() {
        Log.d(TAG,"Activity onStart");
        super.onStart();
    }
    protected void onStop() {
        Log.d(TAG,"Activity onStop");
        super.onStop();
    }
    protected void onRestart() {
        Log.d(TAG,"Activity onRestart");
        super.onRestart();
    }
    protected void onDestroy() {
        Log.d(TAG,"Activity onDestroy");
        super.onDestroy();
    }
}