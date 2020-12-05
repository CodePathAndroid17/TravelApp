package com.codepath.spalli235.battuta;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.codepath.asynchttpclient.AsyncHttpClient;
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Headers;

public class TransportationActivity extends AppCompatActivity {

public static final String TRANSPORTATION_API_URL = "test.api.amadeus.com";
  public static final String TAG = "Transportation Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_transport);

    ImageButton leftBtn4;
     Button nextBtn4;


    leftBtn4 = findViewById(R.id.leftBtn4);
    nextBtn4 = findViewById(R.id.nextBtn4);

    nextBtn4.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            goLodgingActivity();
        }
    });
    leftBtn4.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            goDestinationActivity();
        }
    });

   /* AsyncHttpClient client = new AsyncHttpClient();

    client.get(TRANSPORTATION_API_URL, new JsonHttpResponseHandler() {
        @Override
        public void onSuccess(int i, Headers headers, JSON json) {
            Log.d(TAG, "onSuccess");
            JSONObject jsonObject = json.jsonObject;
            try {
                JSONArray results = jsonObject.getJSONArray("results");
                Log.i(TAG, "Results:" + results.toString());



            } catch (JSONException e) {
                Log.e(TAG, "Json Exception", e);

                e.printStackTrace();
            }
        }

        @Override
        public void onFailure(int i, Headers headers, String s, Throwable throwable) {
            Log.d(TAG, "onFailure");

        }
    });*/


}
    private void goDestinationActivity() {
    Intent i = new Intent(this, DestinationActivity.class);
    startActivity(i);
    finish();
}
    private void goLodgingActivity() {
    Intent i = new Intent(this, LodgingActivity.class);
    startActivity(i);
    finish();
}






}

