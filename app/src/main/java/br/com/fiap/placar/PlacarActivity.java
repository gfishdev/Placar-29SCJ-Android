package br.com.fiap.placar;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlacarActivity extends AppCompatActivity {
    private TextView tvTimeCasa, tvTimeVisitante, tvPlacarCasa, tvPlacarVisitante;

    private int golCasa = 0, golVisitante = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placar);

        tvTimeCasa = (TextView) findViewById(R.id.tvTimeCasa);
        tvTimeVisitante = (TextView) findViewById(R.id.tvTimeVisitante);
        tvPlacarCasa = (TextView) findViewById(R.id.tvPlacarCasa);
        tvPlacarVisitante = (TextView) findViewById(R.id.tvPlacarVisitante);

        if (getIntent() != null) {
            tvTimeCasa.setText(getIntent().getStringExtra("CASA"));
            tvTimeVisitante.setText(getIntent().getStringExtra("VISITANTE"));
        }

        if (savedInstanceState != null) {
            golCasa = savedInstanceState.getInt("GOLCASA");
            golVisitante = savedInstanceState.getInt("GOLVISITANTE");
        }

        tvPlacarCasa.setText(String.valueOf(golCasa));
        tvPlacarVisitante.setText(String.valueOf(golVisitante));
    }


    public void golCasa(View view) {
        tvPlacarCasa.setText(String.valueOf(++golCasa));
    }

    public void golVisitante(View view) {
        tvPlacarVisitante.setText(String.valueOf(++golVisitante));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("GOLCASA", golCasa);
        outState.putInt("GOLVISITANTE", golVisitante);
    }
}
