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
        Button Berilio=(Button)view.findViewById(R.id.h35);
        Button Boro=(Button)view.findViewById(R.id.b);
        Button Carbono=(Button)view.findViewById(R.id.c);
        Button Nitrogeno=(Button)view.findViewById(R.id.n);
        Button Oxigeno=(Button)view.findViewById(R.id.o);
        Button Fluor=(Button)view.findViewById(R.id.f);
        Button Neon=(Button)view.findViewById(R.id.ne);
        Button Sodio=(Button)view.findViewById(R.id.h47);
        Button Magnesio=(Button)view.findViewById(R.id.h36);
        Button Aluminio=(Button)view.findViewById(R.id.al);
        Button Silicio=(Button)view.findViewById(R.id.si);
        Button Fosforo=(Button)view.findViewById(R.id.p);
        Button Azufre=(Button)view.findViewById(R.id.s);
        Button Cloro=(Button)view.findViewById(R.id.cl);
        Button Argon=(Button)view.findViewById(R.id.ar);
        Button Potasio=(Button)view.findViewById(R.id.h48);
        Button Calcio=(Button)view.findViewById(R.id.h37);
        Button Escandio=(Button)view.findViewById(R.id.h26);
        Button Titanio=(Button)view.findViewById(R.id.h14);
        Button Vanadio=(Button)view.findViewById(R.id.v);
        Button Cromo=(Button)view.findViewById(R.id.cr);
        Button Manganeso=(Button)view.findViewById(R.id.mn);
        Button Hierro=(Button)view.findViewById(R.id.fe);
        Button Cobalto=(Button)view.findViewById(R.id.co);
        Button Niquel=(Button)view.findViewById(R.id.ni);
        Button Cobre=(Button)view.findViewById(R.id.cu);
        Button Zinc=(Button)view.findViewById(R.id.zn);
        Button Galio=(Button)view.findViewById(R.id.ga);
        Button Germanio=(Button)view.findViewById(R.id.ge);
        Button Arsenico=(Button)view.findViewById(R.id.as);
        Button Selenio=(Button)view.findViewById(R.id.se);
        Button Bromo=(Button)view.findViewById(R.id.br);
        Button Kripton=(Button)view.findViewById(R.id.kr);
        Button Rubidio=(Button)view.findViewById(R.id.h49);
        Button Estroncio=(Button)view.findViewById(R.id.h38);
        Button Itrio=(Button)view.findViewById(R.id.h27);
        Button Circonio=(Button)view.findViewById(R.id.h15);








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
        Berilio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",4);
                startActivity(intent);
            }
        });
        Boro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",5);
                startActivity(intent);
            }
        });
        Carbono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",6);
                startActivity(intent);
            }
        });
        Nitrogeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",7);
                startActivity(intent);
            }
        });
        Oxigeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",8);
                startActivity(intent);
            }
        });
        Fluor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",9);
                startActivity(intent);
            }
        });
        Neon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",10);
                startActivity(intent);
            }
        });
        Sodio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",11);
                startActivity(intent);
            }
        });
        Magnesio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",12);
                startActivity(intent);
            }
        });

        Aluminio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",13);
                startActivity(intent);
            }
        });
        Silicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",14);
                startActivity(intent);
            }
        });
        Fosforo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",15);
                startActivity(intent);
            }
        });
        Azufre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",16);
                startActivity(intent);
            }
        });
        Cloro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",17);
                startActivity(intent);
            }
        });
        Argon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",18);
                startActivity(intent);
            }
        });
        Potasio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",19);
                startActivity(intent);
            }
        });
        Calcio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",20);
                startActivity(intent);
            }
        });
        Escandio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",21);
                startActivity(intent);
            }
        });
        Titanio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",22);
                startActivity(intent);
            }
        });
        Vanadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",23);
                startActivity(intent);
            }
        });
        Cromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",24);
                startActivity(intent);
            }
        });
        Manganeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",25);
                startActivity(intent);
            }
        });
        Hierro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",26);
                startActivity(intent);
            }
        });
        Cobalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",27);
                startActivity(intent);
            }
        });
        Niquel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",28);
                startActivity(intent);
            }
        });
        Cobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",29);
                startActivity(intent);
            }
        });
        Zinc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",30);
                startActivity(intent);
            }
        });
        Galio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",31);
                startActivity(intent);
            }
        });
        Germanio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",32);
                startActivity(intent);
            }
        });
        Arsenico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",33);
                startActivity(intent);
            }
        });
        Selenio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",34);
                startActivity(intent);
            }
        });
        Bromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",35);
                startActivity(intent);
            }
        });
        Kripton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",36);
                startActivity(intent);
            }
        });
        Rubidio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",37);
                startActivity(intent);
            }
        });
        Estroncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",38);
                startActivity(intent);
            }
        });
        Itrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",39);
                startActivity(intent);
            }
        });
        Circonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",40);
                startActivity(intent);
            }
        });
        return view;
    }


    }

