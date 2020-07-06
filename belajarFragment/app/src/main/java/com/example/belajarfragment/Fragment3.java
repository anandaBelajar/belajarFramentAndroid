package com.example.belajarfragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    private static final String TAG = "fragment3";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnnavSecondActivity;

    //Difference between fragment classs and normal class, in fragment class we use method onCreateView instead of oncreate method like nromal class
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment3_layout, container, false); //use fragment)layout for the layout of the fragment 1

        //widget declaration
        //difference widtget declaration from normal class we have to attach 'view' in declaration
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3 = (Button) view.findViewById(R.id.btnNavFrag3);
        btnnavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);
        Log.d(TAG, "onCreateView: started");

        btnNavFrag1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "navigate to fragment1", Toast.LENGTH_SHORT).show();
                //navigate to fragment
                ((MainActivity)getActivity()).setmViewPager2(0);
            }
        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "navigate to fragment2", Toast.LENGTH_SHORT).show();
                //navigate to fragment
                ((MainActivity)getActivity()).setmViewPager2(1);
            }
        });

        btnNavFrag3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "navigate to fragment3", Toast.LENGTH_SHORT).show();
                //navigate to fragment
                ((MainActivity)getActivity()).setmViewPager2(2);
            }
        });


        btnnavSecondActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "navigate to second activity", Toast.LENGTH_SHORT).show();
                //navigate tosecond aactivity
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
