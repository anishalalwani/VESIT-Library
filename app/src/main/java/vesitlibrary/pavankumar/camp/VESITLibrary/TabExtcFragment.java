/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import static vesitlibrary.pavankumar.camp.VESITLibrary.R.layout.list_item_book_display;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabExtcFragment extends Fragment {
    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    // Search EditText
    EditText inputSearch;

    public TabExtcFragment() {
        // Required empty public constructor
    }

    Toolbar toolbar;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_extc, container, false);


        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        }


        // Listview Data
        String products[] =
                {       "DIGITAL IMAGE PROCESSING 3/ED by \n PRATT WILLIAM K",
                        "DIGITAL INTEGRATED CIRCUITS 2/ED by \n RABAEY JAN M",
                        "DIGITAL SIGNAL PROCESSING by \n CAVICCHI T J",
                        "DIGITAL SIGNAL PROCESSING by \n IFEACHOR E C",
                        "DIGITAL SIGNAL PROCESSING by \n VENKATRAMANI B",
                        "DIGITAL SIGNAL PROCESSING FUN by \n LUDEMAN L C",
                        "DISCRETE TIME SIGNAL PROCESSING 2/ED by \n OPPENHEIM A V",
                        "DISCRETE-TIME SIGNAL PROCESSING 2/ED by \n OPPENHEIM A V",
                        "ELECTRIC CIRCUITS 2/ED. by \n ALEXANDER",
                        "EMBEDDED SYSTEMS by \n KAMAL RAJ",
                        "FIBER OPTICS COMMUNICATION by \n MYNBAEV DJAFOR",
                        "IMAGE PROCESSING ANALYSIS & MACHINE VISION by \n SONKA MILAN",
                        "ORTHOGONAL TRANSFORMS FOR D SP by \n RAO K K",
                        "VHDL PRIMER 3/ED by \n BHASKAR J",
                        "VLSI DESIGN INTRODUCTION by \n FABRICIUS EUGENE D",
                        "WIRELESS NETWORKS by \n KAVEH",
                        "WIRELESS NETWORKS by \n NICOPOLIDIS P",
                        "8051 MICROCONTROLLER :AN APPLICATION BASED INTRODUCTION by \n CALCUTT DAVID",
                        "8051 MICROCONTROLLER :AN APPLICATION BASED INTRODUCTION by \n COWAN FRED",
                        "8051 MICROCONTROLLER :AN APPLICATION BASED INTRODUCTION by \n PARCHIZADEH HASSAN",
                        "8051 MICROCONTROLLER: HARDWARE, SOFTWARE & APPLICATION by \n UDAYASHANKARA V",
                        "8051 MICROCONTROLLER: HARDWARE, SOFTWARE & APPLICATION by \n MALLIKARJUNASWAMY M S",
                        "ADAPTIVE SIGNAL PROCESSING by \n WIDROW BERNARD",
                        "ADAPTIVE SIGNAL PROCESSING by \n BENESTY J",
                        "ADAPTIVE SIGNAL PROCESSING by \n HUANG Y",
                        "ADVANCE ELECTRONIC COMMN SYS 6/ED by \n TOMASI WAYNE",
                        "ADVANCED ASIC CHIP SYNTHESIS by \n BHATNAGAR HIMANSHU",
                        "ADVANCED DIGITAL SIGNAL PROCESSING by \n PROAKIS J J",
                        "ADVANCED DIGITAL SIGNAL PROCESSING by \n ZELNIKAR GLEHN",
                        "AN INTRODUCTION TO SIGNALS & SYSTEMS by \n STULLER JOHN ALAN",
                        "ANALOG DIGITAL SIGNAL PROCESSING by \n AMBARDAR ASHOK",
                        "ANTENNA & WAVE PROPAGATION 3/ED by \n PRASAD K D",
                        "ANTENNA & WAVE PROPOGATION by \n HARISH A R",
                        "ANTENNA & WAVE PROPOGATION by \n SACHINDANANDA M",
                        "ANTENNAS by \n COLLIN R E",
                        "ANTENNAS by \n KRAUS J D",
                        "AUDIO VIDEO SYSTEMS by \n BALI S P",
                        "BASIC ELECTRICAL & ELECTRONICS ENGG by \n SINGH RAVISH R",
                        "BASIC ELECTRONIC by \n MANDAL SOUMITRA K",
                        "BASIC ELECTRONIC 9/ED by \n GROB BERNARD",
                        "BLUETOOTH TECHNOLOGY by \n PRABHU C SR",
                        "BROADBAND COMMUNICATION by \n BALAJI KUMAR",
                        "CIRCUIT & NETWORK ANA&  SYN by \n SUDHAKAR A",
                        "CIRCUIT DESIGN WITH VHDL by \n PEDRONI VOLNEI",
                        "CIRCUIT THEORY APPLIED by \n ADBY P R",
                        "CIRCUITS by \n CARLSON B A",
                        "CMOS VLSI DESIGN 2/ED by \n WESTE NEIL",
                        "CODING FOR WIRELESS CHANNELS by \n BIGLIERI E",
                        "CODING TECHNIQUES by \n WADE GRAHAM",
                        "COMM ELECTRONICS 2/ED by \n FRENZEL L E",
                        "COMMUNICATION CIRCUITS by \n SMITH JACK",
                        "COMMUNICATION SYS UNSING MATLAB by \n PROAKIS J G"



                };

        lv = (ListView)  rootView.findViewById(R.id.list_view);
        inputSearch = (EditText)  rootView.findViewById(R.id.inputSearch);
        lv.setOnItemClickListener(onListClick);


        // Adding items to listview
        adapter = new ArrayAdapter<>(getActivity(), list_item_book_display, R.id.product_name, products);
        lv.setAdapter(adapter);
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                TabExtcFragment.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

        return rootView;
    }

    private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener(){

        public void onItemClick(AdapterView<?> parent, View view, int pos, long id){

            Intent i = new Intent(getActivity().getBaseContext(), BookDisplayExtcActivity.class);
            i.putExtra("idbyextc", pos);
            startActivity(i);
        }
    };



}
