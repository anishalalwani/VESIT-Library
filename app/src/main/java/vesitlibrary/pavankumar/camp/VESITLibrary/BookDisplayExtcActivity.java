/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class BookDisplayExtcActivity extends Activity {

    int pos= 0;
    int id = 0 ;
    int idauth = 0;
    private TextView  passbooknamecount ;
    TextView checknet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_display);
        //GET PASSED DATA
        Intent i=getIntent();
        pos=i.getExtras().getInt("idbyextc");
        //GET VIEWS
        final BookDisplayExtc adapter=new BookDisplayExtc();
        passbooknamecount = (TextView) findViewById(R.id.passbooknamecount);
        checknet =  (TextView)findViewById(R.id.checknet);

        id = Integer.parseInt(adapter.extcbkid[pos]);
        idauth = Integer.parseInt(adapter.extcauthid[pos]);
        checkConnection();

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
            String baseurl1236 = getString(R.string.baseuriauth5);
            String baseurl1238 = getString(R.string.baseuriauthp6);
            message = "Good! You are connected to internet...";
            color = Color.WHITE;
            final ProgressDialog progressDialog = new ProgressDialog(BookDisplayExtcActivity.this,
                    R.style.AppTheme_Dark_Dialog);
            progressDialog.setIndeterminate(true);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setMessage("Please Wait.... \nGetting Your Required Results ...");
            progressDialog.show();
            String basesearch1 = Configbookconnection.baseurlpinkey;
            String basesearch2 = getString(R.string.baseurisearchpinkey);
            String base = getString(R.string.baseuriauth);
            String base1 = getString(R.string.baseuriauthp2) ;
            String base11 = getString(R.string.baseuriauthp1);
            String base12 = getString(R.string.search);
            String base13 = Configbookconnection.staticauth;
            String checkme = base+base11+base1+base12+basesearch1+base13+basesearch2+baseurl1236+idauth+baseurl1238+id;
            StringRequest stringRequest = new StringRequest(checkme, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();
                    showJSON(response);
                }
            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(BookDisplayExtcActivity.this,"Server is busy \nPlease Try Again Later :/",Toast.LENGTH_LONG).show();
                            progressDialog.dismiss();
                            checknet.setText("Sorry :( \n Please Try Again Later");
                        }
                    });

            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
        } else {
            message = "Sorry! You are Not connected to internet... \nPlease Check Your Internet Connection :(";
            color = Color.WHITE;
            checknet.setText("Sorry :( \n Please Try Again Later");

        }

        Snackbar snackbar = Snackbar
                .make(findViewById(R.id.fab), message, Snackbar.LENGTH_LONG);

        View sbView = snackbar.getView();
        sbView.setBackgroundColor(ContextCompat.getColor(BookDisplayExtcActivity.this, R.color.snackbar2));
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(color);
        snackbar.show();
    }

    private void showJSON(String response){
        String name=null;
        String count=null;

        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Configbookconnection.JSON_ARRAY);
            JSONObject collegeData = result.getJSONObject(0);
            name = collegeData.getString(Configbookconnection.KEY_NAME);
            count = collegeData.getString(Configbookconnection.KEY_ADDRESS);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        passbooknamecount.setText("Your Selected BookName Is:-\t\t" +name+"\n\nAvailability:-\t" +count+"\n\n");


    }

}
