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

class BookDisplayInstru extends BaseAdapter {

    private String[] instrubk = {
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
            "AUTOMATION SYS FOR DATA ACQUISITION \n by AMY L T",
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
            "CONTROL OF UNSTABLE SYSTEMS \n by SREE PADMA",
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
            "FEEDBACK CONTROL SYSTEM \n by D'AZZO J J"};
    String[] instrubkid={"3122","660","3620","2618","195","677","3016","1758","1757","2614","23245","21172","23103","1306","3894","26133","1707","2180","3715","24","3717","26307","26273","3648","3628","486","482","22820","3541","1924","2486","3247","21991","1985","1901","1901","44","2109","79","533","2336","2440","3043","1809","1831","1989","1833","3249","126","335","2213","2498","541","2367","259","259","259","259","259","259","2390","3834","26207","3721","29","2223","20923","2993","3518","3708","1328","2230","1763","1802","3114","3144","563","2972","104","3142","1789","1789","238","2094","2094","2094","2094","2094","2094","2094","2094","1305","21160","26067","3160","2477","2179","3709","703","2586","3085","2837","408","454","3126","2891","3143","21981","1515","898","1773","740","740","22935","1863","25036","21648","21118","1473","1498","1078","1078"};
    String[] instruauthid={"3218","672","4071","4167","199","687","44","1965","1963","1964","9959","7860","9827","1434","4341","12949","1177","2481","4175","21","4177","13148","13107","4107","4081","529","522","9573","3952","1519","2748","190","8687","2249","2131","2320","44","2399","77","573","2595","2696","3405","2020","2044","2020","2045","3626","129","361","2511","2759","5993","2634","1856","1447","2522","3217","13071","11162","1856","4271","13027","4180","26","2526","8020","3335","596","4168","1468","2534","1934","2011","3483","3514","596","3309","107","3511","1993","2434","12193","2379","2962","3595","3715","8666","9134","11641","12148","1433","557","4168","3145","2739","12348","4169","706","929","3445","1460","448","497","2501","3218","3512","6702","1699","919","1980","968","741","843","936","9488","8361","7272","7592","1675","1135","1469"};

    BookDisplayInstru() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return instrubk.length;
    }
    @Override
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return instrubk[pos];
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
