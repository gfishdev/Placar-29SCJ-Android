package br.com.fiap.placar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etTimeCasa;
    private EditText etTimeVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTimeCasa = (EditText) findViewById(R.id.etTimeCasa);
        etTimeVisitante = (EditText) findViewById(R.id.etTimeVisitante);

    }

    public void iniciarJogo(View v) {
        Intent abrirPlacar = new Intent(this, PlacarActivity.class);
        abrirPlacar.putExtra("CASA", etTimeCasa.getText().toString());
        abrirPlacar.putExtra("VISITANTE", etTimeVisitante.getText().toString());
        startActivity(abrirPlacar);

    }


}
