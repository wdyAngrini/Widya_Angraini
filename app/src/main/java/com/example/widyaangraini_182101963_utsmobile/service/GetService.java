package com.example.widyaangraini_182101963_utsmobile.service;

import com.example.widyaangraini_182101963_utsmobile.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}