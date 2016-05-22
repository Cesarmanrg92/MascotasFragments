package com.cesarandroid.mascotasandroid.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cesarandroid.mascotasandroid.Pojo.MascotaAdaptador;
import com.cesarandroid.mascotasandroid.Pojo.Mascotas;
import com.cesarandroid.mascotasandroid.R;

import java.util.ArrayList;

/**
 * Created by AhskaBay on 21/05/2016.
 */
public class RecyclerViewFragmentLista extends Fragment {

    ArrayList<Mascotas> mascotas;
    private RecyclerView ListaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sevedInstanceState) {

        final View view = inflater.inflate(R.layout.fragmentrrecyclerview, container, false);

        ListaMascotas = (RecyclerView) view.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);
        InicializarListaMascota();
        InicializarAdaptador();


        return view;

    }

    public void InicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        ListaMascotas.setAdapter(adaptador);
    }


    public void InicializarListaMascota(){

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.bulldog,R.drawable.hueso,R.drawable.huesolike,"Toby","1"));
        mascotas.add(new Mascotas(R.drawable.bundo, R.drawable.hueso, R.drawable.huesolike, "Daisy", "10"));
        mascotas.add(new Mascotas(R.drawable.popi, R.drawable.hueso, R.drawable.huesolike, "Popi", "23"));
        mascotas.add(new Mascotas(R.drawable.santa, R.drawable.hueso, R.drawable.huesolike, "Santa", "144"));
        mascotas.add(new Mascotas(R.drawable.tomy, R.drawable.hueso, R.drawable.huesolike, "Tomy", "14"));


    }

}
