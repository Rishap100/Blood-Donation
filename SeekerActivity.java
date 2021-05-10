package com.example.rishap.blooddonation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SeekerActivity extends AppCompatActivity {

    ListView listView;
    FirebaseDatabase database;
    DatabaseReference ref;
    ArrayList<String>list;
    ArrayAdapter<String>adapter;
    User2 user;
    EditText bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeker);

        Intent i = getIntent();

        String bloodg = i.getStringExtra("stuff");
        user = new User2();
        listView = (ListView)findViewById(R.id.listview);
        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this, R.layout.user_info, R.id.userinfo, list);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference(bloodg);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds:dataSnapshot.getChildren()){
                    user = ds.getValue(User2.class);
                    list.add("Name:           "+user.getName().toString());
                    list.add("Blood Group:    "+user.getBloodgroup().toString());
                    list.add("Phone number:   "+user.getNumber().toString());
                    list.add(" ");
                }
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
