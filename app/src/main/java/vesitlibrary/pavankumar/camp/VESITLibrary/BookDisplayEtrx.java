/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class BookDisplayEtrx extends BaseAdapter {

    private String[] etrxbk = {"INTRODUCTION TO ENGINEERING PROG by \n HOLLOWAY JAMES PAUL",
            "ADAPTIVE WCDMA by \n GLISIC S G",
            "ADVANCED ELECTRONIC COMM  6/ED by \n TOMASI WAYNE",
            "DIGITAL IMAGE PROCESSING 3/ED by \n PRATT WILLIAM K",
            "DIGITAL SIGNAL PROCESSING by \n CRISTI ROBERTO",
            "DIGITAL SIGNAL PROCESSING by \n CAVICCHI T J",
            "DIGITAL SIGNAL PROCESSING by \n VENKATRAMANI B",
            "DIGITAL SIGNAL PROCESSING FUN by \n LUDEMAN L C",
            "ELECTRIC CIRCUITS 2/ED. by \n ALEXANDER",
            "ELECTRONIC IMAGE PROCESSING by \n WEEKS A R",
            "FIBER OPTICS COMMUNICATION by \n MYNBAEV DJAFOR",
            "HDL CHIP DESIGN by \n SMITH D J",
            "MICROWAVE CIRCUIT DESIGN & ANA by \n LIAO SAMUEL",
            "MOBILE COMMUNICATION SYSTEMS by \n WESLOWSKI K",
            "MOBILE COMPUTING 2/ED by \n HANSMANN V",
            "MULTIANTENNA TRANSRECEIVERS TECH by \n HOTTINEN ARI",
            "OPTICAL COMMUNICATION NETWORK by \n ILYAS M",
            "OPTICAL FIBER COMMUNICATIONS by \n GUPTA S C",
            "OPTICAL NETWORKS 2/ED by \n RAMASWAMI R",
            "ORTHOGONAL TRANSFORMS FOR D S P by \n RAO K K",
            "RADAR PRINCIPLES by \n PEEBLES PZ",
            "RF & MICROWAVESEMICONDUCTOR DEV by \n GOLIO  NIKO",
            "RF SYSTEM DES PRACTICAL by \n EGAN W F",
            "SINGLE & MULTICARRIER DS-CDMA by \n HANZO L",
            "TELECOMMUNICATION MANAGEMENT by \n CARR H",
            "TELECOMMUNICATION NETWORKS by \n SCHWARTZ M",
            "VLSI DESIGN INTRODUCTION by \n FABRICIUS EUGENE D",
            "WIRELESS LOCAL LOOPS by \n STARROULAKIS P",
            "WIRELESS NETWORKS by \n NICOPOLITIDIS P",
            "WIRELESS NETWORKS by \n PAHLAVAN KAVEH",
            "WIRELESS NETWORKS by \n NICOPOLIDIS P",
            "WIRELESS NETWORKS & MOBILE COMPUTING by \n STOJMENOVIC I",
            "24 SILICON CONTROLLED RECTIFIER PROJECT by \n TRAISTER ROBERT J",
            "25 SOLID STATE PROJECTS by \n GRAF R F",
            "2672 CODE OF PRACTICE FOR LIBRARY LIGHTING by \n BUREAU OF INDIAN STANDARDS",
            "2-D ELECTROMAGNETIC SIMULATION by \n JIMENEZ ALEJANDRA",
            "3 RD GENERATION SYSTEMS & INTELLIGENT WN by \n BLOUGH J S",
            "41 PROJECTS USING 741 IC by \n SHARMA M C",
            "51 PROJECTS USING CD 4011 by \n SHARMA M C",
            "802.11 WIRELESS NETWORKS 2/e by \n GAST MATTHEW",
            "802.11 WIRELESS NETWORKS 2/ED by \n GAST MATHEW S",
            "8051 MICROCONTROLLER by \n UDAYASHANKARA V",
            "8051 MICROCONTROLLER by \n MALLIKARJUNASWAMY M",
            "8051 MICROCONTROLLER :AN APPLICATION BASED INTRODUCTION by \n CALCUTT DAVID",
            "8051 MICROCONTROLLER :AN APPLICATION BASED INTRODUCTION by \n COWAN FRED",
            "8051 MICROCONTROLLER :AN APPLICATION BASED INTRODUCTION by \n PARCHIZADEH HASSAN",
            "8086 MICROPROCESSOR AND ITS APPLICATIONS by \n KANI A NAGOOR",
            "AD DIGITAL SIGNAL PROCESSING by \n VASEGHI",
            "ADAPTIVE WCDMA THEORY & PRACTICE by \n GLISIC S G",
            "ADAPTIVE FILTER THEORY by \n HAYKIN SIMON",
            "ADAPTIVE FILTER THEORY 4/ED by \n HAYKIN SIMON",

            "ADAPTIVE SIGNAL PROCESSING by \n WIDROW B",
            "ADAPTIVE SIGNAL PROCESSING by \n WIDROW BERNARD",
            "ADAPTIVE SIGNAL PROCESSING by \n BENESTY J",
            "ADAPTIVE SIGNAL PROCESSING:NEXT GENERATION SOLUTIONS by \n ADALI TULAY",
            "ADAPTIVE WIRELESS TRANSCEIVERS by \n HANZO L W",

            "ADVANCED ASIC CHIP SYNTHESIS by \n BHATNAGAR HIMANSHU",
            "ADVANCED DIGITAL COMMUNICATION SYSTEMS by \n NIIT",

            "ADVANCED DIGITAL SIGNAL PROCESSING by \n ZELNIKAR GLEHN",
            "ADVANCED ELECTRONIC COMMUNICATION SYSTEMS by \n TOMASI WAYNE",
            "ADVANCED SWITCHED NETWORKS by \n NIIT",

            "ALGO/STATISTICAL SIGNAL PROCESSING by \n PROAKIS J J",
            "ALGORITHMS FOR VLSI DESIGN AUTOMATION by \n GEREZ SABIH H",
            "AN ENGINEERING APPROACH TO DIGITAL DESIGN by \n FLETCHER WILLIAM I",

            "AN INTRODUCTION TO LASERS: THEORY & APPLICATION by \n AVADHANULU",
            "AN INTRODUCTION TO LASERS: THEORY & APPLICATION BY \n HEMNE P S",
            "AN INTRODUCTION TO SIGNALS & SYSTEMS by \n STULLER JOHN ALAN",
            "ANALOG & DIGITAL SIGNAL PROCESSING by \n AMBARDAR ASHOK",
            "ANALOG AND DIGITAL COMMUNICATION 3/ED by \n HSU HWEI",
            "ANALOG ELECTRONICS by \n MAHESHWARI L.K.",

            "ANALOG INTEGRATED CIRCUIT by \n SOCLOF SIDNEY",
            "ANALOG SIGNAL PROCESSING by \n PALAS ARENY",
            "ANALOG/INTERFACE ICS DB 1 by \n MOTOROLA",
            "ANALOG/INTERFACE ICS DB 2 by \n MOTOROLA"
    };
    String[] etrxbkid = {"25589" , "277" ,
            "274" ,
            "338" ,
            "90" , "90" , "90" , "306" ,
            "346" ,
            "250" , "208" , "239" , "217" ,
            "275" ,
            "244" , "278" , "282" , "247" ,"242" ,  "283" ,
            "246" , "281" , "249" , "280" , "251" ,
            "256" , "336" , "279" ,
            "257" , "257" , "257" ,  "276" , "24874" ,
            "1364" , "21188" , "22411" , "651" , "24875" , "24876" ,


            "25885" , "24441" , "66" , "66" , "22017" , "22017" ,  "22017" , "26142" ,

            "6292" , "20803" ,
            "289" ,
            "24119"  ,
            "26" , "26" , "26" , "25776" , "171"  , "21967" , "25620"  , "152" , "25522" , "492" ,
            "3745" , "23840" ,
            "21838"   , "23498" ,"23498" , "22042" , "20806" , "25191" ,
            "658"  ,
            "2927" , "76" ,

            "2890" , "2889"};






    String[] etrxauthid={"12356" , "283" , "280" , "368" ,  "252" , "264" , "354" , "168" ,
            "377" ,
            "255" , "214" , "244" , "221" , "281" ,
            "249" , "284" , "287" , "475" , "247" , "288" ,
            "251" , "286" , "175" , "145" , "256" ,
            "261" , "7949" , "285" , "263" , "5948" , "7934" , "282" , "11632" ,
            "1519" , "7873" , "9144" , "666" , "11625" , "11625" ,


            "12683" , "11197" , "8708" , "13077" , "8721" , "8722" , "8723" , "11851" ,

            "6472" , "283" ,
            "55" , "55"  ,
            "4048" , "23" , "12140" , "12559" , "176"  , "8661" , "482" , "144" , "155" , "280" , "482"  , "10547" ,
            "8530"   , "10223" , "10224" , "8769" , "7321" , "11919" ,
            "670"  ,
            "7423" , "74" ,

            "2185" , "2185" };


    BookDisplayEtrx() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return etrxbk.length;
    }
    @Override
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return etrxbkid[pos];
    }
    @Override
    public long getItemId(int pos) {
        // TODO Auto-generated method stub
        return pos;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
