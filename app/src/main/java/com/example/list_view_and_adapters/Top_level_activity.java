package com.example.list_view_and_adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.nio.file.SecureDirectoryStream;
import java.util.ArrayList;

public class Top_level_activity extends AppCompatActivity implements View.OnClickListener {

    private ListView mListView1;
    private ArrayList<String> opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        mListView1 = findViewById(R.id.listaprincipal);

        opciones = new ArrayList<String>();
        opciones.add("Prendas superiores");
        opciones.add("Prendas inferiores");
        opciones.add("Zapatos");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones);

        mListView1.setAdapter(adapter);

        mListView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Top_level_activity.this, "Has pulsado: "+ opciones.get(position), Toast.LENGTH_LONG).show();
                System.out.println("Has pulsado: "+ opciones.get(position));
                if (opciones.get(position).equals("Prendas superiores")){
                    Intent i = new Intent(Top_level_activity.this, Tipo_ropa_activity.class);
                    startActivity(i);
                }
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}