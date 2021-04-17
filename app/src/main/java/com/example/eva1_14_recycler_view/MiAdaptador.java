package com.example.eva1_14_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.viewHolder> {

    private String[] aDatos;

    public MiAdaptador(String[] aDatos) {
        this.aDatos = aDatos;
    }

    //VIEWHOLDER REPRESENTA UN ITEM DE LA LISTA
    //EVENTOS Y METODOS DE CADA WIDGET

    public static class viewHolder extends RecyclerView.ViewHolder{
private final TextView txtVwFila;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtVwFila = itemView.findViewById(R.id.txtVwFila);
        }

        public TextView getTxtVwFila() {
            return txtVwFila;
        }
    }
//CREAR PANTALLA (CADA FILA) Y CREAR LOS OBJETOS VIEW HOLDER
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.texto_fila,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.getTxtVwFila().setText(aDatos[position]);
    }


    @Override
    public int getItemCount() {
        return aDatos.length;
    }
}
