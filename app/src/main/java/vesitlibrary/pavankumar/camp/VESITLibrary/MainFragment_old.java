/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment_old extends Fragment {
    public MainFragment_old() {
        // Required empty public constructor
    }
    Toolbar toolbar;
    String baseuriauthp6 = "/pin/";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_fragment_old, container, false);

        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        }
        return rootView;
    }
}
