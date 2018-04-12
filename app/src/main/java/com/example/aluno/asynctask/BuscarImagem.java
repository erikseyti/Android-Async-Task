package com.example.aluno.asynctask;
import android.app.Activity;
import android.drm.DrmStore;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by aluno on 11/04/18.
 */

public class BuscarImagem extends AsyncTask<String,Integer,Bitmap> {

    Activity activity;
    ProgressBar progressBar;

    public BuscarImagem(Activity activity) {
        this.activity = activity;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

    }

    // Após passar o valor para a thread paralela, a ação seguinte será feita no onPostExecute
    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        ImageView imageView = (ImageView) activity.findViewById(R.id.imagemProjeto);
        if (bitmap!=null)
        {
            imageView.setImageBitmap(bitmap);
        }
    }

    // será nesse metodo que ira ser usado dentro da thread paralela
    // String... - declaração de um Array
    @Override
    protected Bitmap doInBackground(String... strings) {

        Bitmap imagem = null;

        try {
            URL url = new URL(strings[0]);
            imagem = BitmapFactory.decodeStream(url.openStream());
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return imagem;
    }

    // recebe um array de String
    // Integer... - declaração de um Array
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    // estes metodos são chamados quando a sua thread foi cancelada dentro do Async Task
    @Override
    protected void onCancelled(Bitmap bitmap) {
        super.onCancelled(bitmap);
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }
}
