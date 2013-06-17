package com.giantoctopus.yugioh;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

public class Main extends TabActivity{
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources();
		TabHost host = getTabHost();
		
        host.addTab(host.newTabSpec("life")
        		.setIndicator("Life Points", res.getDrawable(R.drawable.tab_life))
        		.setContent(new Intent(this, Activity_Life.class)));
        
        host.addTab(host.newTabSpec("random")
        		.setIndicator("Coin, Dice, Etc.", res.getDrawable(R.drawable.tab_random))
        		.setContent(new Intent(this, Activity_Random.class)));
        
        host.setCurrentTab(0);
        host.setBackgroundColor(Color.BLACK);
        host.getTabWidget().setBackgroundColor(Color.BLACK);
	}
	
}
