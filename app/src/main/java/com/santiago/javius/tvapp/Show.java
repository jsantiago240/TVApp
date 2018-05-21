package com.santiago.javius.tvapp;

/**
 * Created by Javius on 5/20/2018.
 */

public class Show
{
    private Url myURL;
    private String  myName;


    public Show(String name, int chan, int show)
    {
        myName = name;
        myURL = new Url(chan, show);
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
