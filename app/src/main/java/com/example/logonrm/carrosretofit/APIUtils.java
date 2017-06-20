package com.example.logonrm.carrosretofit;

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "http://10.3.1.31:3000";

    public static CarroAPI getCarroAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(CarroAPI.class);
    }
}
