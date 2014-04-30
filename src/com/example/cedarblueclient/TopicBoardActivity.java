package com.example.cedarblueclient;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class TopicBoardActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // TODO find out which topic was chosen, display 10 most recent messages
	    //		of that topic
	    Bundle nameHashMap = this.getIntent().getExtras();
        String topicString = nameHashMap.getString("topicString");
	    Toast.makeText(getApplicationContext(), "Topic: " + topicString , 
				   Toast.LENGTH_LONG).show();
	}

}
