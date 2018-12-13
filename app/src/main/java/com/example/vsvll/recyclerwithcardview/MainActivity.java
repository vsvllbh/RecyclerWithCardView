package com.example.vsvll.recyclerwithcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Here arrayList is required to send the data in to the Single Item
        ArrayList<SingleItem> myDataList = new ArrayList<>();

        //Now we will push or add the data to the ArrayList or myDataList.
        myDataList.add(new SingleItem(R.drawable.img_1,"Title1","sub title 1"));
        myDataList.add(new SingleItem(R.drawable.img_2,"Title2","sub title 2"));
        myDataList.add(new SingleItem(R.drawable.img_3,"Title3","sub title 3"));
        myDataList.add(new SingleItem(R.drawable.img_4,"Title4","sub title 4"));
        myDataList.add(new SingleItem(R.drawable.img_5,"Title5","sub title 5"));
        myDataList.add(new SingleItem(R.drawable.img_6,"Title6","sub title 6"));
        myDataList.add(new SingleItem(R.drawable.img_7,"Title7","sub title 7"));
        myDataList.add(new SingleItem(R.drawable.img_8,"Title8","sub title 8"));
        myDataList.add(new SingleItem(R.drawable.img_9,"Title9","sub title 9"));
        myDataList.add(new SingleItem(R.drawable.img_10,"Title10","sub title 10"));



        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new myAdapter(myDataList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
