package com.example.ghadd.projectfirstapp.model.backend;

public class BackEndFactory {
    private static BackEnd instance = null;

    public static IBackEnd getInstance()
    {
        if(instance == null)
            instance= new BackEnd();
        return instance;
    }
}