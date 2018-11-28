package com.example.ghadd.projectfirstapp.model.entities;


import android.location.Location;
import java.util.Date;

public class Ride {

    public enum Status {
        available,
        handled,
        done
    }

    public Status getStatus() {
        return status;
    }
    //public Location getSource() {
      //  return Source;
    //}
    //public Location getDestination() {
      //  return Destination;
    //}
    public Date getStartingTime() {
        return StartingTime;
    }
    public Date getEndingTime() {
        return EndingTime;
    }
    public String getClientName() {
        return ClientName;
    }
    public String getClientPhoneNumber() {
        return ClientPhoneNumber;
    }
    public String getClientEMail() {
        return ClientEMail;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    //public void setSource(Location source) {
      //  Source = source;
    //}
    //public void setDestination(Location destination) {
      //  Destination = destination;
    //}
    public void setStartingTime(Date startingTime) {
        StartingTime = startingTime;
    }
    public void setEndingTime(Date endingTime) {
        EndingTime = endingTime;
    }
    public void setClientName(String clientName) {
        ClientName = clientName;
    }
    public void setClientPhoneNumber(String clientPhoneNumber) {
        ClientPhoneNumber = clientPhoneNumber;
    }
    public void setClientEMail(String clientEMail) {
        ClientEMail = clientEMail;
    }

    private Status status;
    //private Location Source;
    //private Location Destination;
    private Date StartingTime;
    private Date EndingTime;
    private String ClientName;
    private String ClientPhoneNumber;
    private String ClientEMail;

    public Ride()
    {
        ClientName="gavriel";
    }
    public Ride(Status status, Location source, Location destination, Date startingTime, Date endingTime, String clientName, String clientPhoneNumber, String clientEMail) {
        this.status = status;
        //Source = source;
        //Destination = destination;
        StartingTime = startingTime;
        EndingTime = endingTime;
        ClientName = clientName;
        ClientPhoneNumber = clientPhoneNumber;
        ClientEMail = clientEMail;
    }
}
