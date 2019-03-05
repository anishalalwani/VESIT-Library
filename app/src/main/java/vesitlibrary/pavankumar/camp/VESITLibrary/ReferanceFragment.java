/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReferanceFragment extends Fragment implements View.OnClickListener {

    Button buttongp1;
    Button buttongp2;
    Button buttongp3;
    Button buttongp4;
    Button buttongp5;
    Button buttongp6;
    Button buttongp7;

    public ReferanceFragment() {
        // Required empty public constructor
    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_referance, container, false);
        buttongp1 = (Button) view.findViewById(R.id.buttongp1);
        buttongp2 = (Button) view.findViewById(R.id.buttongp2);
        buttongp3 = (Button) view.findViewById(R.id.buttongp3);
        buttongp4 = (Button) view.findViewById(R.id.buttongp4);
        buttongp5 = (Button) view.findViewById(R.id.buttongp5);
        buttongp6 = (Button) view.findViewById(R.id.buttongp6);
        buttongp7 = (Button) view.findViewById(R.id.buttongp7);

        buttongp1.setOnClickListener(this);
        buttongp2.setOnClickListener(this);
        buttongp3.setOnClickListener(this);
        buttongp4.setOnClickListener(this);
        buttongp5.setOnClickListener(this);
        buttongp6.setOnClickListener(this);
        buttongp7.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.buttongp1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://ieeexplore.ieee.org/Xplore/home.jsp")));
                break;
            case R.id.buttongp2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.astm.org")));
                break;

            case R.id.buttongp3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jgateplus.com")));
                break;
            case R.id.buttongp4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sciencedirect.com")));
                break;
            case R.id.buttongp5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nptel.ac.in")));
                break;
            case R.id.buttongp6:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.accessengineeringlibrary.com")));
                break;
            case R.id.buttongp7:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.link.springer.com")));
                break;

        }
    }
}
