package com.santiago.javius.tvapp;

/**
 * Created by Javius on 5/20/2018.
 */

public class Show
{
    private Url myURL = new Url();
    private String  myName;

    private int myChanNum;
    private int myShowNum;

    public Show(String name, int chan, int show)
    {
        myName = name;
        myChanNum = chan;
        myShowNum = show;
        setMyURL();
    }

    public void setMyURL()
    {
        myURL.generateAddress(myChanNum, myShowNum);
    }

    public String getName()
    {
        return myName;
    }
    public Url getURL()
    {
        return myURL;
    }

}
