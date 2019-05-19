package com.example.descripcionelementos.Agrupaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.descripcionelementos.Descripcion;
import com.example.descripcionelementos.MyAdapter;
import com.example.descripcionelementos.R;

public class Metales_alcalineoTerrreos extends AppCompatActivity {
    ListView lista;
    String dato[] = {"Berilio","Magnesio","Calcio","Estroncio","Bario","Radio"};
    int img[] = {R.drawable.berilio,R.drawable.magnesio,R.drawable.calcio,R.drawable.estroncio,R.drawable.bario,R.drawable.radio};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metales_alcalineo_terrreos);
        lista= (ListView) findViewById(R.id.listaMAT);

        lista.setAdapter(new MyAdapter(getApplicationContext(),dato, img));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(getApplicationContext(), Descripcion.class);
                startActivity(visorDetalles);
            }
        });
    }
}
