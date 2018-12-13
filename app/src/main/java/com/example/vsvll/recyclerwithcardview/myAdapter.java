package com.example.vsvll.recyclerwithcardview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myHolder> {

    //here the data will be sent and the data type is ArrayList

    private ArrayList<SingleItem> myDataList;

    public myAdapter(ArrayList<SingleItem> myDataList) {

        this.myDataList = myDataList;
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.single_row,viewGroup,false);

        return new myHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder myHolder, int position) {

        SingleItem currentItem = myDataList.get(position);
        myHolder.myImage.setImageResource(currentItem.getMyImageResource());
        myHolder.myTitle.setText(currentItem.getMyTitle());
        myHolder.mySubTitle.setText(currentItem.getMySubTitle());
    }

    @Override
    public int getItemCount() {
        //here we need to pass the length of of our data list

        return myDataList.size();
    }

    //Inner class
    public class myHolder extends RecyclerView.ViewHolder{

        //create constructor
        //here we will use find view by id to acess the id's of our single_row
        ImageView myImage;
        TextView myTitle, mySubTitle;

        public myHolder(@NonNull View itemView) {
            super(itemView);

            //with the help of itemView we can access it
            myImage = itemView.findViewById(R.id.imageView);
            myTitle =  itemView.findViewById(R.id.title);
            mySubTitle = itemView.findViewById(R.id.subTitle);

        }


    }
}
