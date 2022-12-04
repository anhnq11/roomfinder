package com.example.demobottomnav.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.demobottomnav.R;

public class Fragm1 extends Fragment implements View.OnClickListener{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragm1, container, false);
        Button btnThongTinChu = view.findViewById(R.id.btnThongTinChu);
        btnThongTinChu.setOnClickListener(this);
        Button btnSuaThongTinChu = view.findViewById(R.id.btnSuaThongTinChu);
        btnSuaThongTinChu.setOnClickListener(this);
        Button btnThongTinKhach = view.findViewById(R.id.btnThongTinKhach);
        btnThongTinKhach.setOnClickListener(this);
        Button btnSuaThongTinKhach = view.findViewById(R.id.btnSuaThongTinKhach);
        btnSuaThongTinKhach.setOnClickListener(this);
        Button btnDanhSachChu = view.findViewById(R.id.btnDanhSachChu);
        btnDanhSachChu.setOnClickListener(this);
        Button btnDanhSachKhach = view.findViewById(R.id.btnDanhSachKhach);
        btnDanhSachKhach.setOnClickListener(this);
        Button btnDanhSachPChu = view.findViewById(R.id.btnDanhSachPChu);
        btnDanhSachPChu.setOnClickListener(this);
        Button btnDanhSachPKhach = view.findViewById(R.id.btnDanhSachPKhach);
        btnDanhSachPKhach.setOnClickListener(this);
        Button btnSuaPhong = view.findViewById(R.id.btnSuaPhong);
        btnSuaPhong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment;
        switch (v.getId()) {
            case R.id.btnThongTinChu:
                fragment = new FragmThongTinChu();
                loadFragment(fragment);
                break;

            case R.id.btnSuaThongTinChu:
                fragment = new FrgmSuaThongTinChu();
                loadFragment(fragment);
                break;

            case R.id.btnThongTinKhach:
                fragment = new FrgmThongTinKhach();
                loadFragment(fragment);
                break;

            case R.id.btnSuaThongTinKhach:
                fragment = new FrgmSuaThongTinKhach();
                loadFragment(fragment);
                break;

            case R.id.btnDanhSachChu:
                fragment = new FrgmDsChu();
                loadFragment(fragment);
                break;

            case R.id.btnDanhSachKhach:
                fragment = new FrgmDsKhach();
                loadFragment(fragment);
                break;

            case R.id.btnDanhSachPChu:
                fragment = new FrgmDsPChu();
                loadFragment(fragment);
                break;

            case R.id.btnDanhSachPKhach:
                fragment = new FrgmDsPKhach();
                loadFragment(fragment);
                break;

            case R.id.btnSuaPhong:
                fragment = new FrgmSuaPhong();
                loadFragment(fragment);
                break;
        }
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = (getActivity()).getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.commit();
    }
}