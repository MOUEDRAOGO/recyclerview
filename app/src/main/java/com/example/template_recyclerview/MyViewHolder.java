package com.example.template_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private View itemViewVariable;


    private ImageView backgroundImageUrlView;
    private ImageView sharingLogoUrlView;
    private TextView newspaperTitleView;
    private TextView articleShortTextView;
    private TextView articleAuthorView;
    private TextView articleDateView;
    private Context context;

    //itemView est la vue correspondante à 1 cellule
    public MyViewHolder(final View itemView, Context context) {
        super(itemView);

        itemViewVariable = itemView;
        this.context = context;



        //c'est ici que l'on fait nos findView

        backgroundImageUrlView = (ImageView) itemView.findViewById(R.id.backgroundImageUrl);
        sharingLogoUrlView = (ImageView) itemView.findViewById(R.id.sharingLogoUrl);
        newspaperTitleView = (TextView) itemView.findViewById(R.id.newspaperTitle);
        articleShortTextView = (TextView) itemView.findViewById(R.id.articleShortText);
        articleAuthorView = (TextView) itemView.findViewById(R.id.articleAuthor);
        articleDateView = (TextView) itemView.findViewById(R.id.articleDate);
    }

    //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
    public void bind(final MyObject myObject) {

        Picasso.get().load(myObject.getBackgroundImageUrl()).centerCrop().fit().into(backgroundImageUrlView);
        Picasso.get().load(myObject.getSharingLogoUrl()).centerCrop().fit().into(sharingLogoUrlView);
        newspaperTitleView.setText(myObject.getNewspaperTitle());
        articleShortTextView.setText(myObject.getArticleShortText());
        articleAuthorView.setText(myObject.getArticleAuthor());
        articleDateView.setText(myObject.getArticleDate());

        itemViewVariable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //pour afficher une boite de dialog
                //new AlertDialog.Builder(itemViewVariable.getContext())
                        //.setTitle("pop")
                        //.show();
                //MyObject myObject = new MyObject();

                Intent intent = new Intent(context, page2.class); //donnees de destination
                //intent.putExtra("page2", page2);
                intent.putExtra(page2.MY_OBJECT_ARTICLES, myObject); //donnees a passer
                        //comment passer d une vue a une autre pour passer les donnees getIntent
                context.startActivity(intent);// demarrage de l'activité suivante

            }
        });
    }




}
