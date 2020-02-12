package com.naufal.ar.rafizi.timer.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.naufal.ar.rafizi.timer.R;
import com.naufal.ar.rafizi.timer.adapter.AdapterList;
import com.naufal.ar.rafizi.timer.data.ListData;
import com.naufal.ar.rafizi.timer.data.ModelList;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    RecyclerView rvListHero;
    private ArrayList<ModelList>modelLists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rvListHero = findViewById(R.id.list);
        rvListHero.setHasFixedSize(true);
        modelLists.addAll(ListData.getData());
        showList();
    }

    private void showList() {
        rvListHero.setLayoutManager(new LinearLayoutManager(this));
        AdapterList adapterList = new AdapterList(modelLists);
        rvListHero.setAdapter(adapterList);
    }
}
