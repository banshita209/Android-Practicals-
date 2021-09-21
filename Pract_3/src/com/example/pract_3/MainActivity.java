package com.example.pract_3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(getApplicationContext(), "OnCreate() Method called", Toast.LENGTH_LONG).show();
    }
    
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	//Toast.makeText(getApplicationContext(), "OnStart() Method called", Toast.LENGTH_LONG).show();
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	//Toast.makeText(getApplicationContext(), "OnResume() Method called", Toast.LENGTH_SHORT).show();
    }
    
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	//Toast.makeText(getApplicationContext(), "OnPause() Method called", Toast.LENGTH_LONG).show();
    }
    
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	super.onRestart();
    	 Toast.makeText(getApplicationContext(), "OnRestart() Method called", Toast.LENGTH_LONG).show();
    }
    
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
     Toast.makeText(getApplicationContext(), "OnStop() Method called", Toast.LENGTH_LONG).show();
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	 Toast.makeText(getApplicationContext(), "OnDestroy() Method called", Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
