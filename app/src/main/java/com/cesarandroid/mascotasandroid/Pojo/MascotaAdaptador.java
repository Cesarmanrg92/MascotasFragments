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
 * Created by AhskaBay on 16/05/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotasViewHolder> {
    ArrayList<Mascotas> mascotas;


    public MascotaAdaptador(ArrayList<Mascotas> mascotas){
        this.mascotas = mascotas;
    }
    @Override
    public MascotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotasViewHolder(v);






    }

    @Override
    public void onBindViewHolder(MascotasViewHolder mascotasViewHolder, int position) {
        Mascotas mascota = mascotas.get(position);
        mascotasViewHolder.ImgMascota.setImageResource(mascota.getImagen_animal());
        mascotasViewHolder.ImgHueso.setImageResource(mascota.getImagen_hueso());
        mascotasViewHolder.TextNombre.setText(mascota.getNombre());
        mascotasViewHolder.TextLikes.setText(mascota.getNum_like());

    }

    // Cantidad de elementos que contiene mi listas
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder {

        private ImageView ImgMascota;
        private ImageView ImgHueso;
        private ImageButton ImgLike;
        private TextView TextNombre;
        private TextView TextLikes;

        public MascotasViewHolder(final View itemView) {
            super(itemView);

            ImgMascota = (ImageView) itemView.findViewById(R.id.imgFoto);
            ImgHueso = (ImageView) itemView.findViewById(R.id.img_hueso);
            ImgLike = (ImageButton) itemView.findViewById(R.id.IBLike);
            TextNombre = (TextView) itemView.findViewById(R.id.textNombre);
            TextLikes = (TextView) itemView.findViewById(R.id.textViewlikes);


        }


    }

}
