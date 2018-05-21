package com.santiago.javius.tvapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowsList extends ListActivity
{
    private int myChanNum;                          //the channel who's shows will be displayed, passed from the previous activity
    private Show[] myShows = new Show[3];           //The three shows played by the selected channel
    private String[] myShowNames = new String[3];   //the names of the three shows being hosted by the selected channel

    //A Two-Dimensional array which stores 3 shows for for each channel (7 channels, 3 shows each)
    private final String[][] TV_SHOWS = new String[][]{{"The First 48","Duck Dynasty","Storage Wars"},
            {"Robot Chicken", "Family Guy", "American Dad"},
            {"The Walking Dead", "Breaking Bad", "Mad Men"},
            {"Doctor Who", "Killing Eve", "Orphan Black"},
            {"The Daily Show", "South Park", "Tosh.0"},
            {"Naked and Afraid", "Deadliest Catch", "How It's Made"},
            {"Genius", "Mars", "Wicked Tuna"}};

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();    //data passed from previous activity
        if (extras != null)
        {
            myChanNum = extras.getInt("chanNum");
        }

        setMyShows();       //determines which shows to display in the list
        setMyShowNames();   //determines the names of those shows

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myShowNames));   //displays the three show names
    }

    public void setMyShows()
    {
        for (int i = 0; i<3; i++)
        {
            myShows[i] = new Show(TV_SHOWS[myChanNum][i], myChanNum, i);    //Initializes each show in the array as a
                                                                            //new show(pass the show's name, the channel
                                                                            //it is hosted by, and the position relative to
                                                                            //the other 2 shows being displayed in the list activity
        }
    }

    public void setMyShowNames()
    {
        //sets show names
        for (int i = 0; i<3; i++)
        {
            myShowNames[i] = myShows[i].getName();
        }
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        //Opens Url of the selected show, by getting that shows Url, and then getting that url's address as a string
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(myShows[position].getURL().getAddress()));

        if (intent != null)
        {
            startActivity(intent);
        }
    }
}
