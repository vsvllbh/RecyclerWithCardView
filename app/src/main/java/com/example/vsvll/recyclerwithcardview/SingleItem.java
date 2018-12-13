package com.example.vsvll.recyclerwithcardview;

public class SingleItem  {

   private int myImageResource;
    private  String myTitle;
    private String mySubTitle;

    public  SingleItem (int ImageResource, String Title, String SubTitle)

    {

        myImageResource = ImageResource;
        myTitle = Title;
        mySubTitle = SubTitle;

    }

    public int getMyImageResource() {
        return myImageResource;
    }

    public String getMyTitle() {
        return myTitle;
    }

    public String getMySubTitle() {
        return mySubTitle;
    }
}
