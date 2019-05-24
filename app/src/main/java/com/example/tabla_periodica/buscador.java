package com.example.tabla_periodica;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

public class buscador extends AppCompatActivity {
    private SQLiteDatabase database;//Objecto de la clase sqlitedatabase
    private SQLiteOpenHelper openHelper;//objecto de la clase SQLiteOpenHelper
    private static DatabaseAccess instance;
    private Context context=this;
    private ListView listView;
    MaterialSearchView searchView;
    ArrayList<Elemento_id> listElem = new ArrayList<Elemento_id>();
    List<String> lstFound = new ArrayList<String>();
    public boolean bandera = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);
        this.openHelper = new DatabaseOpenHelper(context);//Inicializa el objecto
        this.database = openHelper.getWritableDatabase();//abre la conexion

        this.listView = (ListView) findViewById(R.id.lstView);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        final List<String> quotes = databaseAccess.getElements();
        List<Integer> ids = databaseAccess.getid();
        databaseAccess.close();

        for(int i=0; i < ids.size(); i++) {
            Elemento_id idElem = new Elemento_id(ids.get(i));
           listElem.add(idElem);
            //Toast.makeText(getApplicationContext(), "la ID ES" + ids.get(i),Toast.LENGTH_SHORT).show();
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, quotes);
        this.listView.setAdapter(adapter);
        searchView = (MaterialSearchView)findViewById(R.id.search_view);
        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {
                bandera = false;
                //If closed Search View , lstView will return default
                listView = (ListView)findViewById(R.id.lstView);
                ArrayAdapter adapter = new ArrayAdapter(buscador.this,android.R.layout.simple_list_item_1,quotes);
                listView.setAdapter(adapter);

            }
        });

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText != null && !newText.isEmpty()){
                    bandera = true;
                    lstFound.clear();
                    for(String item:quotes){
                        if(item.contains(newText))
                            lstFound.add(item);
                    }

                    ArrayAdapter adapter = new ArrayAdapter(buscador.this,android.R.layout.simple_list_item_1,lstFound);
                    listView.setAdapter(adapter);
                }
                else{
                    bandera = false;
                    //if search text is null
                    //return default
                    ArrayAdapter adapter = new ArrayAdapter(buscador.this,android.R.layout.simple_list_item_1,quotes);
                    listView.setAdapter(adapter);
                }
                return true;
            }

        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (bandera) {
                    if(lstFound.get(position).equals("Hidrógeno")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 1);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Helio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 2);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Litio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 3);
                        startActivity(intent);

                    }
                    if(lstFound.get(position).equals("Berilio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 4);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Carbono")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 6);
                        startActivity(intent);
                    }



                    if(lstFound.get(position).equals("Boro")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 5);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Nitrógeno")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 7);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Oxígeno")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 8);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Flùor")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 9);
                        startActivity(intent);
                    }

                    if(lstFound.get(position).equals(">Neón")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 10);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Sodio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 11);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Magnesio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 12);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Aluminio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 13);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Silicio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 14);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Fósforo")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 15);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Azufre")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 16);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Cloro")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 17);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Argón")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 18);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Potasio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 19);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Calcion")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 20);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Escandio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 21);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Titanio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 22);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Vanadio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 23);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Cromo")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 24);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Manganeso")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 25);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Hierro")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 26);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Cobalto")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 27);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Níquel")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 28);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Cobre")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 29);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Zinc")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 30);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Galio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 31);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Germanio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 32);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Arsénico")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 33);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Selenio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 34);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Bromo")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 35);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Kriptón")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 36);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Rubidio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 37);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Estroncio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 38);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Itrio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 39);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Zirconio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 40);
                        startActivity(intent);
                    }if(lstFound.get(position).equals("Niobio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 41);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Molibdeno")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 42);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Tecnecio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 43);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Rutenio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 44);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Rodio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 45);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Paladio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 46);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Plata")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 47);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Cadmio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 48);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Indio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 49);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Estaño")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 50);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Antimonio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 51);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Telurio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 52);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Yodo")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 53);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Xenón")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 54);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Cesio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 55);
                        startActivity(intent);
                    }if(lstFound.get(position).equals("Bario")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 56);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Lantano")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 57);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Cerio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 58);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Praseodimio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 59);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Neodimio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 60);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Prometio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 61);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Samario")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 62);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Europio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 63);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Gadolinio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 64);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Terbio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 65);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Disprosio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 66);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Holmio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 67);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Erbio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 68);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Tulio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 69);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Iterbio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 70);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Lutecio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 71);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Hafnio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 72);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Tántalo")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 73);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Wolframio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 74);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Renio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 75);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Osmio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 76);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Iridio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 77);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Platino")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 78);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Oro")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 79);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Mercurio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 80);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Talio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 81);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Plomo")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 82);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Bismuto")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 83);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Polonio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 84);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Ástato")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 85);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Radón")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 86);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Fracnio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 87);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Radio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 88);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Actinio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 89);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Torio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 90);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Pratactinio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 91);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Uranio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 92);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Neptunio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 93);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Plutonio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 94);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Americio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 95);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Curio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 96);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Berkelio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 97);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Californio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 98);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Einstenio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 99);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Fermio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 100);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Mendelevio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 101);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Nobelio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 102);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Lawrencio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 103);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Rutherfordio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 104);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Dubnio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 105);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Seaborgio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 106);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Bohrio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 107);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Hasio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 108);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Meitnerio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 109);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Darmstatio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 110);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Roentgenio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 111);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Copernicio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 112);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Hihonio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 113);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Flerovio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 114);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Moscovio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 115);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Livermorio")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 116);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Teneso")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 117);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Oganesón")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 118);
                        startActivity(intent);
                    }



































                } else {
                    Intent intent = new Intent(getApplicationContext(), Vista.class);
                    intent.putExtra("Elemento",listElem.get(position).getId());
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }
    }

