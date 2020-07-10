package com.example.android.covidhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class DisplayActivity extends AppCompatActivity {

    private RecyclerView resultList;

    private FirebaseFirestore mfirestore;
    private Query mquery;

    private ResultAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
//        resultList=(RecyclerView)findViewById(R.id.resultlist);
//
//        mfirestore=FirebaseFirestore.getInstance();
//
//        mquery=mfirestore.collection("Devices");
//
//        mAdapter=new ResultAdapter(mquery);
//
//        resultList.setLayoutManager(new LinearLayoutManager(this));
//        resultList.setAdapter(mAdapter);

    }
}
