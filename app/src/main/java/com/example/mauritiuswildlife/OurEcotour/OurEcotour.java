package com.example.mauritiuswildlife.OurEcotour;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mauritiuswildlife.Dashboard;
import com.example.mauritiuswildlife.R;
import com.example.mauritiuswildlife.OurEcotour.OurEcotour;
import com.example.mauritiuswildlife.OurEcotour.OurEcotourListAdapter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class OurEcotour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ourecotour);

        setBackButton();
        setListView();

    }

    public void setBackButton(){

        ImageView back = findViewById(R.id.our_ecotour_back);

        back.setOnClickListener(v -> {
            Intent i = new Intent(OurEcotour.this, Dashboard.class);
            startActivity(i);
        });

    }

    public void setListView(){

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);
        LinkedHashMap<String, List<String>> expandableListDetail = getData();
        List<String> expandableListTitle = new ArrayList<>(expandableListDetail.keySet());
        ExpandableListAdapter expandableListAdapter = new OurEcotourListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);

    }

    public LinkedHashMap<String, List<String>> getData() {

        LinkedHashMap<String, List<String>> OurEcotourList = new LinkedHashMap<>();

        List<String> ileAuxAigrettes = new ArrayList<>();
        ileAuxAigrettes.add(getResources().getString(R.string.ile_aux_aigrettes));

        List<String> conservationist = new ArrayList<>();
        conservationist.add(getResources().getString(R.string.conservationist_for_a_day));

        List<String> grande_montagne = new ArrayList<>();
        grande_montagne.add(getResources().getString(R.string.grande_montagne_nature_reserve));

        OurEcotourList.put("Ile Aux Aigrettes?", ileAuxAigrettes);
        OurEcotourList.put("Conservationist for a day", conservationist);
        OurEcotourList.put("Grande Montagne Nature Reserve", grande_montagne);

        return OurEcotourList;

    }

}
