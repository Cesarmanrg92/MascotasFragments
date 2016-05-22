package com.cesarandroid.mascotasandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.cesarandroid.mascotasandroid.Fragments.PageAdapter;
import com.cesarandroid.mascotasandroid.Fragments.RecyclerViewFragmentLista;
import com.cesarandroid.mascotasandroid.Fragments.RecyclerViewPerfil;

import java.util.ArrayList;

public class ListaMascotaActivity extends AppCompatActivity {



    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascota);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.TabLayout);
        viewPager = (ViewPager) findViewById(R.id.ViewPager);
        inicializardatos();

        if (toolbar != null){

            setSupportActionBar(toolbar);
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista_mascota, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.accion_contacto:

                Intent cont = new Intent(ListaMascotaActivity.this, ContactoActivity.class);
                startActivity(cont);
                break;
            case R.id.accion_acerca:
                Intent acer = new Intent(ListaMascotaActivity.this, AcercaActivity.class);
                startActivity(acer);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Fragment> agregarfragments(){

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewFragmentLista());
        fragments.add(new RecyclerViewPerfil()  );

        return fragments;
    }

    private void inicializardatos(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarfragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_doghouse);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_dog);
    }

}
