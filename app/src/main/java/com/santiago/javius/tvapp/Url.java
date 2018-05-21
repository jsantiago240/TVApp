package com.santiago.javius.tvapp;

/**
 * Created by Javius on 5/20/2018.
 */

public class Url
{
    private String address; //The urls address, stored as a string

    //2D Array of each shows URL, organized by channel.
    //For example, Channel 2 ("AMC")'s 0th show would be "The Walking Dead", so URLS[2][0] would store the show's URL
    private static final String[][] URLS = new String[][]{
            {"https://www.aetv.com/shows/the-first-48","https://www.aetv.com/shows/duck-dynasty","http://www.aetv.com/shows/storage-wars"},
            {"https://www.adultswim.com/shows/robotchicken","http://www.adultswim.com/videos/family-guy","http://www.adultswim.com/shows/american-dad/index.html"},
            {"http://www.amc.com/shows/the-walking-dead","http://www.amc.com/shows/breaking-bad","http://www.amc.com/shows/mad-men"},
            {"https://www.bbc.co.uk/programmes/b006q2x0", "http://www.bbcamerica.com/shows/killing-eve", "http://www.bbcamerica.com/shows/orphan-black"},
            {"http://www.cc.com/shows/the-daily-show-with-trevor-noah", "http://southpark.cc.com/", "http://www.cc.com/shows/tosh"},
            {"https://www.discovery.com/tv-shows/naked-and-afraid/", "https://www.discovery.com/tv-shows/deadliest-catch/", "https://www.sciencechannel.com/tv-shows/how-its-made/"},
            {"http://channel.nationalgeographic.com/genius/", "http://channel.nationalgeographic.com/mars/", "http://channel.nationalgeographic.com/wicked-tuna/"}};

    //Constructor
    public Url(int row, int col)
    {
        //Generated the URLs address upon its initialization
        generateAddress(row, col);
    }

    public void generateAddress(int row, int col)
    {
        //this URLs adress is determined by its channel and show
        address = URLS[row][col];
    }

    //Accessor method
    public String getAddress()
    {
        return address;
    }

}
