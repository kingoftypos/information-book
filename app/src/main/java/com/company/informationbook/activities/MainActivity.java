package com.company.informationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.company.informationbook.R;
import com.company.informationbook.adapters.Adapterclass;
import com.company.informationbook.modelclass.modelclass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView rv;
private ArrayList<modelclass> arrmodel;
private Adapterclass adapc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.recyclerview);

        rv.setLayoutManager(new GridLayoutManager(this, 2));






        modelclass modelclass1= new modelclass("countries","the countries");
        modelclass modelclass2=new modelclass("the_leaders","The Leaders");
        modelclass modelclass3=new modelclass("the_museum","The Museums");
        modelclass modelclass4=new modelclass("taj_mahal","Seven Wonders of the World");

        arrmodel =new ArrayList<>();
        arrmodel.add(modelclass1);
        arrmodel.add(modelclass2);
        arrmodel.add(modelclass3);
        arrmodel.add(modelclass4);

        adapc=new Adapterclass(arrmodel,this);
        rv.setAdapter(adapc);
    }




}