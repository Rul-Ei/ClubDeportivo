package com.example.clubdeportivo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LogisticaActivity extends AppCompatActivity {

   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.logistica);

      Button btnStock = findViewById(R.id.btnStock);
      btnStock.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Intent intent = new Intent(LogisticaActivity.this, StockActivity.class);
            startActivity(intent);
         }
      });

      Button btnAgre = findViewById(R.id.btnAgregar);
      btnAgre.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Intent intent = new Intent(LogisticaActivity.this, AgregarActivity.class);
            startActivity(intent);
         }
      });

      Button btnbaj = findViewById(R.id.btnBaja);
      btnbaj.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Intent intent = new Intent(LogisticaActivity.this, BajaActivity.class);
            startActivity(intent);
         }
      });


   }
}