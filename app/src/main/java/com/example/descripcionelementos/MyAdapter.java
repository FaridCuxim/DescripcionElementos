package com.example.descripcionelementos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private static LayoutInflater inflater= null;
    Context contexto;
    String[] datos;
    int [] datosImg;

    public MyAdapter(Context conexto, String[] datos, int[]imagenes){
        this.contexto= conexto;
        this.datos=datos;
        this.datosImg=imagenes;
        inflater=(LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public View getView(int i, View convertView, ViewGroup parent){
        final View vista=inflater.inflate(R.layout.list_item,null);
        TextView titulo=(TextView) vista.findViewById(R.id.nom);
        ImageView imagen=(ImageView) vista.findViewById(R.id.imageView);
        titulo.setText(datos[i]);
        imagen.setImageResource(datosImg[i]);

        return vista;
    }


    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
