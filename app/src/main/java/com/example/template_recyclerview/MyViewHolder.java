package com.example.template_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    private ImageView backgroundImageUrlView;
    private ImageView sharingLogoUrlView;
    private TextView newspaperTitleView;
    private TextView articleShortTextView;
    private TextView articleAuthorView;
    private TextView articleDateView;

    //itemView est la vue correspondante à 1 cellule
    public MyViewHolder(View itemView) {
        super(itemView);

        //c'est ici que l'on fait nos findView

        backgroundImageUrlView = (ImageView) itemView.findViewById(R.id.backgroundImageUrl);
        sharingLogoUrlView = (ImageView) itemView.findViewById(R.id.sharingLogoUrl);
        newspaperTitleView = (TextView) itemView.findViewById(R.id.newspaperTitle);
        articleShortTextView = (TextView) itemView.findViewById(R.id.articleShortText);
        articleAuthorView = (TextView) itemView.findViewById(R.id.articleAuthor);
        articleDateView = (TextView) itemView.findViewById(R.id.articleDate);
    }

    //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
    public void bind(MyObject myObject) {

        Picasso.with(backgroundImageUrlView.getContext()).load(myObject.backgroundImageUrl()).centerCrop().fit().into(backgroundImageUrlView);
        Picasso.with(sharingLogoUrlView.getContext()).load(myObject.sharingLogoUrl()).centerCrop().fit().into(sharingLogoUrlView);
        newspaperTitleView.setText(myObject.getNewspaperTitle());
        articleShortTextView.setText(myObject.getArticleShortText());
        articleAuthorView.setText(myObject.getArticleAuthor());
        articleDateView.setText(myObject.getArticleDate());
    }

    itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new AlertDialog.Builder(itemView.getContext())
                    .setBackgroundImageUrl(String backgroundImageUrl)
                    .setSharingLogoUrl(String sharingLogoUrl)
                    .setNewspaperTitle(String newspaperTitle)
                    .setArticleShortText(String articleShortText)
                    .setArticleAuthor(String articleAuthor)
                    .setArticleDate(String articleDate)
                    .show();
        }
    });
}
