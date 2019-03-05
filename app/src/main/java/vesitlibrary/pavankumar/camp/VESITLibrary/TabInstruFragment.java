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
public class TabInstruFragment extends Fragment {
    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    // Search EditText
    EditText inputSearch;

    public TabInstruFragment() {
        // Required empty public constructor
    }
    Toolbar toolbar;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_instru, container, false);

        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        }
        // Listview Data
        String products[] =
                {
                        "ANA & DIG CONTROL SYS \n by CHEN C T",
                        "ANALOG ELECTRONICS CKTS TO BIOMEDICAL INST \n by NORTHROP R B",
                        "ANALYTIC FEEDBACK SYSTEM DESIGN \n by DOROTO PETER",
                        "ANALYTICAL INSTRUMENTATION \n by SHERMAN R E(ED)",
                        "ANALYTICAL INSTRUMENTATION HANDBOOK \n by EWING GALEN WOOD",
                        "ANALYTICAL INSTRUMENTATION HB 3/ED \n by CAZES JACK(ED)",
                        "ANALYTICAL INSTRUMENTS \n by KHANDPUR R S",
                        "APP INSTR / PROCESS INDUS.VOL/ 4 \n by ZOSS LESLIE M",
                        "APPL.INSTR./ PROCESS INDUS.VOL/3 \n by ANDREW W G",
                        "APPLIED INSTRU IN  PROC INDUS V/2 \n by ANDREW W G",
                        "APPLIED NONLINEAR CONTROL (E-BOOK) \n by SLOTLINE JEAN JACQUES",
                        "APPLIED TECHNOLOGY AND INSTRUMENTATION FOR PROCESS CONTROL \n by DESA DOUGLAS O J",
                        "AUTOMATED CONTINUOUS PROCESS CONTROL \n by SMITH C A",
                        "AUTOMATIC CONTROL ENGG 3/ED \n by RAVEN F H",
                        "AUTOMATIC CONTROL SYS 7/ED \n by KUO B C",
                        "AUTOMATIC CONTROL SYSTEMS: BASIC ANALYSIS AND DESIGN \n by WOLOVICH WILLIAM A",
                        "AUTOMATIC PROCESS CONTROL \n by ECKMAN D P",
                        "AUTOMATIC PROCESS CONTROL DYN. ANA. \n by MOORE R L",
                        "AUTOMATION & CONTROL CURRENT TRENDS \n by WEYGANDT STEVEN (ED)",
                        "AUTOMATION SYS FOR CONTROL & DATA ACQUAS \n by AMY L T",
                        "BATCH CONTROL \n by NISEN FIELD A E",
                        "BAYESIAN REASONING AND MACHINE LEARNING \n by BARBER DAVID",
                        "BAYESIAN REASONING IN DATA ANALYSIS \n by AGOSTINI GIULIO",
                        "BIOINFORMATICS \n by ATTWOOD T K",
                        "BIOINFORMATICS COMPUTER SKILLS \n by GIBAS CNTHIA",
                        "BIOINFORMATICS COMPUTING \n by BERGERON B",
                        "BIOINFORMATICS METHODS & APPLICATIONS \n by RASTOGI-RASTOGI",
                        "BIOMEDICAL D S P \n by TOMPKINS W J",
                        "BIOMEDICAL ENGG \n by ENDERLE JOHN",
                        "BIOMEDICAL ENGG  ENCY \n by GRAF R F",

                        "BIOMEDICAL ENGG ADVANCES \n by REDDY D C",

                        "BIOMEDICAL EQUIPMENT TEC \n by CARR J J",
                        "BIOMEDICAL INFORMATICS \n by SHORTLIFFE EDWARD H",

                        "BIOMEDICAL INSTRUMENTATION \n by ASTON RICHARD",
                        "BIOMEDICAL INSTRUMENTATION \n by  KHANDPUR R S",
                        "BIOMEDICAL INSTRUMENTATION \n by CROMWELL L",
                        "BIO-MEDICAL INSTRUMENTATION 2/ED \n by KHANDPUR R S",

                        "BIOMEDICAL INSTRUMENTS \n by WELKOWITZ WALTER",
                        "BIOMEDICAL SIGNAL PROCESSING \n by RANGAYYAN R M",
                        "BIO-MEDICAL SIGNAL PROCESSING \n by REDDY D C",

                        "CHEMICAL ENGG HB PERRY \n by PERRY R H",

                        "CHEMICAL ENGINEERING \n by BADGER",
                        "CHEMICAL INSTRUMENTATION \n by BENDER G T",
                        "CHEMICAL PROCESS CONTROL \n by STEPHANOPOLOS G",
                        "CHEMICAL PROCESS INDUSTRIES 5/ED \n by AUSTIN G T",
                        "CHEMICAL PROCESSOR CONTROL \n by STEPHANOPOLOS G",
                        "CHEMICAL TECHNOLOGY/DRYDENS \n by RAO GOPALA",


                        "CNC MACHINES \n by PABLA B S",


                        "COMPUTER AIDED PROCESS CONTROL \n by SINGH S K",
                        "COMPUTER CONTROL OF PROCESSES \n by CHIDAMBRAM M",
                        "COMPUTER SYSTEM PERFORMANCE \n by KANT KRISHNA",
                        "COMPUTING AND INTELLIGENT SYSTEMS \n by KEERTHI S S",

                        "CONTROL DES WITH MATLAB & SIMULINK \n by ASHISH",

                        "CONTROL ENGG ELECTRONIC \n by FRIEDRICH FROHR",
                        "CONTROL ENGINEERING \n by OGATA KATSUHIKO.",
                        "CONTROL ENGINEERING \n by RAO A S",
                        "CONTROL ENGINEERING \n by MORRIS N M",
                        "CONTROL ENGINEERING \n by BELANGER P R",
                        "CONTROL ENGINEERING \n by WILKIE JACQUELINE",
                        "CONTROL ENGINEERING \n by KUTIAN APPUU KK",
                        "CONTROL ENGINEERING 2/ED \n by OGATA KATSUHIKO.",

                        "CONTROL ENGINEERING 4/ED \n by OGATA K",
                        "CONTROL ENGINEERING: THEORY & PRACTICE \n by BANDOPADHYAY M N",
                        "CONTROL HAND BOOK \n by LEVINE W S",
                        "CONTROL OF BOILERS \n by DUKELOW S G",
                        "CONTROL OF ELECTRICAL DRIVES \n by LEONHARD W",
                        "DATA STRUCTURE USING C \n by SREE PADMA",
                        "CONTROL SYS DES/MATLAB \n by SHAHIAN B",
                        "CONTROL SYS DESIGN 2/ED \n by ELLIS GEORGE",
                        "CONTROL SYS DOCUMENTATION \n by MULLEY RAYMOND",
                        "CONTROL SYSTEM \n by GUPTA S D",
                        "CONTROL SYSTEM  AUTOMATIC \n by THALER G J",
                        "CONTROL SYSTEM  DESIGN \n by D'SOUZA A F",
                        "CONTROL SYSTEM COMPONENTS \n by GIBSON J E",
                        "CONTROL SYSTEM DES \n by SARKER B",
                        "CONTROL SYSTEM DES & SIMU \n by GOLTEN JACK",
                        "CONTROL SYSTEM DES GUIDE 3/ED \n by ELLIS GEORGE",
                        "CONTROL SYSTEM DES/ADV \n by FRIEDLAND B",
                        "CONTROL SYSTEM DESIGN \n by GOODWIN G C",
                        "CONTROL SYSTEM ENG \n by PALM W J",

                        "CONTROL SYSTEM TECH \n by CHESMOND C J",
                        "CONTROL SYSTEM TECH \n by BATESON A W",

                        "CONTROL SYSTEM THEORY \n by LYSHEVSKI SERGEY E",
                        "CONTROL SYSTEMS \n by PADMANABHAN K",
                        "CONTROL SYSTEMS \n by SINHA N K",
                        "CONTROL SYSTEMS \n by XAVIER S P",
                        "CONTROL SYSTEMS \n by GOYAL S C",
                        "CONTROL SYSTEMS \n by KUMAR ASHOK",
                        "CONTROL SYSTEMS \n by KUMARAWADU SISIL",
                        "CONTROL SYSTEMS \n by JAIRATH ANOOP K",
                        "CONTROL SYSTEMS \n by MANIK DHANESH M",

                        "CONTROL SYSTEMS 3/ED \n by DORF R C",
                        "CONTROL SYSTEMS 8/ED \n by DORF R C",

                        "CONTROL SYSTEMS DOCUMENTATION APPLYING SYMBOLS AND IDENTIFICATION \n by MULLEY RAYMOND",

                        "CONTROL SYSTEMS ENGG \n by GAJIC Z",
                        "CONTROL SYSTEMS ENGG & DESIGN \n by THOMPSON S",

                        "CONTROL VALVE SIZING \n by DRISKELL LES",
                        "CONTROL VALVES \n by BORDES GUY",

                        "DATA ACQUISITION & SIGNAL PROCESSING \n by KIRINAKI N Y",

                        "DESIGNING WITH MICROCONTROLLERS \n by PEATMAN J B",

                        "DIGITAL CONTROL DYN SYS \n by FRANKLIN G F",
                        "DIGITAL CONTROL ENGG \n by GOPAL M",

                        "DIGITAL CONTROL OF DYNAMIC SYS \n by FRANKLIN GENE F",
                        "DIGITAL CONTROL OF DYNAMIC SYSTEMS \n by FRANKLIN G P",
                        "DIGITAL CONTROL SYS 2/ED \n by KUO B C",
                        "DIGITAL CONTROL SYS DES \n by CHEN C T",
                        "DIGITAL CONTROL SYS DES 2/ED \n by SANTINA M S",


                        "ELECTRICAL & ELECTRONIC MEAS & INST 11/ED \n by SAWHENY A K",
                        "ELECTRICAL DRIVES 2/ED \n by PILLAI S K",
                        "ELECTRICAL MEASUREMENTS \n by GUPTA J B",
                        "ELECTRICAL TRANSDUCERS \n by MANSFIELD P H",

                        "ELECTRONIC INSTRUMENTATION \n by COOPER W D",
                        "ELECTRONIC INSTRUMENTATION \n by KALSI H S",
                        "ELECTRONIC INSTRUMENTS & INSTRUMENTATION TECHNOLOGY \n by ANAND M M S",
                        "ELECTRONIC WEIGHING SYSTEM \n by RANGAN C S",
                        "ENCYLOPEDIA OF ANALYTICAL CHEMISTRY: APP THOERY & INSTRUMENTS (S1) \n by MEYERS R A",
                        "ENGINEERING METROLOGY 20/ED \n by JAIN R K",
                        "FAST TRACK TO ROBOTICS 4/ED \n by MANJUNATH T C",

                        "FEED BACK CONTROL \n by ATKINSON P",
                        "FEEDBACK & CONTROL SYS \n by DISTEFANO J J",
                        "FEEDBACK CONTROL SYSTEM \n by D'AZZO JOHN",
                        "FEEDBACK CONTROL SYSTEM \n by D'AZZO J J",
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
                TabInstruFragment.this.adapter.getFilter().filter(cs);
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

            Intent i = new Intent(getActivity().getBaseContext(), BookDisplayInstruActivity.class);
            i.putExtra("idbyinstru", pos);
            startActivity(i);
        }
    };


}
