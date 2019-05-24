package com.example.tabla_periodica;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton busqueda;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        BottomNavigationView navigation=(BottomNavigationView)findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        CoordinatorLayout.LayoutParams layoutParams=(CoordinatorLayout.LayoutParams)navigation.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationBehavior());
        //se agrega el load
        toolbar.setTitle("Tabla Periodica");
        loadFragment(new tablaPeriodicaFragment() );

        busqueda=(FloatingActionButton)findViewById(R.id.fab);

     busqueda.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(getApplicationContext(),buscador.class);
             startActivity(intent);
         }
     });
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.info:
                    //mTextMessage.setText(R.string.title_informacion);
                    toolbar.setTitle("Informacion");
                    fragment= new infoFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.tabla:
                    //mTextMessage.setText(R.string.title_tabla);
                    toolbar.setTitle("Tabla Periodica");
                    fragment = new tablaPeriodicaFragment();
                    loadFragment(fragment);
                    return true;

                case R.id.elementos:
                    //mTextMessage.setText(R.string.title_elementos);
                    toolbar.setTitle("Elementos");
                    fragment= new ElementosFragment();
                    loadFragment(fragment);
                    return true;

            }
            return false;
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode==KeyEvent.KEYCODE_BACK)){
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){

        }
        super.onWindowFocusChanged(hasFocus);
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}
