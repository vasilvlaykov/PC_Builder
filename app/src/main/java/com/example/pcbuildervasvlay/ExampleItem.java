package com.example.pcbuildervasvlay;

public class ExampleItem {
    private int mImageResource;
    private String mText1;
    private String mText2;
    private String mText3;

    public ExampleItem(int mImageResource, String mText1, String mText2, String mText3) {
        this.mImageResource = mImageResource;
        this.mText1 = mText1;
        this.mText2 = mText2;
        this.mText3 = mText3;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public String getmText3() {
        return mText3;
    }
}
