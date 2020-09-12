package com.elhady.expandrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.elhady.expandrecyclerview.adapter.ExpandAdapter;
import com.elhady.expandrecyclerview.model.Expender;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Expender> expenderList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        initData();
        setRecyclerView();
    }

    private void initData() {
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
        expenderList.add(new Expender("java","4","dsfsdf","sdf lsf lskdf sd lkjsd lsdk "));
    }

    private void setRecyclerView() {
        ExpandAdapter adapter = new ExpandAdapter(expenderList);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }
}