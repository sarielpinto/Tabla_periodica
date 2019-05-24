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
    ListViewAdapter adapter;
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
            Elemento_id idElem = new Elemento_id(ids.get(i), quotes.get(i));
           listElem.add(idElem);
            //Toast.makeText(getApplicationContext(), "la ID ES" + ids.get(i),Toast.LENGTH_SHORT).show();
        }



      ListViewAdapter adapter = new ListViewAdapter(this, listElem);
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
                ListViewAdapter adapter = new ListViewAdapter(buscador.this,listElem);
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
                    ListViewAdapter adapter = new ListViewAdapter(buscador.this,listElem);
                    listView.setAdapter(adapter);
                }
                return true;
            }

        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (bandera) {
                    if(lstFound.get(position).equals("Boro")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 5);
                        startActivity(intent);
                    }
                    if(lstFound.get(position).equals("Oxigeno")) {
                        Intent intent = new Intent(getApplicationContext(), Vista.class);
                        intent.putExtra("Elemento", 8);
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

