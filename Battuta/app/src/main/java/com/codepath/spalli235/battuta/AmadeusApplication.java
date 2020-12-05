package com.codepath.spalli235.battuta;

import android.os.Build;

import com.amadeus.Amadeus;
import com.amadeus.Params;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.Location;

//import com.project.app.BuildConfig

public class AmadeusApplication {

    public static void main(String[] args) throws ResponseException {
        Amadeus amadeus = Amadeus
                .builder(BuildConfig.AMADEUS_TRANSPORTATION_KEY, BuildConfig.AMADEUS_TRANSPORTATION_SECRET)
                .build();

        Location[] locations = amadeus.referenceData.locations.get(Params
                .with("keyword", "LON")
                .and("subType", Locations.ANY));

        System.out.println(locations);

    }
}