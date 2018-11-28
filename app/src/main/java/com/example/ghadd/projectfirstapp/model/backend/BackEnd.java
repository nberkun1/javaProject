package com.example.ghadd.projectfirstapp.model.backend;

import com.example.ghadd.projectfirstapp.model.entities.Ride;

import com.example.ghadd.projectfirstapp.model.backend.IBackEnd;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BackEnd implements IBackEnd {
    @Override
    public void AddNewRide(Ride ride) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Rides");

        myRef.setValue(ride);
    }
}