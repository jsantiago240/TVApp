package com.santiago.javius.tvapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by Javius on 5/20/2018.
 */

public class ShowsList extends ListActivity
{
    private int myChanNum;
    private Show[] myShows = new Show[3];
    private String[] myShowNames = new String[3];

    final String[][] tvShows = new String[][]{{"The First 48","Duck Dynasty","Storage Wars"},
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

        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            myChanNum = extras.getInt("chanNum");
        }
        setMyShows();
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myShowNames));
    }

    public void setMyShows()
    {
        for (int i = 0; i<3; i++)
        {
            myShows[i] = new Show(tvShows[myChanNum][i]);
        }
        setMyShowNames();
    }

    public void setMyShowNames()
    {
        for (int i = 0; i<3; i++)
        {
            myShowNames[i] = tvShows[myChanNum][i];
        }
    }
}
