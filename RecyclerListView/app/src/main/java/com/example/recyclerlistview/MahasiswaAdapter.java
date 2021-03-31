package com.example.recyclerlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewfolder> {

    private ArrayList<Mahasiswa> datalist;

    public MahasiswaAdapter(ArrayList<Mahasiswa> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewfolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent ,false);
        return new MahasiswaViewfolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewfolder holder, int position) {
        holder.txNama.setText(datalist.get(position).getNama());
        holder.txNim.setText(datalist.get(position).getNim());
        holder.txNoHP.setText(datalist.get(position).getNoHP());

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MahasiswaViewfolder extends RecyclerView.ViewHolder {
        private TextView txNama, txNim, txNoHP;

        public MahasiswaViewfolder(@NonNull View itemView) {
            super(itemView);
            txNama = itemView.findViewById(R.id.tx_nama_mahasiswa);
            txNim = itemView.findViewById(R.id.tx_npm_mahasiswa);
            txNoHP = itemView.findViewById(R.id.tx_nohp_mahasiswa);
        }
    }
}
