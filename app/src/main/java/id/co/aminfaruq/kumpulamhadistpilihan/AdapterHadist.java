package id.co.aminfaruq.kumpulamhadistpilihan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AdapterHadist extends RecyclerView.Adapter<AdapterHadist.ViewHolder> {
    Context context;
    String[] judul,isi,terjemah;

    public AdapterHadist(Context context, String[] judul, String[] isi, String[] terjemah) {
        this.context = context;
        this.judul = judul;
        this.isi = isi;
        this.terjemah = terjemah;
    }

    @NonNull
    @Override
    public AdapterHadist.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_hadist,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHadist.ViewHolder viewHolder, final int i) {
        viewHolder.txtJudul.setText(judul[i]);
        viewHolder.txtIsi.setText(isi[i]);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailHadist.class);
                intent.putExtra("Judul",judul[i]);
                intent.putExtra("isi",isi[i]);
                intent.putExtra("terjemah",terjemah[i]);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return judul.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtJudul,txtIsi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtJudul = itemView.findViewById(R.id.txtJudul);
            txtIsi = itemView.findViewById(R.id.txtIsi);
        }
    }
}
