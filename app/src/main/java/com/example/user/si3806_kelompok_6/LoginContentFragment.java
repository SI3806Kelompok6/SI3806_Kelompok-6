package com.example.user.si3806_kelompok_6;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class LoginContentFragment extends Fragment implements View.OnClickListener {

    private Button mLogin;
    private TextView mRegis;
    private EditText mUser, mPass;
    private ProgressDialog pDialog;
    private JSONParser jsonParser = new JSONParser();
    private static String url = "http://10.20.0.108/indomaret/jsonloginattemp.php";
    private static final String TAG_SUCCESS = "success";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_login, container,false);
        mRegis = (TextView) view.findViewById(R.id.link_signup);
        mRegis.setOnClickListener(this);
        mLogin =(Button) view.findViewById(R.id.btn_login);
        mLogin.setOnClickListener(this);

        mUser = (EditText) view.findViewById(R.id.input_user);
        mPass = (EditText) view.findViewById(R.id.input_password);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case.R.id.btn_login:
            new Login(mUser.getText().toString(), mPass.getText().toString()).execute();
            break;
            case R.id.link_signup:
                Intent intent = new Intent(getActivity(), RegisActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}

}

