package com.example.reti.mybeginningapplications;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by reti on 29/03/2019.
 */

public class MyAsyncTask extends AsyncTask<Integer, Integer, String> {

    private Context context = null;
    private ProgressBar progressBar = null;
    private Button button = null;

    public MyAsyncTask(Context context, ProgressBar progressBar, Button button){
        this.context = context;
        this.progressBar = progressBar;
        this.button = button;
    }

    @Override
    protected String doInBackground(Integer... params) {
        for(int count = 0; count <= params [0]; count++) {
            try {
                Thread.sleep(1000);
                publishProgress(count);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    @Override
    protected void onPostExecute(String result) {
        progressBar.setVisibility(View.GONE);
        button.setText("Restart");
        Toast.makeText(context, "Task concluso", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPreExecute() {
        progressBar.setVisibility(View.VISIBLE);
        Toast.makeText(context,"Task in corso", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        button.setText("Running..."+ values[0]);
        progressBar.setProgress(values[0]);
    }
}
