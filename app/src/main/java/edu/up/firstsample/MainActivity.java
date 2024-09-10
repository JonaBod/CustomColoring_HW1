package edu.up.firstsample;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.input);

        int c = 0; // counter that increments when button is pressed
        Button butUpdate = findViewById(R.id.butUpdate); // reference from xml to code
        butUpdate.setText("increment");
        // if (butUpdate.st) c++;


    }
}