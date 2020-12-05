package com.codepath.spalli235.battuta.models;

import org.json.JSONException;
import org.json.JSONObject;

public class FlightList {

    String locationName;
    String companyName;
    String flightCost;
    String transportationMethod= "Plane";

    public FlightList(JSONObject jsonObject) throws JSONException {
            locationName = jsonObject.getString("");
            companyName = jsonObject.getString("");
            flightCost = jsonObject.getString("");

    }


}
