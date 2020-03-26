package com.example.template_recyclerview;

import android.os.Bundle;

public class page2 {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);}

        public Void page1 (View view) {
        startActivity(new Intent(this, page2.class));

        }


}
