package com.example.aluno.asynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BuscarImagem buscarImagem = new BuscarImagem(MainActivity.this);
        buscarImagem.execute("http://www.blog.connectparts.com.br/wp-content/uploads/2017/06/o-tamanho-da-roda-pode-aumentar-o-consumo-de-combustivel-do-carro.jpeg");
    }
}
