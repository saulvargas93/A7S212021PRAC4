package mx.edu.tesoem.isc.sucv.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class url extends AppCompatActivity {
    ImageView miimagen ;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        miimagen = findViewById(R.id.miimagen);

        Picasso.get()
                .load("")//url de imagen hijo
                .fit()//recorda la imagen
                .error(R.mipmap.ic_launcher_round)
                .into(miimagen);
    }
}