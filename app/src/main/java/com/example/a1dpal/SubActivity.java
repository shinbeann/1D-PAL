package com.example.a1dpal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {
        ViewPager viewPager;
        Button btnHome;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            viewPager = findViewById(R.id.viewPager);

            // Create a list of stage images
            ArrayList<Stage> stageArrayList = new ArrayList<Stage>();
            stageArrayList.add(new Stage("Village", R.drawable.village));
            stageArrayList.add(new Stage("Mountain", R.drawable.mountain));
            stageArrayList.add(new Stage("Lake", R.drawable.lake));
            stageArrayList.add(new Stage("Castle", R.drawable.castle));

            // Create a custom adapter for the ViewPager
            StagePagerAdapter adapter = new StagePagerAdapter(this, stageArrayList);
            viewPager.setAdapter(adapter);

            btnHome = findViewById(R.id.homeBtn);
            btnHome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        String rs = new ChatGPT.NetworkAsyncTask().execute("1 plus 2").get();
                        System.out.println(rs);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            });
        }
    }
