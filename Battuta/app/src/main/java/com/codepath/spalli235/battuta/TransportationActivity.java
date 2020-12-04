package com.codepath.spalli235.battuta;

import android.os.Bundle;
import android.util.Log;

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
    AsyncHttpClient client = new AsyncHttpClient();

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
    });





}


}
