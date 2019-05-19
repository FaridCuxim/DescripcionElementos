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

public class Metales_alcalinos extends AppCompatActivity {
    ListView lista;
    String dato[] = {"Litio","Sodio","Potasio","Rubidio","Cesio","Francio"};
    int img[] = {R.drawable.litio,R.drawable.sodio,R.drawable.potasio,R.drawable.rubidio,R.drawable.cesio1,R.drawable.francio};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metales_alcalinos);
        lista= (ListView) findViewById(R.id.listaMA);

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
