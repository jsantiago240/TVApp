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
            {"http://www.amc.com/shows/the-walking-dead","http://www.amc.com/shows/breaking-bad","http://www.amc.com/shows/mad-men"},
            {"https://www.bbc.co.uk/programmes/b006q2x0", "http://www.bbcamerica.com/shows/killing-eve", "http://www.bbcamerica.com/shows/orphan-black"},
            {"http://www.cc.com/shows/the-daily-show-with-trevor-noah", "http://southpark.cc.com/", "http://www.cc.com/shows/tosh"},
    };

    public Url()
    {

    }

    public void generateAddress(int row, int col)
    {
        address = URLS[row][col];
    }

    public String getAddress()
    {
        return address;
    }

}
