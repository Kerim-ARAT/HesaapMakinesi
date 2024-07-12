package com.example.hesapmakinesi;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int birinciSayi;
    private int ikinciSayi;
    private int s1, s2, sonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText sayi1 = findViewById(R.id.sayi1);
        EditText sayi2 = findViewById(R.id.sayi2);
        TextView goster = findViewById(R.id.goster1);


        // tıklama işlemleri
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String ss1 = sayi1.getText().toString();
                String ss2 = sayi2.getText().toString();
                if (!TextUtils.isEmpty(ss1) && !TextUtils.isEmpty(ss2)) {

                    birinciSayi = Integer.parseInt(sayi1.getText().toString());
                    ikinciSayi = Integer.parseInt(sayi2.getText().toString());
                    s1 = birinciSayi;
                    s2 = ikinciSayi;
                    Hesapla hesapla = new Hesapla(s1, s2);

                    String sonuc2 = String.valueOf(hesapla.toplam());

                    goster.setText(sonuc2);
                } else {
                    Toast.makeText(MainActivity.this, "lütfen kutucukları doldurun", Toast.LENGTH_LONG).show();
                }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss1 = sayi1.getText().toString();
                String ss2 = sayi2.getText().toString();
                if (!TextUtils.isEmpty(ss1) && !TextUtils.isEmpty(ss2)) {

                    birinciSayi = Integer.parseInt(sayi1.getText().toString());
                    ikinciSayi = Integer.parseInt(sayi2.getText().toString());
                    s1 = birinciSayi;
                    s2 = ikinciSayi;
                    Hesapla hesapla = new Hesapla(s1, s2);

                    String sonuc2 = String.valueOf(hesapla.fark());

                    goster.setText(sonuc2);
                } else {
                    Toast.makeText(MainActivity.this, "lütfen kutucukları doldurun", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss1 = sayi1.getText().toString();
                String ss2 = sayi2.getText().toString();
                if (!TextUtils.isEmpty(ss1) && !TextUtils.isEmpty(ss2)) {

                    birinciSayi = Integer.parseInt(sayi1.getText().toString());
                    ikinciSayi = Integer.parseInt(sayi2.getText().toString());
                    s1 = birinciSayi;
                    s2 = ikinciSayi;
                    Hesapla hesapla = new Hesapla(s1, s2);

                    String sonuc2 = String.valueOf(hesapla.carp());

                    goster.setText(sonuc2);
                } else {
                    Toast.makeText(MainActivity.this, "lütfen kutucukları doldurun", Toast.LENGTH_LONG).show();
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss1 = sayi1.getText().toString();
                String ss2 = sayi2.getText().toString();
                if (!TextUtils.isEmpty(ss1) && !TextUtils.isEmpty(ss2)) {
                    float sayibolme1 = Float.parseFloat(sayi1.getText().toString());
                    float sayibolme2 = Float.parseFloat(sayi2.getText().toString());

                    float cevap = sayibolme1/ sayibolme2;


                    String sonuc2 = String.valueOf(cevap);

                    goster.setText(sonuc2);
                } else {
                    Toast.makeText(MainActivity.this, "lütfen kutucukları doldurun", Toast.LENGTH_LONG).show();
                }
            }
        });
    }



}