/*
 * Created By Pavankumar.camp.Vesit Library
 * Copyright(c) 2017
 * No Content can me modified or used without any permission
 * All Rights Reserved to VESIT LIBRARY AND DEVELOPERS
 *
 */

package vesitlibrary.pavankumar.camp.VESITLibrary;

/**
 * Created by Pavankumar Sakhare on 19-10-2016 2016 01:28 PM 2016 01:29 PM 2016 01:29 PM.
 */

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


class CustomListdetails extends ArrayAdapter<String> {

    private String[] names;
    private String[] date1;
    private String[] date2;
    private Activity context;

    CustomListdetails(Activity context, String[] names, String[] date1, String[] date2) {
        super(context, R.layout.layout_list_issued_details, names);
        this.context = context;
        this.names = names;
        this.date1 = date1;
        this.date2 = date2;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"}) View listViewItem = inflater.inflate(R.layout.layout_list_issued_details, null, true);
        TextView name = (TextView) listViewItem.findViewById(R.id.name);
        TextView date11 = (TextView) listViewItem.findViewById(R.id.date1);
        TextView date22 = (TextView) listViewItem.findViewById(R.id.date2);

        name.setText(names[position]);
        date11.setText(date1[position]);
        date22.setText(date2[position]);

        return listViewItem;
    }
}