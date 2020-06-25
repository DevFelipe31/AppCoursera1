package com.denisfelipe.appcourseira1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMsg(String msg) {
        Context context = getApplicationContext();
        CharSequence text = msg;
        int duration = Toast.LENGTH_SHORT;

        Toast myToast = Toast.makeText(context, text, duration);
        myToast.show();
    }

    public void displayToastMsg(View v) {
        toastMsg(this.getString(R.string.toast_msg));
    }
}