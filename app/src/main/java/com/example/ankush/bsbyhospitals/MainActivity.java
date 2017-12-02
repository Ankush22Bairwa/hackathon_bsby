package com.example.ankush.bsbyhospitals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void h1(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    public void h2(View view) {
        Intent intent = new Intent (MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
    public void h3(View view) {
        Intent intent = new Intent (MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }
    public void h4(View view) {
        Intent intent = new Intent (MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }
    public void h5(View view) {
        Intent intent = new Intent (MainActivity.this, Main6Activity.class);
        startActivity(intent);
    }
    public void h6(View view) {
        Intent intent = new Intent (MainActivity.this, Main7Activity.class);
        startActivity(intent);
    }
    public void h7(View view) {

        startActivity(new Intent(MainActivity.this, Main8Activity.class));
    }

    public void h8(View view) {

        startActivity(new Intent(MainActivity.this, Main9Activity.class));
    }
    public void h9(View view) {

        startActivity(new Intent(MainActivity.this, Main10Activity.class));
    }
    public void h10(View view) {

        startActivity(new Intent(MainActivity.this, Main11Activity.class));
    }
    public void h11(View view) {

        startActivity(new Intent(MainActivity.this, Main12Activity.class));
    }
    public void h12(View view) {

        startActivity(new Intent(MainActivity.this, Main13Activity.class));
    }
}
