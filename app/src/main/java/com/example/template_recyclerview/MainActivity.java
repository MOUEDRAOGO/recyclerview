package com.example.template_recyclerview;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<MyObject> articles = new ArrayList<>();


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GESTION DU RECYCLERVIEW

        //remplir les informations
        ajouterArticles();

        //1-recuperation de la vue
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewId);

        //2-définit le positionnenement des view, l'agencement des cellules, ici de façon verticale, comme une ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //pour adapter en grille comme une RecyclerView, avec 2 cellules par ligne
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        //3-gestion du contenu puis créer un MyAdapter, lui fournir notre liste de villes.
        //cet adapter servira à remplir notre recyclerview
        recyclerView.setAdapter(new MyAdapter(articles));
        //FIN GESTION DU RECYCLERVIEW

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    private void ajouterArticles () {
        articles.add(new MyObject("France", "http://www.telegraph.co.uk/travel/destination/article130148.ece/ALTERNATES/w620/parisguidetower.jpg", "titre1",
                "short text article", "auteur", "date"));

    }


    /********* GESTION BOUTONS MENU ***************************/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //ajoute les entrées de menu à l'ActionBar
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    private void share() {
        Toast.makeText(this, R.string.action_share, Toast.LENGTH_LONG).show();
    }

    //gère le click sur une action de l'ActionBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_share:
                share();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    /********* FIN  GESTION BOUTONS MENU ***************************/
}
