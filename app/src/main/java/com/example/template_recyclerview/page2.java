

package com.example.template_recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class page2 extends AppCompatActivity  {

    public static final String MY_OBJECT_ARTICLES = "myObjectArticles";
    private MyObject selectedObject;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        //selectedMyObject = getActivity().getIntent().getParcelableExtra(MYOBJECT); // Parcelable
        selectedObject = getIntent().getParcelableExtra(MY_OBJECT_ARTICLES); // Parcelable ; getintent = recuperation des donnees
    }

}
