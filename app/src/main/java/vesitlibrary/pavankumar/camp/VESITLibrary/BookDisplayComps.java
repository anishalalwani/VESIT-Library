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

class BookDisplayComps extends BaseAdapter {

    private String compsbk[] =
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
                    "ANALYSIS OF ALGORITHMS 2/ED & INTRODUCTION TO THE DESIGN\n by  LIVITIN",
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
                    "ARM ASSEMBLY LANGUAGE : FUNDAMENTALS & TECHNIQUES \n by   HOHL WILLIAM "


            };

    String[] compsbkid = {"24538" , "25811" , "24379" , "24199" , "26288" , "23923" , "2121" , "26289" , "990" , "7326" , "2141" , "989" ,
            "1082" , "2208" , "3235" , "3052", "1737", "1983", "3327", "66", "26290", "5864", "21281", "3677","1180","25341","1589",

            "25808" ,"24677" ,"465","25494","24077","25728","203","24444","24354","1250","1637","2816","22572","1509","24204",
            "2793","1628","24205","1239","26304","24385","26256","24207","25284","2669","2530","24445","1232","1251","1091",
            "1261","25537","165","22235","22068",
    };


    String[] compsauthid = {"10836" , "12600" , "10836" , "10894" , "13121" , "10621" , "2246" , "13122" , "1040" , "7205" , "2442" , "1040" ,
            "1134" , "1269" , "3460" , "2574", "1945", "2246", "2246", "65", "12638", "6119", "7258", "4146","1269","11838","1791",

            "12598","11445","506","12261","10753","12502","209","11200","11075","1212","1867","3101","9335","1691","10899",
            "3101","1691","10900","1207","13143","8623","13081","10902","12034","2957","1216","11202","1335","1355","1148",
            "1369","12319","171","8925","8801",

    };

    BookDisplayComps() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return compsbk.length;
    }
    @Override
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return compsbk[pos];
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
