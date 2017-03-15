package com.example.mustafa.taschenrechner;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rechner extends AppCompatActivity {

    EditText diviZahl1;
    EditText diviZahl2;
    Button ausführen;
    TextView ergebnis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meinrechner);



    }

    public void Berechne(View v){
        diviZahl1 = (EditText) findViewById(R.id.dividend);
        diviZahl2 = (EditText) findViewById(R.id.divisor);
        ausführen = (Button) findViewById(R.id.rechnen);
        ergebnis = (TextView) findViewById(R.id.Ergebnis);

        float d1 = Float.parseFloat(diviZahl1.getText().toString());
        float d2 = Float.parseFloat(diviZahl2.getText().toString());


        float erg = d1/d2;

        ergebnis.setText(Float.toString(erg));
    }


}
