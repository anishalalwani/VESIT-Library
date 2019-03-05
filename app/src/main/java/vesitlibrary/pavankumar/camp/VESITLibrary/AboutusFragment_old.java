/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutusFragment_old extends DialogFragment implements View.OnClickListener {
    Button buttongp10, buttongp11 , buttongp12;
    LinearLayout ratel;
    public AboutusFragment_old() {
        // Required empty public constructor
    }
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_aboutus_fragment_old, container, false);
        ratel = (LinearLayout)view.findViewById(R.id.rate);
        buttongp10 = (Button) view.findViewById(R.id.buttongp10);
        buttongp11 = (Button) view.findViewById(R.id.buttongp11);
        buttongp12 = (Button) view.findViewById(R.id.buttongp12);
        ratel.setOnClickListener(this);
        buttongp10.setOnClickListener(this);
        buttongp11.setOnClickListener(this);
        buttongp12.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rate:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=vesitlibrary.pavankumar.camp.VESITLibrary")));
                break;
            case R.id.buttongp10:
                AlertDialog.Builder build1= new AlertDialog.Builder(getActivity());
                build1.setTitle("Whats New In This Version !!")
                        .setMessage(R.string.chnagelog1)
                        .setPositiveButton("OKAY", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.buttongp11:
                AlertDialog.Builder build2= new AlertDialog.Builder(getActivity());
                build2.setTitle("Notice")
                        .setMessage(R.string.test)
                        .setPositiveButton("OKAY", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .show();
                break;
            case R.id.buttongp12:
                AlertDialog.Builder build3= new AlertDialog.Builder(getActivity());
                build3.setTitle("Whats New In This Version !!")
                        .setMessage(R.string.feedback)
                        .setPositiveButton("OKAY", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setNeutralButton("Give Feedback Now", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Intent.ACTION_SEND);
                                i.setType("text/email");
                                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"vesitlibrary.app@gmail.com"});
                                i.putExtra(Intent.EXTRA_SUBJECT, "Library App-Feedback");
                                i.putExtra(Intent.EXTRA_TEXT   , "Your Feedback/suggestions Here");
                                try {
                                    startActivity(Intent.createChooser(i, "Send mail..."));
                                } catch (android.content.ActivityNotFoundException ignored) {

                                }
                            }
                        })
                        .show();
                break;

        }
    }
}