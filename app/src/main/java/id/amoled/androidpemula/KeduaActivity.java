package id.amoled.androidpemula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KeduaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Button btnToDzikirCounter = findViewById(R.id.btn_kedua_to_dzikir);

        btnToDzikirCounter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_kedua_to_dzikir){
            Intent toDzikirIntent = new Intent(KeduaActivity.this, MainActivity.class);
            startActivity(toDzikirIntent);
        }

    }
}
