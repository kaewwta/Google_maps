package com.example.google_maps;

public class LocationHelper {

    private double Longitude;
    private double Latitude;

    public LocationHelper(double longitude, double latitude) {

    }

    public LocationHelper() {

    }

    public void setLongitude(double longitude, double latitude) {
        Longitude = longitude;
        Latitude  = latitude;

    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }
}
