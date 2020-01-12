package com.example.mauritiuswildlife.WhoAreWe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import com.example.mauritiuswildlife.Dashboard;
import com.example.mauritiuswildlife.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class WhoAreWe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whoarewe);

        setBackButton();
        setListView();

    }

    public void setBackButton(){

        ImageView back = findViewById(R.id.who_are_we_back);

        back.setOnClickListener(v -> {
            Intent i = new Intent(WhoAreWe.this, Dashboard.class);
            startActivity(i);
        });

    }

    public void setListView(){

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);
        LinkedHashMap<String, List<String>> expandableListDetail = getData();
        List<String> expandableListTitle = new ArrayList<>(expandableListDetail.keySet());
        ExpandableListAdapter expandableListAdapter = new WhoAreWeListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);

    }

    public LinkedHashMap<String, List<String>> getData() {

        LinkedHashMap<String, List<String>> whoAreWeList = new LinkedHashMap<>();

        List<String> whatWeDo = new ArrayList<>();
        whatWeDo.add(getResources().getString(R.string.what_we_do));

        List<String> whatIsOurMission = new ArrayList<>();
        whatIsOurMission.add(getResources().getString(R.string.what_is_our_mission));

        List<String> contactUs = new ArrayList<>();
        contactUs.add(getResources().getString(R.string.contact_us_mauritius));
        contactUs.add(getResources().getString(R.string.contact_us_rodrigues));

        whoAreWeList.put("What We Do?", whatWeDo);
        whoAreWeList.put("What is our Mission?", whatIsOurMission);
        whoAreWeList.put("Contact Us", contactUs);

        return whoAreWeList;

    }

}
