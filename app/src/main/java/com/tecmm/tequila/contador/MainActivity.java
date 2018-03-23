package com.tecmm.tequila.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textContador, textAviso;
    int num=0;
    boolean cont = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textContador = (TextView) findViewById(R.id.txtContador);
        textAviso = (TextView) findViewById(R.id.txtAviso);
    }

    public void contador (View v) {
        if (cont) {
            num++;
            textContador.setText("" + num);
            if (num == 5)
                Log.e("van 5", "vamos bien");
            if (num == 7)
                textAviso.setText("ya casi llega");
            if (num == 9)
                textAviso.setText("ya merito");
            if (num == 10) {
                cont = false;
                Log.e("van 5", "vamos bien");
            }
        } else if (cont = false) {
            num--;
            textContador.setText("" + num);
            if (num == 5)
                Log.e("van 5", "vamos bien");
            if (num == 3)
                textAviso.setText("muy bajo");
            if (num == 2)
                textAviso.setText("bajito");
            if (num == 0)
                cont = true;
            Log.e("van 5", "vamos bien");
        }
    }
}
