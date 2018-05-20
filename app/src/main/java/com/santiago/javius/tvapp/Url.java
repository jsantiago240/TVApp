package com.santiago.javius.tvapp;

/**
 * Created by Javius on 5/20/2018.
 */

public class Url
{
    private String address;

    static final String[][] URLS = new String[][]{
            {"https://www.aetv.com/shows/the-first-48","https://www.aetv.com/shows/duck-dynasty","http://www.aetv.com/shows/storage-wars"},
            {"https://www.adultswim.com/shows/robotchicken","http://www.adultswim.com/videos/family-guy","http://www.adultswim.com/shows/american-dad/index.html"},
            {"http://www.amc.com/shows/the-walking-dead","http://www.amc.com/shows/breaking-bad","http://www.amc.com/shows/mad-men"}};

    public Url()
    {

    }

    public void setLink(String link)
    {
        address = link;
    }

    public String getAddress(int row, int col)
    {
        return URLS[row][col];
    }
}
