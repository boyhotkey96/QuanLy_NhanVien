package com.boyhotkey96.quanly_nhanvien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClasDAO clasDAO= new ClasDAO(this);
        clasDAO.open();
    }
}
