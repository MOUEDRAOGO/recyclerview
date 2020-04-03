

package com.example.template_recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page2 extends AppCompatActivity  {

    public static final String MY_OBJECT_ARTICLES = "myObjectArticles";
    private MyObject selectedObject;
    private TextView page2TitleView;
    private ImageView page2ImageView;
    private TextView Page2TextContentView;
    private TextView page2AuthorView;
    private TextView page2dateView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        //selectedMyObject = getActivity().getIntent().getParcelableExtra(MYOBJECT); // Parcelable
        selectedObject = getIntent().getParcelableExtra(MY_OBJECT_ARTICLES); // Parcelable ; getintent = recuperation des donnees

        //Recuperation des differentes vues
        page2TitleView = (TextView) findViewById(R.id.page2Title);
        //remplissage de la vue selectionnee avec la bonne data provenant de l'objet
        page2TitleView.setText(selectedObject.getNewspaperTitle());

        page2ImageView = (ImageView) findViewById(R.id.page2Image);
        page2ImageView.setImageDrawable(selectedObject.getBackgroundImage());

        Page2TextContentView = (TextView) findViewById(R.id.Page2TextContent);
        Page2TextContentView.setText(selectedObject.getArticleShortText());

        page2AuthorView = (TextView) findViewById(R.id.page2Author);
        page2AuthorView.setText(selectedObject.getArticleAuthor());

        page2dateView = (TextView) findViewById(R.id.page2date);
        page2dateView.setText(selectedObject.getArticleDate());



    }

}
