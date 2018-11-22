package id.co.aminfaruq.kumpulamhadistpilihan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailHadist extends AppCompatActivity {

    @BindView(R.id.judulDetail)
    TextView judulDetail;
    @BindView(R.id.isiDetail)
    TextView isiDetail;
    @BindView(R.id.isiTerjemahan)
    TextView isiTerjemahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hadist);
        ButterKnife.bind(this);

        judulDetail.setText(getIntent().getStringExtra("Judul"));
        isiDetail.setText(getIntent().getStringExtra("isi"));
        isiTerjemahan.setText(getIntent().getStringExtra("terjemah"));
    }
}
