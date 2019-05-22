package com.example.tabla_periodica;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

public class Vista extends AppCompatActivity {
    private SQLiteDatabase database;//Objecto de la clase sqlitedatabase
    private SQLiteOpenHelper openHelper;//objecto de la clase SQLiteOpenHelper
    private static DatabaseAccess instance;
    private Context context=this;//crea el contexto necesario para abrir la base de datos


    private ImageView img;
    private TextView nom,año,des,elec,pro,neu,desi,vale,peri,gru,blo,ce,Ra,pf,pe,F,U;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);
        getSupportActionBar().hide();
        Toolbar toolbar =(Toolbar)findViewById(R.id.Nombre_elemento);

        // Declarar todos lo que este en el layout
        img=(ImageView)findViewById(R.id.imge);
        nom=(TextView) findViewById(R.id.nombre);
        año=(TextView)findViewById(R.id.Año_descubridor);
        des=(TextView)findViewById(R.id.Descubridor);
        elec=(TextView)findViewById(R.id.Electrones);
        pro=(TextView)findViewById(R.id.Protones);
        neu=(TextView)findViewById(R.id.Neutrones);
        desi=(TextView)findViewById(R.id.Densidad);
        vale=(TextView)findViewById(R.id.Valencia);
        peri=(TextView)findViewById(R.id.Periodo);
        gru=(TextView)findViewById(R.id.Grupo);
        blo=(TextView)findViewById(R.id.Bloque);
        ce=(TextView)findViewById(R.id.Configuracion_electronica);
        Ra=(TextView)findViewById(R.id.Radio_atomico);
        pf=(TextView)findViewById(R.id.Punto_de_fusion);
        pe=(TextView)findViewById(R.id.Punto_de_ebullicion);
        F=(TextView)findViewById(R.id.Fase);
        U=(TextView)findViewById(R.id.Usos);

        this.openHelper = new DatabaseOpenHelper(context);//Inicializa el objecto
        this.database = openHelper.getWritableDatabase();//abre la conexion
         //trae el valor que se le da
        Intent algo = getIntent();
        Bundle idelemntos = getIntent().getExtras();
        int idele = idelemntos.getInt("Elemento");

        //La consulta de base de la base
        Cursor cursor = database.rawQuery("SELECT *FROM Elementos WHERE idelementos="+idele, null);
        cursor.moveToFirst();

//Muestra la imagen
        String imagenElemento = cursor.getString(cursor.getColumnIndex("Imagen"));//Agarra de la columana imagen
        Glide
                .with(context)
                .asBitmap()
                .load(Uri.parse("file:///android_asset/Elementos/"+imagenElemento))
                //.error(R.drawable.ic_account_circle)
                .fitCenter()
                .into(new BitmapImageViewTarget(img) {
                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable drawable
                                = RoundedBitmapDrawableFactory.create(context.getResources(), resource);

                        img.setImageDrawable(drawable);
                    }
                });



        //El idelemnto
        nom.setText(cursor.getString(0));//Text View
        //Nombre
       toolbar.setTitle(cursor.getString(1));

        //aÑo descubridor
        año.setText(cursor.getString(2));
        //descubridor
        des.setText(cursor.getString(4));
        //Electrones
        elec.setText(cursor.getString(5));
        //Protones
        pro.setText(cursor.getString(6));
        //Neutrones
        neu.setText(cursor.getString(7));
        //Densidad
        desi.setText(cursor.getString(8));
        //Valencia
        vale.setText(cursor.getString(9));
        //Periodo
        peri.setText(cursor.getString(10));
        //Grupo
        gru.setText(cursor.getString(11));
        //Bloque
        blo.setText(cursor.getString(12));
        //Configuracion_electronica
        ce.setText(cursor.getString(13));
        //Radio_atomico
        Ra.setText(cursor.getString(14));
        //Punto fusion
        pf.setText(cursor.getString(15));
        //Punto_de_ebullicion
        pe.setText(cursor.getString(16));
        //Fase
        F.setText(cursor.getString(17));
        //Usos
        U.setText(cursor.getString(18));
        //NOmbre de elemento en toolbar

    }
}
