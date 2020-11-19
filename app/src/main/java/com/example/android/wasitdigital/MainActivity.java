package com.example.android.wasitdigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mShowCount, mShowCount2;
    int mCount, mCount2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount =(TextView) findViewById(R.id.show_count);
        mShowCount2 =(TextView) findViewById(R.id.show_count2);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Jumlah Skor :" +  mCount, Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        mCount = mCount+1;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast2(View view) {
        Toast.makeText(this, "Jumlah Skor :" +  mCount2, Toast.LENGTH_LONG).show();

    }

    public void countUp2(View view) {
        mCount2 = mCount2+1;
        mShowCount2.setText(Integer.toString(mCount2));
    }

}