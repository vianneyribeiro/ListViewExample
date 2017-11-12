package com.example.android.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.listaView);
        ArrayList<String> equipe = new ArrayList<String>();
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");
        equipe.add("sdjsaoijdoisadio");


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, equipe);
        lista.setAdapter(adaptador);

    }



}
