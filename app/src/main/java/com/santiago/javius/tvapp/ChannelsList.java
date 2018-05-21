package com.santiago.javius.tvapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Javius on 5/20/2018.
 */

public class ChannelsList extends ListActivity
{
    final private String[] CHANNEL_NAMES = new String[]{"A&E","Adult Swim", "AMC","BBC America", "Comedy Central", "Discovery Channel", "National Geographic"};
    private int selectedChannel;    //the channel selected by the user

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CHANNEL_NAMES)); //shows every channel's name
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        //Stores the selected channel's position in the selectedChannel int, which is then passed to the next activity
        selectedChannel = position;
        Intent intent = new Intent(this, ShowsList.class);
        intent.putExtra("chanNum", selectedChannel);                //Stores selectedChannel as an extra, under "chanNum", to pass the data

        if (intent != null)
        {
            startActivity(intent);
        }
    }
}
