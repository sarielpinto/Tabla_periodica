package com.example.tabla_periodica;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class  tablaPeriodicaFragment extends Fragment {

    public tablaPeriodicaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tabla_periodica, container, false);

        Button btnLanzarActivity = (Button) view.findViewById(R.id.h45);
        Button helio=(Button)view.findViewById(R.id.he);
        Button litio=(Button)view.findViewById(R.id.h46);

        btnLanzarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",1);
                startActivity(intent);
            }
        });
        helio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",2);
                startActivity(intent);
            }
        });
        litio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",3);
                startActivity(intent);
            }
        });

        return view;
    }


    }

