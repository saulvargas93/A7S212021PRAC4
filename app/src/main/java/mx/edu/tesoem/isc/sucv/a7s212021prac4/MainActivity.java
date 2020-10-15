package mx.edu.tesoem.isc.sucv.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void btnpng(View v){
        Intent intent = new Intent( this,png.class);
        startActivity(intent);

    }

    public void btnjpg (View v){

        Intent intent = new Intent(this,jpg.class);
        startActivity(intent);

    }
    public void btnurl (View v){
        Intent intent = new Intent(this,url.class);
        startActivity(intent);

    }
}