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
public class TabComputerFragment extends Fragment {
    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    // Search EditText
    EditText inputSearch;

    public TabComputerFragment() {
        // Required empty public constructor
    }

    Toolbar toolbar;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_computer, container, false);


        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        }

        // Listview Data

        String products[] =
                {

                        ".NET 4.0 PROGRAMMING (6 IN 1)	\n by KOGENT LEARNING SOLUTION",
                        ".NET 4.5 PROGRAMMING (6 IN 1)  BLACK BOOK	\n by KOGENT LEARNING SOL",
                        ".NET FRAMEWORK 4.0 IN SIMPLE STEPS	\n by KOGENT LEARNING SOLUTION",
                        ".NET FRAMEWORK ESSENTIALS 3/ED	\n by THAI THUAN/ LAM HOANG S",
                        ".NET INTERVIEW Q&A	\n by HARWANI BM",
                        ".NET INTERVIEW QUESTIONS 2011 ED	\n by B NAGARAJU",
                        "16/32 BIT EMBEDDED PROCESSORS 	\n by  INTEL",
                        "20 RECIPES FOR PROGRAMMING PHONE GAP	\n by MUNRO JAMIE",
                        "280 ASSEMBLY LANG PROG 	 \n by LEVENTHAL L A",
                        "2-D AND 3-D IMAGE REGISTRATION	\n by GOSHTASBY A ARDESHIR",
                        "386 COMPUTER HANDBOOK 	 \n by RUTSCH EDWIN",
                        "6800 ASSEMBLY LANGUAGE PROG 	\n by  LEVENTHAL L A",
                        "6809 PROGRAMMING 	 \n by ZAKS RODNAY",
                        "8 BIT EMBEDDED CONTROLLERS 	\n by  INTEL",
                        "80386 80486 & PENTIUM PRO 	\n by  TRIBEL WALTER",
                        "80386 DX MICROPROCESSOR 	\n by  TRIEBEL WALTER A",
                        "80386 MICROPROCESSOR H B 	\n by  PAPPAS C H",
                        "80386 MP HANDBOOK 	\n by  INTEL",
                        "80386 PROG REF MANUAL 	\n by  INTEL",
                        "8051 MICROCONTROLLER 	\n by  AYALA K J",
                        "8051 MICROCONTROLLER 2 ED	\n by GHOSHAL SUBRATA",
                        "8051 MICROCONTROLLER 2/ED 	 \n by AYALA K J",
                        "8051 MICROCONTROLLER 3/ED	\n by AYALA KENNETH",
                        "8051 MICROCONTROLLERS 	\n by  MAZIDI M A",
                        "8080/8085 ASSEMBLY LANGUAGE PROG 	\n by  INTEL",
                        "8085 MICROPROCESSOR AND ITS APPLICATIONS 3/ED	\n by KANI NAGOOR A",
                        "8086 BOOK INCLUDES 8088 	\n by  RECTOR RUSSELL",

                        "ADVANCED .NET TECHNOLOGY 2/E \n by    PATEL CHIRAG ",
                        "ADVANCED COMPUTER ARCHITECTURE \n by  SIMA DEZSO/ FOUNTAIN TERENCE/ KARSUK PETER ",
                        "ADVANCED DATA WAREHOUSE \n by  IBM",
                        "ADVANCED DATABASE MANAGEMENT SYSTEM  \n by CHAKRABARTI RINI/ DASGUPTA SHILBADRA ",
                        "ADVANCED GRAPHICS PROGRAMMING USING OPEN GL \n by  MCREYNOLDS TOM/ BLYTHE DAVID ",
                        "ADVANCED JAVA FOR STUDENTS \n by  MEHTA ASHWIN DR/ SHAH SARIKA ",
                        "ADVANCED MICROPROCESSOR & INTERFACING \n by   RAM BADRI ",
                        "AJAX AND PHP  \n by   DARIE CRISTIAN/ BUCICA MIHAI ",
                        "AJAX BLACK BOOK \n by  KOGENT SOLUTION INC ",
                        "ALGOL PROGRAMMING  \n by  GROVER P S ",
                        "ALGORITHMS & DATA STRUCTURES  \n by   WIRTH NIKLAUS ",
                        "ALGORITHMS 2/ED  \n by    SEDGEWICK R ",
                        "ALGORITHMS FOR APPLICATIONS \n by  SHARMA UTPAL/ BHATTECHARYYA D K ",
                        "ALGORITHMS FUNDAMENTALS   \n by   KNUTH D E ",
                        "ALGORITHMS IN A NUTSHELL  \n by   HEINEMAN GEORGE T ",
                        "ALGORITHMS IN C++ \n by   SEDGEWICK R ",
                        "ALGORITHMS VOL1   \n by   KNUTH D E ",
                        "ALICE 3 COOKBOOK  \n by   OLSEN VANESA S ",
                        "ANALOG COMPUTATION & SIMULATION  \n by    RAJARAMAN V ",
                        "ANALYSING COMPUTER SECURITY \n by  PEFLEEGER CHARLES P/ PFLEEGER S L",
                        "ANALYSIS OF ALGORITHMS 2/ED & INTRODUCTION TO THE DESIGN \n by  LIVITIN",
                        "ANDRIOD IN ACTION 3/ED \n by  ABLESON W FRANK/ SEN ROBI/ KING CHRIS ",
                        "ANDRIOD USER INTERFACE DEVELOPMENT \n by  MORRIS JASON ",
                        "ANDRIOD: WIRELESS APPLICATION DEVELOPMENT 2/ED \n by  DARCEY LAUREN/ CONDER SHANE ",
                        "ANIMATION TECHNIQUES IN WIN 32   \n by    THOMPSON N ",
                        "ANSI C 2/ED   \n by   BALAGURUSAMY E ",
                        "APACHE 2 PACKET REFERENCE \n by   FORD ANDREW ",
                        "APL /INTERACTIVE APPROACH3 /ED   \n by    GILMAN LEONARD ",
                        "APL PROGRAMMING  \n by    KATZAN HARRY ",
                        "APPLE CONNECTION   \n by  COFFRON J W ",
                        "APPLE SOFT BASIC FROM THE GROUNDUP  \n by     MULLISH HENRY ",
                        "APPLIED CRYPTOGRAPHY 2/ED  \n by  SCHNEIER BRUICE ",
                        "APPLYING THE UML  \n by   ALHIR SINAN SI ",
                        "ARM ASSEMBLY LANGUAGE : FUNDAMENTALS & TECHNIQUES \n by   HOHL WILLIAM ",

                };

        String prodcut1 [] ={

                "1",
                "2","3",
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
                TabComputerFragment.this.adapter.getFilter().filter(cs);
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

            Intent i = new Intent(getActivity().getBaseContext(), BookDisplayCompsActivity.class);
            i.putExtra("idbycomps", pos);
            startActivity(i);
        }
    };




}
