package com.example.ghadd.projectfirstapp.controller;

import android.location.Address;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ghadd.projectfirstapp.R;
import com.example.ghadd.projectfirstapp.model.backend.BackEndFactory;
import com.example.ghadd.projectfirstapp.model.backend.IBackEnd;
import com.example.ghadd.projectfirstapp.model.entities.Ride;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}