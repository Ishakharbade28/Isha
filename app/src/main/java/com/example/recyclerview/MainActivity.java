package com.example.recyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Grid;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contactmodel> arrContacts = new ArrayList<>();

    EditText search;
    Button button;

    int Searchint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        search = findViewById(R.id.searchview);
        button = findViewById(R.id.btn_search);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        RecyclerView.LayoutManager layoutManager =new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(layoutManager);


        arrContacts.add(new Contactmodel(R.drawable.img,"A","Hii",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_1,"B","How are you",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_2,"C","Ok",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_3,"D","Fine",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_4,"E","What is your name",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_5,"F","Heyy",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_6,"G","Hii",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_7,"H","How are you",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_8,"I","Fine",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_9,"J","What is your name",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_10,"K","Hello",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_11,"L","Heyy",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_12,"M","Ohhhh",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_13,"N","Nice",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_14,"O","fine",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_15,"P","What is your D.O.B?",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_16,"Q","Hello",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_17,"R","ohhhh",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_18,"S","Hii",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_1,"T","ohh nice",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_2,"U","What is your favourite dish",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_3,"V","yesss",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_6,"W","nice",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_12,"X","Heyy",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_5,"Y","What is your next plan",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_7,"Z","yaa",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_1,"A","Hello",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_10,"A","What is your favourite dish??",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_15,"B","okk",R.drawable.img_19));
        arrContacts.add(new Contactmodel(R.drawable.img_16,"C","Hiii",R.drawable.img_19));






        RecyclerConatctAdapter adapter = new RecyclerConatctAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Searchint = Integer.parseInt(search.getText().toString());
                layoutManager.scrollToPosition(Searchint);
            }
        });
    }
}