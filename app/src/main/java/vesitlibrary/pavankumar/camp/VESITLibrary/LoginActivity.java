/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etpassword;
    Button btn_login;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etpassword = (EditText) findViewById(R.id.etpassword);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(LoginActivity.this);
        checkConnection();
    }
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 3000);
    }
    private void checkConnection() {
        boolean isConnected = ConnectivityReceiver.isConnected();
        showSnack(isConnected);
    }

    // Showing the status in Snackbar
    private void showSnack(boolean isConnected) {
        String message;
        int color;
        if (isConnected) {
            message = "Good! Connected to Internet....";
            color = Color.WHITE;
        } else {
            message = "Sorry! Please Check Your Internet Connection...";
            color = Color.RED;
        }
        Snackbar snackbar = Snackbar
                .make(findViewById(R.id.fab), message, Snackbar.LENGTH_LONG);

        View sbView = snackbar.getView();
        sbView.setBackgroundColor(ContextCompat.getColor(LoginActivity.this, R.color.snackbar3));
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(color);
        snackbar.show();
    }

    @Override
    public void onClick(View view) {
        final String password = etpassword.getText().toString();
        final String checkid = etpassword.getText().toString();
        String baseuroauthp5 = getString(R.string.baseuriauth5);
        String baseuroauth6 = getString(R.string.baseuriauthp6);
        if (checkid.isEmpty() || checkid.length() < 1 || checkid.length() >8 ) {
            Toast.makeText(this, "Please enter valid Library-Id :-)", Toast.LENGTH_LONG).show();
            return;
        }
        String baseuroauthp2 = getString(R.string.baseuriauthp2);
        String baseuroauthp3 = getString(R.string.baseuriauthp3);
        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.AppTheme_Dark_Dialog2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setMessage("Authenticating...\nVerifying credentials.....");
        progressDialog.show();
        //Creating a string
        String baseuriauth = getString(R.string.baseuriauth);
        String baseuroauthp1 = getString(R.string.baseuriauthp1);
        String baseuroauthp4 = Configbookconnection.staticauth;
        String baseurl2 = Configbookconnection.baseurlpinkey;
        String baseurl1 = getString(R.string.baseuriauthkey);
        String baseurl3 = getString(R.string.baseuriauthyear);
        String check = baseuriauth+baseuroauthp1+baseuroauthp2+baseuroauthp3+baseurl3+baseuroauthp4+baseurl1+baseuroauthp5+password+baseuroauth6+baseurl2  ;
        StringRequest stringRequest = new StringRequest(check,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        String checklogin;
                        if (s.contains("true")) {
                            progressDialog.dismiss();
                            Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(LoginActivity.this, MainActivity.class);
                            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(LoginActivity.this);
                            SharedPreferences.Editor editor = prefs.edit();
                            editor.putString("userinput", password);
                            editor.apply();
                            startActivity(i);
                        } else {
                            checklogin = s;
                            if (checklogin.equals("false")) {
                                progressDialog.dismiss();
                                Toast.makeText(LoginActivity.this, "Check Your Library ID", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.dismiss();
                        Toast.makeText(LoginActivity.this, "Sorry For Inconvenience :((,Service Is Not Available Now, Service Is available From 8:00AM TO 6:00PM", Toast.LENGTH_LONG).show();

                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }

}
