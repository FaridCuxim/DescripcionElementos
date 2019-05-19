package com.example.descripcionelementos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Descripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        loadFragment(new InfoScrollFragment());
    }

    private void loadFragment(Fragment fragment) {
        //Cargar Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.layoutScroll, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
