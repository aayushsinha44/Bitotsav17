package com.bitmesra.bitotsav.network.details;

import com.bitmesra.bitotsav.database.models.details.ExampleModel;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Batdroid on 7/2/17 for Bitotsav.
 */

public interface DetailsAPI {
    @GET("/events/{id}")
    Observable<ExampleModel> getDayEventDetails(@Path("id") String id);

    @GET("/events/flagship")
    Observable<ExampleModel> getFlagshipEventDetails(@Query("id") int id);
}
