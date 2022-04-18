package com.somnia.somniaremote;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {

    private final OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button birds = findViewById(R.id.birds);
        Button rain = findViewById(R.id.rain);
        Button car = findViewById(R.id.car);
        Button mute = findViewById(R.id.mute);


        birds.setOnClickListener(view -> {
            Request request = new Request.Builder()
                    .url("http://172.16.0.3:5000/sounds/1")
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    if (response.isSuccessful()) {
                        ResponseBody responseBody = response.body();
                        System.out.println("onResponse: " + responseBody.string());
                    }
                }
            });
        });


        rain.setOnClickListener(view1 -> {

            Request request = new Request.Builder()
                    .url("http://172.16.0.3:5000/sounds/2")
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    if (response.isSuccessful()) {
                        ResponseBody responseBody = response.body();
                        System.out.println("onResponse: " + responseBody.string());
                    }
                }
            });

        });

        car.setOnClickListener(view2 -> {

            Request request = new Request.Builder()
                    .url("http://172.16.0.3:5000/sounds/3")
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    if (response.isSuccessful()) {
                        ResponseBody responseBody = response.body();
                        System.out.println("onResponse: " + responseBody.string());
                    }
                }
            });

        });

        mute.setOnClickListener(view3 -> {

            Request request = new Request.Builder()
                    .url("http://172.16.0.3:5000/sounds/4")
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    if (response.isSuccessful()) {
                        ResponseBody responseBody = response.body();
                        System.out.println("onResponse: " + responseBody.string());
                    }
                }
            });

        });
    }
}
