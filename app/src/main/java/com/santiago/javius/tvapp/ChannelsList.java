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
    private Channel[] channels = new Channel[channelNames.length];
    static private String[] channelNames = new String[]{"A&E","Adult Swim", "AMC","BBC America", "Comedy Central", "Discovery Channel", "National Geographic"};
    int selectedChannel;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setDefaultChannels();
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, channelNames));
    }

    public void setDefaultChannels()
    {
        for (int i = 0; i<channels.length;i++)
        {
            channels[i] = new Channel(channelNames[i]);
        }
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        Intent intent = null;

        selectedChannel = position;
        intent = new Intent(this, ShowsList.class);
        intent.putExtra("chanNum", selectedChannel);

        if (intent != null)
        {
            startActivity(intent);
        }
    }
}
