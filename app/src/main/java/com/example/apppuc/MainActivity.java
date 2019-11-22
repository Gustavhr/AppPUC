package com.example.apppuc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView itau,bradesco,caixa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("AJUDA BANCOS");
        ImageView caixa = (ImageView) findViewById(R.id.imgviewcaixa);
        ImageView itau = (ImageView) findViewById(R.id.imgviewitau);
        ImageView bradesco = (ImageView) findViewById(R.id.imgviewbradesco);

        itau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,YoutubeView.class);
                i.putExtra("id","6V2dXbf9HxM");
                MainActivity.this.startActivity(i);
            }
        });

        bradesco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,YoutubeView.class);
                i.putExtra("id","o55N47Zsosg");
                startActivity(i);
            }
        });
        caixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,YoutubeView.class);
                i.putExtra("id","K6OsLf9xz4c");
                startActivity(i);
            }
        });








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu_help,menu);
       return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.mnhelp:
                Toast.makeText(this, " AJUDA: CLIQUE EM QUALQUER LOGO DOS BANCOS E SERÁ REDIRECIONADO A UM VIDEO EXPLICANDO O FUNCIONAMENTO DO APLICATIVO " +
                        "DO BANCO ESCOLHIDO  "   , Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
