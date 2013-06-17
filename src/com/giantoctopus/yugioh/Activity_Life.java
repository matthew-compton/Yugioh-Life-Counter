package com.giantoctopus.yugioh;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Life extends Activity {
	
	private Button reset, button1, button2, button3, button4, button5, button6, button7, button8,
				   button01, button02, button03, button04, button05, button06, button07, button08;
	private TextView player_life, opponent_life;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_life);
        
        this.player_life = (TextView)this.findViewById(R.id.text_life);
        player_life.setTextColor(Color.GREEN);
        this.opponent_life = (TextView)this.findViewById(R.id.text_opp_life);
        opponent_life.setTextColor(Color.RED);
        
        this.reset = (Button)this.findViewById(R.id.button_reset);
        this.reset.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText("8000");
				opponent_life.setText("8000");
			}
        });
        
        this.button1 = (Button)this.findViewById(R.id.button1);
        this.button1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText(((Integer)(Integer.parseInt((String)player_life.getText())+1000)).toString());
			}
        });
        
        this.button2 = (Button)this.findViewById(R.id.button2);
        this.button2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText(((Integer)(Integer.parseInt((String)player_life.getText())+500)).toString());
			}
        });
        
        this.button3 = (Button)this.findViewById(R.id.button3);
        this.button3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText(((Integer)(Integer.parseInt((String)player_life.getText())+100)).toString());
			}
        });
        
        this.button4 = (Button)this.findViewById(R.id.button4);
        this.button4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText(((Integer)(Integer.parseInt((String)player_life.getText())+50)).toString());
			}
        });
        
        this.button5 = (Button)this.findViewById(R.id.button5);
        this.button5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText(((Integer)(Integer.parseInt((String)player_life.getText())-1000)).toString());
				if (Integer.parseInt((String)player_life.getText()) < 0) {
					player_life.setText("0");
				}
			}
        });
        
        this.button6 = (Button)this.findViewById(R.id.button6);
        this.button6.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText(((Integer)(Integer.parseInt((String)player_life.getText())-500)).toString());
				if (Integer.parseInt((String)player_life.getText()) < 0) {
					player_life.setText("0");
				}
			}
        });
        
        this.button7 = (Button)this.findViewById(R.id.button7);
        this.button7.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText(((Integer)(Integer.parseInt((String)player_life.getText())-100)).toString());
				if (Integer.parseInt((String)player_life.getText()) < 0) {
					player_life.setText("0");
				}
			}
        });
        
        this.button8 = (Button)this.findViewById(R.id.button8);
        this.button8.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				player_life.setText(((Integer)(Integer.parseInt((String)player_life.getText())/2)).toString());
			}
        });
        
        this.button01 = (Button)this.findViewById(R.id.button01);
        this.button01.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				opponent_life.setText(((Integer)(Integer.parseInt((String)opponent_life.getText())+1000)).toString());
			}
        });
        
        this.button02 = (Button)this.findViewById(R.id.button02);
        this.button02.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				opponent_life.setText(((Integer)(Integer.parseInt((String)opponent_life.getText())+500)).toString());
			}
        });
        
        this.button03 = (Button)this.findViewById(R.id.button03);
        this.button03.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				opponent_life.setText(((Integer)(Integer.parseInt((String)opponent_life.getText())+100)).toString());
			}
        });
        
        this.button04 = (Button)this.findViewById(R.id.button04);
        this.button04.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				opponent_life.setText(((Integer)(Integer.parseInt((String)opponent_life.getText())+50)).toString());
			}
        });
        
        this.button05 = (Button)this.findViewById(R.id.button05);
        this.button05.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				opponent_life.setText(((Integer)(Integer.parseInt((String)opponent_life.getText())-1000)).toString());
				if (Integer.parseInt((String)opponent_life.getText()) < 0) {
					opponent_life.setText("0");
				}
			}
        });
        
        this.button06 = (Button)this.findViewById(R.id.button06);
        this.button06.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				opponent_life.setText(((Integer)(Integer.parseInt((String)opponent_life.getText())-500)).toString());
				if (Integer.parseInt((String)opponent_life.getText()) < 0) {
					opponent_life.setText("0");
				}
			}
        });
        
        this.button07 = (Button)this.findViewById(R.id.button07);
        this.button07.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				opponent_life.setText(((Integer)(Integer.parseInt((String)opponent_life.getText())-100)).toString());
				if (Integer.parseInt((String)opponent_life.getText()) < 0) {
					opponent_life.setText("0");
				}
			}
        });
        
        this.button08 = (Button)this.findViewById(R.id.button08);
        this.button08.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				opponent_life.setText(((Integer)(Integer.parseInt((String)opponent_life.getText())/2)).toString());
			}
        });
        
    }
}