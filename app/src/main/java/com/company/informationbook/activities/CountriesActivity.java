package com.company.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.adapters.Viewpageradapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountriesActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        tabLayout=findViewById(R.id.tablayoutcountries);
        viewPager=findViewById(R.id.viewpageradapter);

        Viewpageradapter adapter= new Viewpageradapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayout, viewPager, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position)
                {
                    case 0:
                        tab.setText("United Kingdom");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}