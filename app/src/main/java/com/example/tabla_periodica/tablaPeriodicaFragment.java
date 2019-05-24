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
        Button Niobio=(Button)view.findViewById(R.id.nb);
        Button Molibdeno=(Button)view.findViewById(R.id.mo);
        Button Tecnecio=(Button)view.findViewById(R.id.tc);
        Button Rutenio=(Button)view.findViewById(R.id.ru);
        Button Rodio=(Button)view.findViewById(R.id.rh);
        Button Paladio=(Button)view.findViewById(R.id.pd);
        Button Plata=(Button)view.findViewById(R.id.ag);
        Button Cadmio=(Button)view.findViewById(R.id.cd);
        Button Indio=(Button)view.findViewById(R.id.in);
        Button Estaño=(Button)view.findViewById(R.id.sn);
        Button Antimonio=(Button)view.findViewById(R.id.sb);
        Button Telurio=(Button)view.findViewById(R.id.te);
        Button Yodo=(Button)view.findViewById(R.id.l);
        Button Xenon=(Button)view.findViewById(R.id.xe);
        Button Cesio=(Button)view.findViewById(R.id.h50);
        Button Bario=(Button)view.findViewById(R.id.h39);
        Button Lantano=(Button)view.findViewById(R.id.la);
        Button Cerio=(Button)view.findViewById(R.id.ce);
        Button Praseodimio=(Button)view.findViewById(R.id.pr);
        Button Neodimio=(Button)view.findViewById(R.id.nd);
        Button Prometio=(Button)view.findViewById(R.id.pm);
        Button Samario=(Button)view.findViewById(R.id.sm);
        Button Europio=(Button)view.findViewById(R.id.eu);
        Button Gadolinio=(Button)view.findViewById(R.id.gd);
        Button Terbio=(Button)view.findViewById(R.id.tb);
        Button Disprocio=(Button)view.findViewById(R.id.dy);
        Button Holmio=(Button)view.findViewById(R.id.ho);
        Button Erbio=(Button)view.findViewById(R.id.er);
        Button Tulio=(Button)view.findViewById(R.id.tm);
        Button Iterbio=(Button)view.findViewById(R.id.yb);
        Button Lutecio=(Button)view.findViewById(R.id.lu);
        Button Hafnio=(Button)view.findViewById(R.id.hf);
        Button Tantalo=(Button)view.findViewById(R.id.ta);
        Button Wolframio=(Button)view.findViewById(R.id.w);
        Button Renio=(Button)view.findViewById(R.id.re);
        Button Osmio=(Button)view.findViewById(R.id.os);
        Button Iridio=(Button)view.findViewById(R.id.ir);
        Button Platino=(Button)view.findViewById(R.id.pt);
        Button Oro=(Button)view.findViewById(R.id.au);
        Button Mercurio=(Button)view.findViewById(R.id.hg);
        Button Talio=(Button)view.findViewById(R.id.ti);
        Button Plomo=(Button)view.findViewById(R.id.pb);
        Button Bismuto=(Button)view.findViewById(R.id.bi);
        Button Polonio=(Button)view.findViewById(R.id.po);
        Button Astato=(Button)view.findViewById(R.id.at);
        Button Radon=(Button)view.findViewById(R.id.rn);
        Button Francio=(Button)view.findViewById(R.id.fr);
        Button Radio=(Button)view.findViewById(R.id.ra);
        Button Actinio=(Button)view.findViewById(R.id.ac);
        Button Torio=(Button)view.findViewById(R.id.th);
        Button Protactinio=(Button)view.findViewById(R.id.pa);
        Button Uranio=(Button)view.findViewById(R.id.u);
        Button Neptunio=(Button)view.findViewById(R.id.np);
        Button Plutonio=(Button)view.findViewById(R.id.pu);
        Button Americio=(Button)view.findViewById(R.id.am);
        Button Curio=(Button)view.findViewById(R.id.cm);
        Button Berkilio=(Button)view.findViewById(R.id.bk);
        Button Californio=(Button)view.findViewById(R.id.cf);
        Button Einstenio=(Button)view.findViewById(R.id.es);
        Button Fermio=(Button)view.findViewById(R.id.fm);
        Button Mendelevio=(Button)view.findViewById(R.id.md);
        Button Nobelio=(Button)view.findViewById(R.id.no);
        Button lawrencio=(Button)view.findViewById(R.id.lr);
        Button Rutherfodio=(Button)view.findViewById(R.id.ru);
        Button Dubnio=(Button)view.findViewById(R.id.db);
        Button Seaborgio=(Button)view.findViewById(R.id.sg);
        Button Bohrio=(Button)view.findViewById(R.id.bh);
        Button Hasio=(Button)view.findViewById(R.id.hs);
        Button Meitnerio=(Button)view.findViewById(R.id.mt);
        Button Darmstatio=(Button)view.findViewById(R.id.ds);
        Button Roentgenio=(Button)view.findViewById(R.id.rg);
        Button Copernicio=(Button)view.findViewById(R.id.cn);
        Button Nihonio=(Button)view.findViewById(R.id.nh);
        Button Fleovio=(Button)view.findViewById(R.id.fl);
        Button Moscovio=(Button)view.findViewById(R.id.mc);
        Button Livermorio=(Button)view.findViewById(R.id.lv);
        Button Teneso=(Button)view.findViewById(R.id.ts);
        Button Oganeson=(Button)view.findViewById(R.id.og);








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
        Niobio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",41);
                startActivity(intent);
            }
        });
        Molibdeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",42);
                startActivity(intent);
            }
        });
        Tecnecio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",43);
                startActivity(intent);
            }
        });
        Rutenio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",44);
                startActivity(intent);
            }
        });
        Rodio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",45);
                startActivity(intent);
            }
        });
        Paladio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",46);
                startActivity(intent);
            }
        });
        Plata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",47);
                startActivity(intent);
            }
        });
        Cadmio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",48);
                startActivity(intent);
            }
        });
        Indio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",49);
                startActivity(intent);
            }
        });
        Estaño.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",50);
                startActivity(intent);
            }
        });
        Antimonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",51);
                startActivity(intent);
            }
        });
        Telurio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",52);
                startActivity(intent);
            }
        });
        Yodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",53);
                startActivity(intent);
            }
        });
        Xenon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",54);
                startActivity(intent);
            }
        });
        Cesio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",55);
                startActivity(intent);
            }
        });
        Bario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",56);
                startActivity(intent);
            }
        });
        Lantano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",57);
                startActivity(intent);
            }
        });
        Cerio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",58);
                startActivity(intent);
            }
        });
        Praseodimio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",59);
                startActivity(intent);
            }
        });
        Neodimio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",60);
                startActivity(intent);
            }
        });
        Prometio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",61);
                startActivity(intent);
            }
        });
        Samario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",62);
                startActivity(intent);
            }
        });
        Europio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",63);
                startActivity(intent);
            }
        });
        Gadolinio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",64);
                startActivity(intent);
            }
        });
        Terbio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",65);
                startActivity(intent);
            }
        });
        Disprocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",66);
                startActivity(intent);
            }
        });
        Holmio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",67);
                startActivity(intent);
            }
        });
        Erbio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",68);
                startActivity(intent);
            }
        });
        Tulio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",69);
                startActivity(intent);
            }
        });
        Iterbio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",70);
                startActivity(intent);
            }
        });
        Lutecio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",71);
                startActivity(intent);
            }
        });
        Hafnio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",72);
                startActivity(intent);
            }
        });
        Tantalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",73);
                startActivity(intent);
            }
        });
        Wolframio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",74);
                startActivity(intent);
            }
        });
        Renio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",75);
                startActivity(intent);
            }
        });
        Osmio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",76);
                startActivity(intent);
            }
        });
        Iridio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",77);
                startActivity(intent);
            }
        });
        Platino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",78);
                startActivity(intent);
            }
        });
        Oro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",79);
                startActivity(intent);
            }
        });
        Mercurio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",80);
                startActivity(intent);
            }
        });
        Talio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",81);
                startActivity(intent);
            }
        });
        Plomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",82);
                startActivity(intent);
            }
        });
        Bismuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",83);
                startActivity(intent);
            }
        });
        Polonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",84);
                startActivity(intent);
            }
        });
        Astato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",85);
                startActivity(intent);
            }
        });
        Radon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",86);
                startActivity(intent);
            }
        });
        Francio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",87);
                startActivity(intent);
            }
        });
        Radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",88);
                startActivity(intent);
            }
        });
        Actinio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",89);
                startActivity(intent);
            }
        });
        Torio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",90);
                startActivity(intent);
            }
        });
        Protactinio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",91);
                startActivity(intent);
            }
        });
        Uranio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",92);
                startActivity(intent);
            }
        });
        Neptunio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",93);
                startActivity(intent);
            }
        });
        Plutonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",94);
                startActivity(intent);
            }
        });
        Americio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",95);
                startActivity(intent);
            }
        });
        Curio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",96);
                startActivity(intent);
            }
        });
        Berkilio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",97);
                startActivity(intent);
            }
        });
        Californio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",98);
                startActivity(intent);
            }
        });
        Einstenio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",99);
                startActivity(intent);
            }
        });
        Fermio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",100);
                startActivity(intent);
            }
        });
        Mendelevio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",101);
                startActivity(intent);
            }
        });
        Nobelio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",102);
                startActivity(intent);
            }
        });
        lawrencio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",103);
                startActivity(intent);
            }
        });
        Rutherfodio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",104);
                startActivity(intent);
            }
        });
        Dubnio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",105);
                startActivity(intent);
            }
        });
        Seaborgio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",106);
                startActivity(intent);
            }
        });
        Bohrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",107);
                startActivity(intent);
            }
        });
        Hasio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",108);
                startActivity(intent);
            }
        });
        Meitnerio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",109);
                startActivity(intent);
            }
        });
        Darmstatio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",110);
                startActivity(intent);
            }
        });
        Roentgenio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",111);
                startActivity(intent);
            }
        });
        Copernicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",112);
                startActivity(intent);
            }
        });
        Nihonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",113);
                startActivity(intent);
            }
        });
        Fleovio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",114);
                startActivity(intent);
            }
        });

        Moscovio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",115);
                startActivity(intent);
            }
        });

        Livermorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",116);
                startActivity(intent);
            }
        });
        Teneso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",117);
                startActivity(intent);
            }
        });
        Oganeson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Vista.class);
                intent.putExtra("Elemento",118);
                startActivity(intent);
            }
        });

        return view;
    }


    }

