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

class BookDisplayIt extends BaseAdapter {

    private String[] itbk = { "ADVANCED MICROPROCESSORS 2/ED \n by TABAK  DANIEL.",
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
    String[] itbkid={"25194","266","214","318","38","219","343","222","264","313","207","80","22993","260","265","228","210","258","220","67","23928","23928","223","326","329","304","708","312","311","227","226","229","212","3235","23383","1737","66","21281","3677","25341","1630","1625","70","21018","3282","2434","2530","3637","165","22067","22067","22016","245","3281","3278","31","465","2191","203","2583","1250","477"};
    String[] itauthid={"7834","274","215","341","266","223","374","227","272","385","213","383","9717","268","273","112","216","265","224","225","208","207","228","352","355","7929","7932","334","7441","231","230","233","218","3460","10094","1945","65","7258","4146","11838","7561","1805","68","7699","3601","4072","195","4093","171","8798","8799","8720","3886","3604","3653","28","506","2663","209","2186","1212","516"};

    BookDisplayIt() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return itbk.length;
    }
    @Override
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return itbkid[pos];
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
