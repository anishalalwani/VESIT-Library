/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

/**
 * Created by Pavan on 10-01-2017 2017 09:58 PM.
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class BookDisplayExtc extends BaseAdapter {

    private String[] extcbk = { "DIGITAL IMAGE PROCESSING 3/ED by \n PRATT WILLIAM K",
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
            "COMMUNICATION SYS UNSING MATLAB by \n PROAKIS J G"};
    String[] extcbkid={"338" , "337" , "90" , "90" , "90" , "306" , "327" , "305" , "346" , "298" , "208" , "309" , "284" , "292" , "336" , "257" , "257"  , "22017" , "22017" , "22017" , "22006" , "22006"  , "26" , "26" , "26" , "25587" , "21967" , "152" ,"152"  , "22042"  , "22910"  , "3023" , "1197" , "1197"  , "1662" , "1662"  , "3509"  , "22170" , "25301" , "184" , "473" , "3827" , "4891" ,"6541"  , "3496" , "3846" , "64" ,  "6289" , "374", "3501" , "118","3905"};
    String[] extcauthid={"368" , "7950" , "264" , "373" ,"355" , "168" , "408" , "7708" , "377" , "7907" , "214" , "7933" , "288" , "295" , "7949" , "5948" , "263"  , "8721" , "8722" , "8723" , "8708" , "8709"  ,"23" ,"12140" ,"12141" ,"280" , "8661" ,"154" ,"155"  ,"8769"  ,"9653"  ,"7396" ,"8767" ,"8768","7530" ,"5088" ,"3911" ,"8484" ,"12051" ,"188" ,"512" ,"4266" ,"5191", "6662" , "3897" ,"4281"  ,"64" ,"6468","420" ,"3904","121","262"};

    public BookDisplayExtc() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return extcbk.length;
    }
    @Override
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return extcbkid[pos];
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
