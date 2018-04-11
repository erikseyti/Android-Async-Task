package com.example.aluno.asynctask;
import android.graphics.Bitmap;
import android.os.AsyncTask;

/**
 * Created by aluno on 11/04/18.
 */

public class BuscarImagem extends AsyncTask<String,Integer,Bitmap> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
    }

    @Override
    protected Bitmap doInBackground(String... strings) {
        return null;
    }

    // recebe um array de String
    // String... - declaração de um Array
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }
}
