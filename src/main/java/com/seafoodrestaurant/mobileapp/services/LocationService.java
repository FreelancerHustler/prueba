```java
package com.seafoodrestaurant.mobileapp.services;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class LocationService {

    private LocationManager locationManager;
    private LocationListener locationListener;

    public LocationService(Context context) {
        locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                // Handle location change
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {
                // Handle status change
            }

            @Override
            public void onProviderEnabled(String provider) {
                // Handle provider enabled
            }

            @Override
            public void onProviderDisabled(String provider) {
                // Handle provider disabled
            }
        };
    }

    public void startLocationUpdates() {
        try {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public void stopLocationUpdates() {
        locationManager.removeUpdates(locationListener);
    }

    public Location getCurrentLocation() {
        try {
            return locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }
}
```