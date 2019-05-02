package com.example.jstore_android_yelliyulfita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private ArrayList<Supplier> listSupplier = new ArrayList<>();
        private ArrayList<Item> listItem = new ArrayList();
        private HashMap<Supplier,ArrayList<Item>> childMapping = new HashMap<>();

    }

    protected void refreshList(){
        Response.Listener<String> responseListener = new Response.Listener<String>(){
            @Override
            public void onResponse(String response){
                try{
                    JSONArray jsonResponse = new JSONArray(response);
                    for (int i=0;i<jsonResponse.length();i++){
                        JSONObject item = jsonResponse.getJSONObject(i);
                        JSONObject supplier= item.getJSONObject("supplier");
                        JSONObject location = supplier.getJSONObject("location");
                        JSONObject listSupplier = supplier.getJSONObject("listSupplier");
                        JSONObject listItem = item.getJSONObject("listItem");



                    }

                }
            }

        }


        }

    }

