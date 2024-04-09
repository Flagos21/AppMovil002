package cl.isisur.appmovil002;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layoutPrincipal;
    private TextView textoPalta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutPrincipal = findViewById(R.id.idPalta);
        textoPalta = findViewById(R.id.texto);

        Button botonTomate = findViewById(R.id.botonTomate);
        botonTomate.setOnClickListener(view -> {
            cambiarColorTexto(Color.parseColor("#E4766E"), "Tomate");
        });
        Button botonPepino = findViewById(R.id.botonPepino);
        botonPepino.setOnClickListener(view -> {
            cambiarColorTexto(Color.parseColor("#9DDA56"), "PEPINO");
        });
    }

    private void cambiarColorTexto(int colorFondo, String nuevoTexto) {
        layoutPrincipal.setBackgroundColor(colorFondo);
        textoPalta.setText(nuevoTexto);
    }
}
