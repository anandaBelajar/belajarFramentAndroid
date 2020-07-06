package com.example.belajarfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private  static final String TAG = "MainActivity";

    //make object for fragment adapater
    private SecondStatePagerAdapter mSectionStatePagerAdapter;
    //make object for fragment holder
    private ViewPager mViewPager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");

        mSectionStatePagerAdapter = new SecondStatePagerAdapter(getSupportFragmentManager());

        mViewPager2 = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager2);


    }

    private  void setupViewPager(ViewPager viewPager2){
        //set the fragment adapter
        SecondStatePagerAdapter adapter  = new SecondStatePagerAdapter(getSupportFragmentManager());
        //add the fragment to the adapater
        adapter.addFragment(new Fragment1(), "Fragment 1");
        adapter.addFragment(new Fragment2(), "Fragment 2");
        adapter.addFragment(new Fragment3(), "Fragment 3");

        viewPager2.setAdapter(adapter);
    }

    public void setmViewPager2(int fragmentNumber){
        //set the current fragmen by fragment number in the adapter fargment array list
        //fragment1 = [0]
        //fragment1 = [1]
        //fragment1 = [2]
        mViewPager2.setCurrentItem(fragmentNumber);
    }
}