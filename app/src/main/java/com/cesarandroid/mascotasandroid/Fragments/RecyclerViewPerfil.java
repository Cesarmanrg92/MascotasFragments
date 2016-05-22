package com.cesarandroid.mascotasandroid.Fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cesarandroid.mascotasandroid.Pojo.MascotaAdaptador;
import com.cesarandroid.mascotasandroid.Pojo.Mascotas;
import com.cesarandroid.mascotasandroid.Pojo.PerfilAdaptadpr;
import com.cesarandroid.mascotasandroid.R;

import java.util.ArrayList;

/**
 * Created by AhskaBay on 21/05/2016.
 */
public class RecyclerViewPerfil extends Fragment {

    ArrayList<Mascotas> mascotas;
    private RecyclerView ListaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sevedInstanceState) {

        final View view = inflater.inflate(R.layout.fragmentperfilrecyclerview, container, false);



        ListaMascotas = (RecyclerView) view.findViewById(R.id.rvMascotasperfil);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);
        InicializarListaMascota();
        InicializarAdaptador();


        return view;

        }

    public void InicializarAdaptador(){
        PerfilAdaptadpr adaptador = new PerfilAdaptadpr(mascotas);
        ListaMascotas.setAdapter(adaptador);
    }


    public void InicializarListaMascota(){

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.bundo,R.drawable.huesolike,"Daisy","1"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "11"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "40"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "50"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "20"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "5"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "4"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "7"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "3"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.huesolike, "Daisy", "9"));





    }

    }
