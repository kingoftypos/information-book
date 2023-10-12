package com.company.informationbook.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.company.informationbook.R;
import com.company.informationbook.activities.CountriesActivity;
import com.company.informationbook.activities.LeadersActivity;
import com.company.informationbook.activities.MainActivity;
import com.company.informationbook.activities.MuseumsActivity;
import com.company.informationbook.activities.WondersActivity;
import com.company.informationbook.modelclass.modelclass;

import java.util.ArrayList;

public class Adapterclass extends RecyclerView.Adapter<Adapterclass.CardviewHolder>
{
    private ArrayList<modelclass> modellist;
    Context context;



    public Adapterclass(ArrayList<modelclass> modellist, Context context) {
        this.modellist = modellist;
        this.context = context;


    }

    @NonNull
    @Override
    public CardviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new CardviewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull CardviewHolder holder, int position) {
     modelclass model= modellist.get(position);
     holder.textviewsplash.setText(model.getCatname());
     holder.imgviewsplash.setImageResource(context.getResources().getIdentifier(model.getImgname(),"drawable",context.getPackageName()));
     holder.cardview.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if(position==0)
             {
                 Intent intent =new Intent(context, CountriesActivity.class);
                context.startActivity(intent);

             }
             if(position==1)
             {
                 Intent intent =new Intent(context, LeadersActivity.class);
                 context.startActivity(intent);

             }
             if(position==2)
             {
                 Intent intent =new Intent(context, MuseumsActivity.class);
                 context.startActivity(intent);

             }
             if(position==3)
             {
                 Intent intent =new Intent(context, WondersActivity.class);
                 context.startActivity(intent);

             }
         }
     });
    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }

    public class CardviewHolder extends RecyclerView.ViewHolder {
        private TextView textviewsplash;
        private ImageView imgviewsplash;
        private CardView cardview;
        public CardviewHolder(@NonNull View itemView) {
            super(itemView);

            textviewsplash=itemView.findViewById(R.id.Description);
            imgviewsplash=itemView.findViewById(R.id.imgdes);
            cardview=itemView.findViewById((R.id.cardview));

        }
    }
}
