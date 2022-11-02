package br.ulbra.trocartela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btntela2, btntelaP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        telaPrincipal();
    }
    public void telaPrincipal(){
     setContentView(R.layout.tela1);
     btntela2=(Button) findViewById(R.id.btntela2);
     btntela2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             carregarTela2();
         }
     });
    }
    public void carregarTela2(){
        setContentView(R.layout.tela2);
        btntelaP = (Button) findViewById(R.id.btntelaP);
        btntelaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telaPrincipal();
            }
        });
    }
}