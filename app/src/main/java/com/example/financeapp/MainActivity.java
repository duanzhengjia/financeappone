package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import static com.example.financeapp.HttpUtil.doGet;
import static com.example.financeapp.HttpUtil.urlencode;

public class MainActivity extends AppCompatActivity {


    private static TextView Text_View;
    private static String Response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text_View = findViewById(R.id.Text_View);
        queryData();
    }

    //定义一个Handler来做延时
    @SuppressLint("HandlerLeak")
    public static Handler mLoadDialogHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1001:
                    Text_View.setText(Response);
                    break;
            }

        }
    };


    public static void queryData() {
        new Thread() {
            @Override
            public void run() {
                String response = doGet(Api.API_URL);
                Log.e("result", response);
                Response = response;
                Api.MODEL = null;
                Gson gson = new Gson();
                Api.MODEL = gson.fromJson(response, model.class);
                mLoadDialogHandler.sendEmptyMessageDelayed(1001, 20); //延时
            }
        }.start();
    }
}