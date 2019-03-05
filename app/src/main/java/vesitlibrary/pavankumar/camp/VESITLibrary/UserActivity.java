/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class UserActivity extends AppCompatActivity  {

    private ListView listView;
    String id = null;
    Toolbar toolbar = null;
    TextView checknet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        listView = (ListView) findViewById(R.id.list);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //noinspection ConstantConditions
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        checknet =  (TextView)findViewById(R.id.checknet);
        checkConnection();
    }

    private void checkConnection() {
        boolean isConnected = ConnectivityReceiver.isConnected();
        showSnack(isConnected);
    }

    private void showSnack(boolean isConnected) {
        String baseurl1235 = Configbookconnection.staticauth;
        String message;
        String baseurl1236 = getString(R.string.baseuriauth5);
        String baseuriauthdetails = getString(R.string.baseuriauth);
        String baseurl1234 = getString(R.string.baseurlauthdet);
        int color;
        if (isConnected) {
            message = "Good! You are connected to internet....";
            color = Color.WHITE;
            String baseurl1238 = getString(R.string.baseuriauthp6);
            final ProgressDialog progressDialog = new ProgressDialog(UserActivity.this,
                    R.style.AppTheme_Dark_Dialog1);
            progressDialog.setIndeterminate(true);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setMessage("Please Wait.... \nGetting Your Issued Book Status.....");
            progressDialog.show();
            final SharedPreferences mSharedPreference= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            String value=(mSharedPreference.getString("userinput", null));
            String baseurl21 = Configbookconnection.baseurlpinkey;
            String baseurl22 = getString(R.string.baseuriauthp1);
            String baseurl123 = getString(R.string.baseuriauthp2);
            String baseurl1237 = getString(R.string.checkme);
            String baseurl23 = getString(R.string.baseuriauthyear);
            String baseurl1245 = getString(R.string.baseuridetailskey);
            String checkdetails = baseuriauthdetails+baseurl22+baseurl123+baseurl1234+baseurl1235+baseurl1245+baseurl1236+baseurl23+baseurl1237+value+baseurl1238+baseurl21;
            StringRequest stringRequest = new StringRequest(checkdetails,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            progressDialog.dismiss();
                            showJSON(response);
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(UserActivity.this, "Server is busy \nPlease Try Again Later :/", Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                            checknet.setText("Sorry :( \n Please Try Again Later");
                        }
                    });

            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        } else {
            message = "Sorry! You are Not connected to internet... \nPlease Check Your Internet Connection :(";
            checknet.setText("Sorry :( \n Please Try Again Later");
            color = Color.WHITE;
        }

        Snackbar snackbar = Snackbar
                .make(findViewById(R.id.fab), message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        sbView.setBackgroundColor(ContextCompat.getColor(UserActivity.this, R.color.snackbar1));
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(color);
        snackbar.show();
    }

    private void showJSON(String json) {

        ParseJSONdetails pj = new ParseJSONdetails(json);
        pj.parseJSON();
        CustomListdetails cl = new CustomListdetails(this, ParseJSONdetails.names, ParseJSONdetails.date1, ParseJSONdetails.date2);
        listView.setAdapter(cl);
    }

}