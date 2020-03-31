package com.example.template_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//4-gestion de l'ensemble du contenu'
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<MyObject> list;
    Context context;

    //ajouter un constructeur prenant en entrée une liste
    public MyAdapter(List<MyObject> list, Context context) {
        this.list = list;
        this.context = context;
    }

    //cette fonction permet de créer les viewHolder
    //et par la même indiquer la vue à inflater (à partir des layout xml)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview, viewGroup, false);
        return new MyViewHolder(view, context);
    }

    //c'est ici que nous allons remplir notre view avec le texte/image de chaque MyObjects
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        MyObject myObject = list.get(position); //recuperation de la liste de view
        myViewHolder.bind(myObject); //envoi au viewholder pour affichage
    }

    @Override
    //gestion du nbre total de cellules contenu ds le recyclerview
    public int getItemCount() {
        return list.size();
    }
}

