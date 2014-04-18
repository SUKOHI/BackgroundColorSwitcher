package com.sukohi.lib;

import android.view.MotionEvent;
import android.view.View;

public class BackgroundColorSwitcher {

	private View view;
	private int defaultColor, pressedColor;
	
	public BackgroundColorSwitcher(View view, int defaultColor, int pressedColor) {
		
		this.view = view;
		this.defaultColor = defaultColor;
		this.pressedColor = pressedColor;
		
	}
	
	public void auto(MotionEvent event) {
		
        if (MotionEvent.ACTION_DOWN == event.getAction()) {

        	on();
        	
        } else if (MotionEvent.ACTION_UP == event.getAction()) {
            
        	off();
        	
        }
		
	}
	
	public void on() {
		
		view.setBackgroundColor(pressedColor);
		
	}
	
	public void off() {

		view.setBackgroundColor(defaultColor);
		
	}
	
}
/*** Example

	// Member var;

	private BackgroundColorSwitcher switcher;


	// Code;

	LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
	linearLayout.setOnTouchListener(new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			
			switcher.auto(event);	// or on(); off();
			return true;
			
		}
		
	});
	switcher = new BackgroundColorSwitcher(
			linearLayout, 
			Color.RED, 
			Color.BLUE
	);

***/
