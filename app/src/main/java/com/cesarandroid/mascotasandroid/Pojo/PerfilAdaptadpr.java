package com.cesarandroid.mascotasandroid.Pojo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.cesarandroid.mascotasandroid.R;

import java.util.ArrayList;

/**
 * Created by AhskaBay on 21/05/2016.
 */
public class PerfilAdaptadpr extends RecyclerView.Adapter<PerfilAdaptadpr.MascotasViewHolder> {
    ArrayList<Mascotas> mascotas;


    public PerfilAdaptadpr(ArrayList<Mascotas> mascotas){
        this.mascotas = mascotas;
    }
    @Override
    public MascotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewperfil, parent, false);
        return new MascotasViewHolder(v);






    }

    @Override
    public void onBindViewHolder(MascotasViewHolder mascotasViewHolder, int position) {
        Mascotas mascota = mascotas.get(position);
        mascotasViewHolder.ImgMascota.setImageResource(mascota.getImagen_animal());
        mascotasViewHolder.TextNombre.setText(mascota.getNombre());
        mascotasViewHolder.ImgHueso.setImageResource(mascota.getImagen_like());
        mascotasViewHolder.Gridlikes.setText(mascota.getNum_like());

    }

    // Cantidad de elementos que contiene mi listas
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder {

        private ImageView ImgMascota;
        private TextView TextNombre;
        private ImageView GImageMascota;
        private TextView Gridlikes;
        private ImageView ImgHueso;




        public MascotasViewHolder(final View itemView) {
            super(itemView);

            ImgMascota = (ImageView) itemView.findViewById(R.id.imgFoto);
            TextNombre = (TextView) itemView.findViewById(R.id.TextNombre);
            GImageMascota = (ImageView) itemView.findViewById(R.id.ImgGaleria);
            Gridlikes = (TextView) itemView.findViewById(R.id.TextNombres);
            ImgHueso = (ImageView) itemView.findViewById(R.id.huesolike);



        }


    }
}
