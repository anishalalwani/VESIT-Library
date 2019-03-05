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
public class TabItFragment extends Fragment {
    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    // Search EditText
    EditText inputSearch;

    public TabItFragment() {
        // Required empty public constructor
    }

    Toolbar toolbar;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_it, container, false);


        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        }

        // Listview Data
        String products[] =
                {      "ADVANCED MICROPROCESSORS 2/ED \n by TABAK  DANIEL.",
                        "ART OF UNIX PROGRAMMING \n by RAYMOND R S",


                        "ASP FOR WEB PROFESSIONAL \n by LOVEJOY ELIJAH",
                        "C++ COMPLETE REFERENCE  4/ED \n by SCHILDT HERBERT",
                        "COMPUTER NETWORKING \n by MANSFIELD K C",
                        "COMPUTER SYSTEM ORGANIZATION & ARCH \n by CARPINELL JOHN D",
                        "DATA COMPRESSION 2/ED \n by SALOMAN DAVID",
                        "DATA STRUCTURE & ALGORITHM ANA IN C \n by WEISS MARK ALLEN",



                        "DATABASE SYSTEMS 4/ED \n by NAVATHE E",
                        "EMBEDDED C PROGRAMMING & ATMEL AVR. \n by BARNETT RICHARD",
                        "EMBEDDED SOFTWARE PRIMER \n by SIMON DAVID E",
                        "EMBEDDED SYSTEM DESIGN \n by VAHID FRANK",
                        "EMBEDDED SYSTEMS FUNDA \n by LEWIS  DANIEL W",
                        "ESSENTIAL XML \n by BOX DON",
                        "HUMAN COMPUTER INTERACTION 3/ED \n by DIX ALAN",
                        "INFORMATION SYSTEMS ANA & DES \n by RAJARAMAN V",

                        "JAVA SERVLET PROGRAMMING \n by HUNTER JASON",





                        "MICROPROCESSOR BASED DESIGN \n by SLATER MICHAEL",
                        "O O ANALYSIS & DESIGN \n by HAIGH ANDREW",


                        "OPERATING SYSTEMS \n by NUTT GARY",
                        "OPERATING SYSTEMS 2/ED \n by MILENKOVIC M",
                        "OPERATING SYSTEMS 2/ED \n by DEITEL H M",
                        "OPERATING SYSTEMS CONCEPTS 6/ED \n by SILBERSCHATZ A",
                        "OPTIMIZATION CONCEPTS & APP \n by BELEGUNDU ASHOK D",
                        "OPTIMIZATION FOR ENGG. DESIGN \n by DEB KALYANMOY",



                        "PROLOG: PROGRAMMING FOR A.J. 3/ED \n by BRATKO IVAN",
                        "SOFTWARE ENGINEERING \n by PETERS J F",

                        "SOFTWARE ENGINEERING FUNDAMENTALS \n by BEHFOROOZ ALI",
                        "SOFTWARE ENGINEERING FUNDAMENTALS 2/ED \n by MALL RAJIB",
                        "SYSTEM ANA & DESIGN 4/ED \n by HAWRYSZKIEWYCZ I T",
                        "SYSTEM ANALYSIS & DES 2/ED \n by AWAD E M",
                        "SYSTEM ANALYSIS & DESIGN 6/ED \n by WHITTEN J L",
                        "WEB TECHNOLOGY \n by GODBOLE A S",





                        "80386 80486 & PENTIUM PRO \n by TRIBEL W A",
                        "80386 DX MICROPROCESSOR \n by TRIEBEL WALTER A",
                        "80386 MICROPROCESSOR H B \n by PAPPAS C H",
                        "8051 MICROCONTROLLER \n by AYALA K J",

                        "8051 MICROCONTROLLER 3/ED \n by AYALA KENNETH",
                        "8051 MICROCONTROLLERS \n by MAZIDI M A",





                        "8085 MICROPROCESSOR AND ITS APPLICATIONS 3/ED \n by KANI NAGOOR A",






























                        "8086/8088  PROG IBM PC \n by THORNE MICHAEL",
                        "8088 ASSEMBLER LANGUAGE PROG \n by WILLEN D C",
                        "A S P 3.0 IN 21/DAYS \n by MITCHELL SCOTT",
                        "ACTIONSCRIPT 2.0 \n by MOOCK COLIN",

                        "ACTIVE  SERVER PAGES \n by WALTHER S",







                        "ANSI C \n by BRONSON G J",
                        "ANSI C 2/ED \n by BALAGURUSAMY E",
                        "ANSI C PROGRAMMING  2/ED \n by KERNIGHAN B W",
                        "APPLYING THE UML \n by  ALHIR SINAN SI",
                        "ARM SYSTEM DEVELOPERS GUIDE \n by SLOSS ANDREW N",
                        "ARM SYSTEM DEVELOPERS GUIDE \n by SYMES DOMINIC",
                        "ARM SYSTEM-ON-CHIP ARCHITECTURE \n by FURBER STEVE",
                        "ARTIFICIAL INTELLIGENCE \n by NILSSON N J",




                        "ACTIVE SERVER PAGES 2.0 \n by HETTIHEWA S",
                        "ACTIVE X PROG /21 DAYS \n by KAUFMAN S",
                        "ADV MICROPROCESSORS & PERIPHERALS \n by RAY A K",
                        "ADVANCED DATA WAREHOUSE \n by IBM",
                        "ADVANCED DOS \n by GANDHI MEETA",
                        "ADVANCED MICROPROCESSOR & INTERFACING \n by RAM BADRI",
                        "AI AND EXPERT SYSTEM \n by LEVINE R L",
                        "ALGOL PROGRAMMING \n by GROVER P S",
                        "ALGORITHAM FUNDAMENTALS \n by BRASSARD GILLES",

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
                TabItFragment.this.adapter.getFilter().filter(cs);
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

            Intent i = new Intent(getActivity().getBaseContext(), BookDisplayItActivity.class);
            i.putExtra("idbyit", pos);
            startActivity(i);
        }
    };


}
