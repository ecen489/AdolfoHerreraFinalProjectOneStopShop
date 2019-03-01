package com.example.giftest2;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;


public class ShopActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        tabLayout = (TabLayout) findViewById(R.id.tablelayout);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        // Adding Fragments
        adapter.AddFragment(new fragmentSneakers(),"Sneakers");
        adapter.AddFragment(new fragmentShirt(),"Clothes");
        //adapter.AddFragment(new fragmentExtra(),"Extra");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
