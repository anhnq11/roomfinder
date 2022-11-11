package com.example.demobottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.demobottomnav.Fragment.Fragm1;
import com.example.demobottomnav.Fragment.Fragm2;
import com.example.demobottomnav.Fragment.Fragm3;
import com.example.demobottomnav.Fragment.Fragm4;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.pageTrangChu);
        loadFragment(new Fragm1());
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment;
        switch (item.getItemId()) {
            case R.id.pageTrangChu:
                fragment = new Fragm1();
                loadFragment(fragment);
                return true;

            case R.id.pageSanPham:
                fragment = new Fragm2();
                loadFragment(fragment);
                return true;

            case R.id.pageBanHang:
                fragment = new Fragm3();
                loadFragment(fragment);
                return true;

            case R.id.pageTaiKhoan:
                fragment = new Fragm4();
                loadFragment(fragment);
                return true;
        }
        return false;
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}