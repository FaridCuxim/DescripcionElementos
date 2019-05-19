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

public class NoMetalesActivity extends AppCompatActivity {

    ListView lista;
    String dato[] = {"Carbono","Nitrogeno","Oxigeno","Fosforo","Azufre","Selenio"};
    int img[] = {R.drawable.carbono,R.drawable.nitrogeno,R.drawable.oxigeno,R.drawable.fosforo,R.drawable.azufre,R.drawable.selenio};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_metales);

        lista= (ListView) findViewById(R.id.listaNM);

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
