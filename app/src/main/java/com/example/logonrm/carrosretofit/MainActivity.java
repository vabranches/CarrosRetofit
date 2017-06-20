package com.example.logonrm.carrosretofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarroAPI carroAPI = APIUtils.getCarroAPIService();

        carroAPI.listarTodos().enqueue(new Callback<List<Carro>>() {
            @Override
            public void onResponse(Call<List<Carro>> call, Response<List<Carro>> response) {
                for (Carro carro : response.body()){
                    Log.i("CARRO: ", carro.getBrand());
                    Log.i("CARRO: ", carro.getModel());
                    Log.i("CARRO: ", carro.getColor());
                }
            }

            @Override
            public void onFailure(Call<List<Carro>> call, Throwable t) {

            }
        });
    }

}
