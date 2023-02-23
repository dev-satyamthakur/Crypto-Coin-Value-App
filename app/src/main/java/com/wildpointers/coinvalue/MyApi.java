package com.wildpointers.coinvalue;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {
    @GET("coins/markets?vs_currency=usd")
    Call<List<Model>> getmodels();
}
