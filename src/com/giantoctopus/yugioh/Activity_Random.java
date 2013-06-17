package com.giantoctopus.yugioh;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Random extends Activity {
	
	private Button coin, d6;
	private TextView outcome;
	private Random random = new Random();
	private int counter = 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_random);
   
        this.outcome = (TextView)this.findViewById(R.id.textView1);
        
        this.coin = (Button)this.findViewById(R.id.button1);
        this.coin.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (random.nextInt(2) == 1) { // Heads
					outcome.setText(R.string.heads);
				} else { // Tails
					outcome.setText(R.string.tails);
				}
				if (counter%2 == 0) {
					outcome.setTextColor(Color.WHITE);
				} else { // alternate colors
					outcome.setTextColor(Color.GRAY);
				}
				counter++;
			}
        });
        
        this.d6 = (Button)this.findViewById(R.id.button2);
        this.d6.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				outcome.setText(((Integer)(random.nextInt(6)+1)).toString());
				if (counter%2 == 0) {
					outcome.setTextColor(Color.WHITE);
				} else { // alternate colors
					outcome.setTextColor(Color.GRAY);
				}
				counter++;
			}
        });

    } // end method
    
} // end class