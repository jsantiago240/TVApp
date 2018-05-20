package com.santiago.javius.tvapp;

/**
 * Created by Javius on 5/20/2018.
 */

public class Show
{
    private Url myURL;
    private String myName;

    public Show()
    {

    }
    public Show(String name)
    {
        myName = name;
    }


    public void setName(String name)
    {
        myName = name;
    }
    public void setURL(String url)
    {
        myURL.setLink(url);
    }

}
