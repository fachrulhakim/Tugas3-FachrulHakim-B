package com.example.hakim1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sekolah extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listS = new String[] {"SMK 1", "SMK 2", "SMK 3", "SMK 4"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_expandable_list_item_1,listS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("SMK 1")){
            a = new Intent(this, RSAwalBross.class);


            } else if (pilihan.equals("SMK 2")) {
            a = new Intent(this, RSEkaHospital.class);

            } else if (pilihan.equals("SMK 3")) {
                a = new Intent(this, RSJiwaTampan.class);

            } else if (pilihan.equals("SMK 4")) {
                a = new Intent(this, RSTabrani.class);
            }

            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
