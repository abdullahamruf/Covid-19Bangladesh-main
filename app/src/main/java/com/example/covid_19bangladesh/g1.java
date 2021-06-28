package com.example.covid_19bangladesh;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class g1 extends FragmentActivity implements
        OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener {

    private GoogleMap mMap;
    private GoogleApiClient googleApiClient;
    private LocationRequest locationRequest;
    private Location lastLocation;
    int i;
    private double latitide;
    private double longitude;


    private Marker currentUserLocationMarker;
    private static final int Request_User_Location_Code = 99;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkUserLocationPermission();
        }


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            buildGoogleApiClient();

            mMap.setMyLocationEnabled(true);
        }


    }


    public boolean checkUserLocationPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, Request_User_Location_Code);
            return false;
        } else {
            return true;
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case Request_User_Location_Code:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                        if (googleApiClient == null) {
                            buildGoogleApiClient();
                        }
                        mMap.setMyLocationEnabled(true);
                    }
                } else {
                    Toast.makeText(this, "Permission Denied...", Toast.LENGTH_SHORT).show();
                }
                return;
        }
    }


    protected synchronized void buildGoogleApiClient() {
        googleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();

        googleApiClient.connect();
    }


    @Override
    public void onLocationChanged(Location location) {
        latitide = location.getLatitude();
        longitude = location.getLongitude();

        lastLocation = location;

        if (currentUserLocationMarker != null) {
            currentUserLocationMarker.remove();
        }

        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("Your Current Location");
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));

        currentUserLocationMarker = mMap.addMarker(markerOptions);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        mMap.animateCamera(CameraUpdateFactory.zoomBy(12));

        if (googleApiClient != null) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, this);
        }
        LatLng sydney = new LatLng(22.993362, 89.820170);
        mMap.addMarker(new MarkerOptions()
                .position(sydney)
                .title("Doctors Quarter Sheksaherakhatun MCH,Gopalgonj"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng kash = new LatLng(23.236771, 89.718876);
        mMap.addMarker(new MarkerOptions()
                .position(kash)
                .title("Kashiani new hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kash));
        LatLng muktijodda = new LatLng(23.319474, 89.872460);
        mMap.addMarker(new MarkerOptions()
                .position(muktijodda)
                .title("Muktijiddhacomplex,moksedpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(muktijodda));
        LatLng sariatpur = new LatLng(23.21174, 90.34845);
        mMap.addMarker(new MarkerOptions()
                .position(sariatpur)
                .title("Sadar Hospital Sariatpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sariatpur));
        LatLng tungipara = new LatLng(22.893981, 89.889685);
        mMap.addMarker(new MarkerOptions()
                .position(tungipara)
                .title("Tungipara UHC new building"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tungipara));
        LatLng faridpur = new LatLng(23.47616, 89.81336);
        mMap.addMarker(new MarkerOptions()
                .position(faridpur)
                .title("Upazilla Sasthocomplex,Salta,Faridpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(faridpur));
        LatLng gazipur = new LatLng(23.76676, 90.36574);
        mMap.addMarker(new MarkerOptions()
                .position(gazipur)
                .title("Ma Oh ShishukollanKendro, Meghdubi ,gazipur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gazipur));
        LatLng tangail = new LatLng(24.26494, 89.92916);
        mMap.addMarker(new MarkerOptions()
                .position(tangail)
                .title("Zilla hospital,traumacentre,tangail"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tangail));
        LatLng nars= new LatLng(23.92984, 90.70290);
        mMap.addMarker(new MarkerOptions()
                .position(nars)
                .title("100 Bed zilla hospital,Narshingdi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nars));
        LatLng madari= new LatLng(23.16550, 90.21209);
        mMap.addMarker(new MarkerOptions()
                .position(madari)
                .title("250 sojja hospital new,madaripur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(madari));

    }



    @Override
    public void onConnected(@Nullable Bundle bundle) {
        locationRequest = new LocationRequest();
        locationRequest.setInterval(1100);
        locationRequest.setFastestInterval(1100);
        locationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, this);
        }


    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }



}


