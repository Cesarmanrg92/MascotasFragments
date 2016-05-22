package com.cesarandroid.mascotasandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.cesarandroid.mascotasandroid.Pojo.MascotaAdaptador;
import com.cesarandroid.mascotasandroid.Pojo.Mascotas;

import java.util.ArrayList;

public class MascotasFavoritasActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView MascotasFavoritas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MascotasFavoritas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        MascotasFavoritas.setLayoutManager(llm);
        InicializarListaMascota();
        InicializarAdaptador();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    public void InicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        MascotasFavoritas.setAdapter(adaptador);
    }


    public void InicializarListaMascota(){

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.timi,R.drawable.hueso,R.drawable.huesolike,"Timi","1"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.hueso, R.drawable.huesolike, "Bundo", "10"));
        mascotas.add(new Mascotas(R.drawable.bulldog, R.drawable.hueso, R.drawable.huesolike, "Horus", "23"));
        mascotas.add(new Mascotas(R.drawable.santa, R.drawable.hueso, R.drawable.huesolike, "Santa", "144"));
        mascotas.add(new Mascotas(R.drawable.tomy, R.drawable.hueso, R.drawable.huesolike, "Tomy", "14"));
    }



}
