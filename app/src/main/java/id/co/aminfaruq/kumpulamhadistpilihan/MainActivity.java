package id.co.aminfaruq.kumpulamhadistpilihan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.myRecycleview)
    RecyclerView myRecycleview;

    String[] judul,isi,terjemah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        judul = getResources().getStringArray(R.array.JudulHadist);
        isi = getResources().getStringArray(R.array.isiHadist);
        terjemah = getResources().getStringArray(R.array.terjemah);

        AdapterHadist adapterHadist = new AdapterHadist(this,judul,isi,terjemah);

        myRecycleview.setHasFixedSize(true);
        myRecycleview.setLayoutManager(new LinearLayoutManager(this));
        myRecycleview.setAdapter(adapterHadist);

    }
}
