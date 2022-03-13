package com.example.hakim1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PusatPerbelanjaan extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listPP = new String[] {"Mall Pekanbaru", "Mall SKA", "Mall Ciputra", "Transmart"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_expandable_list_item_1,listPP));
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
            if (pilihan.equals("Mall Pekanbaru")){
            a = new Intent(this, RSAwalBross.class);


            } else if (pilihan.equals("Mall SKA")) {
            a = new Intent(this, RSEkaHospital.class);

            } else if (pilihan.equals("Mall Ciputra")) {
                a = new Intent(this, RSJiwaTampan.class);

            } else if (pilihan.equals("Transmart")) {
                a = new Intent(this, RSTabrani.class);
            }

            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
