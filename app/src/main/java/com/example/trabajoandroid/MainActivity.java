package com.example.trabajoandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLatitud, txtLongitud;
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud = findViewById(R.id.txt_Latitud);
        txtLongitud = findViewById(R.id.txt_Longitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);

        mapFragment.getMapAsync(this);


    }


    @Override//se llama cuando el mapa esta listo
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap; //Se inicializa el obieto mMAp con googleMao
        this.mMap.setOnMapClickListener(this);//Se contigura el maneiador del eventos de alig
        this.mMap.setOnMapLongClickListener(this);
//Se coloca un parcador en una ubicacton especifica y se nueve la camara gace centrarla en esa

        LatLng Chile = new LatLng(-35.675147, -71.542969);
        mMap.addMarker(new MarkerOptions().position(Chile).title("Chilite <3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chile));
    }

        @Override
        public void onMapClick(@NonNull LatLng latLng) {
            txtLatitud.setText("" + latLng.latitude);
            txtLongitud.setText("" + latLng.longitude);
        }

        @Override
        public void onMapLongClick(@NonNull LatLng latLng){
            txtLatitud.setText("" + latLng.latitude);
            txtLongitud.setText("" + latLng.longitude);



    }
}

