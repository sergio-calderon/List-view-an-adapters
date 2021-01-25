package com.example.list_view_and_adapters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Tipo_ropa_activity extends AppCompatActivity {

    private ListView mListView2;
    private ArrayList<String> opciones2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_ropa);


        mListView2 = findViewById(R.id.listaSecundaria);

        opciones2 = new ArrayList<String>();
        opciones2.add("Camisas");
        opciones2.add("Camisetas");
        opciones2.add("Esqueletos");
        opciones2.add("Chaquetas");
        opciones2.add("Sacos");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones2);

        mListView2.setAdapter(adapter);

        mListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Tipo_ropa_activity.this, "Has pulsado: "+ opciones2.get(position), Toast.LENGTH_LONG).show();
                System.out.println("Has pulsado: "+ opciones2.get(position));
                if (opciones2.get(position).equals("Camisetas")){
                    Intent i = new Intent(Tipo_ropa_activity.this, Camisetas_activity.class);
                    startActivity(i);
                }
            }
        });


    }

}

