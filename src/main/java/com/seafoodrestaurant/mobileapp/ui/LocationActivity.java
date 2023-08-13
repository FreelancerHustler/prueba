```java
package com.seafoodrestaurant.mobileapp.ui;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.seafoodrestaurant.mobileapp.R;
import com.seafoodrestaurant.mobileapp.model.Location;
import com.seafoodrestaurant.mobileapp.services.LocationService;

public class LocationActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LocationService locationService;
    private TextView locationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        locationService = new LocationService();
        locationText = findViewById(R.id.locationText);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.locationMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Location location = locationService.getRestaurantLocation();
        LatLng restaurantLocation = new LatLng(location.getLatitude(), location.getLongitude());

        mMap.addMarker(new MarkerOptions().position(restaurantLocation).title("Restaurant Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(restaurantLocation, 15));

        locationText.setText(location.getAddress());
    }
}
```