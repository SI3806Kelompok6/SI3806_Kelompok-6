package com.example.user.si3806_kelompok_6;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LoginContentFragment extends Fragment implements View.OnClickListener {

    private Button mLogin;
    private TextView mRegis;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_login, container,false);
        mRegis = (TextView) view.findViewById(R.id.link_signup);
        mRegis.setOnClickListener(LoginContentFragment.this);

        return view;
    }

    @Override
    public void onClick(View view) {

    }
}

