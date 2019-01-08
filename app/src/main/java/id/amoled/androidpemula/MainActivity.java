package id.amoled.androidpemula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // deklarasi komponen View
    private Button btnCount, btnResult, btnReset;
    private TextView tvNumberCounter;
    private int dzikir = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // menghubungkan antara JAVA dan XML dengan mengaitkan ID masing-masing View
        btnCount = findViewById(R.id.btn_main_count);
        btnResult = findViewById(R.id.btn_main_result);
        btnReset = findViewById(R.id.btn_main_reset);
        tvNumberCounter = findViewById(R.id.tv_main_number_counter);

        // deklarasi kondisi ketika Button di tekan oleh pengguna
        btnCount.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_main_count) {

            dzikir++; //variabel 'dzikir' yang ber-tipe data Integer ditambah nilainya sebanyak 1
            tvNumberCounter.setText(dzikir); //menampilkan nilai 'dzikir' menggunakan TextView dengan ID tvNumberCounter

        } else if (v.getId() == R.id.btn_main_reset) {
            dzikir = 0;
            tvNumberCounter.setText(dzikir);
        } else if (v.getId() == R.id.btn_main_result) {
            Toast.makeText(this, "Current dzikir count: " + dzikir, Toast.LENGTH_SHORT).show();
        }
    }
}
