package com.example.pinly;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button mainB2 = (Button) findViewById(R.id.outfit);
        mainB2.setOnClickListener(this);
        
        Button mainB1 = (Button) findViewById(R.id.add);
        mainB1.setOnClickListener(this);
                
        Button mainB3 = (Button) findViewById(R.id.remove);
        mainB3.setOnClickListener(this);
        
        Button mainB4 = (Button) findViewById(R.id.about);
        mainB4.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.add:
			Intent i1 = new Intent(v.getContext(), addOptions.class);
			startActivityForResult(i1, 0);
			break;
		case R.id.outfit:
			Intent i2 = new Intent(v.getContext(), outfits.class);
			startActivityForResult(i2, 0);
			break;
		case R.id.remove:
			Intent i3 = new Intent(v.getContext(), removeOptions.class);
			startActivityForResult(i3, 0);
			break;
		case R.id.about:
			Intent i4 = new Intent(v.getContext(), about.class);
			startActivityForResult(i4, 0);
			break;
		}
	}
    
}
