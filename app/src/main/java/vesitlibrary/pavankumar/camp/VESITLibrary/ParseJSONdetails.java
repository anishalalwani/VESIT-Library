/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

/**
 * Created by Pavan on 19-10-2016 2016 01:54 PM 2016 01:55 PM.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ParseJSONdetails {

    static String[] names;
    static String[] date1;
    static String[] date2;

    private static final String JSON_ARRAY = "details";
    private static final String KEY_NAME = "name";
    private static final String KEY_ISS_DATE = "iss_date";
    private static final String KEY_DUE_DATE = "due_date";


    private String json;

    ParseJSONdetails(String json){
        this.json = json;
    }

    void parseJSON(){
        JSONObject jsonObject;
        try {
            jsonObject = new JSONObject(json);
            JSONArray details1 = jsonObject.getJSONArray(JSON_ARRAY);


            names = new String[details1.length()];
            date1 = new String[details1.length()];
            date2 = new String[details1.length()];

            for(int i = 0; i< details1.length(); i++){
                JSONObject jo = details1.getJSONObject(i);

                names[i] = jo.getString(KEY_NAME);

                date1[i] = jo.getString(KEY_ISS_DATE);

                date2[i] = jo.getString(KEY_DUE_DATE);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}