package com.example.rishap.blooddonation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DonorActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference ref,childref;

     EditText name;
     EditText bloodgroup;
     EditText number;
     EditText address;
     Button submitbtn;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_donor);

        database = FirebaseDatabase.getInstance();
        ref = database.getReference("User");

        name = (EditText) findViewById(R.id.donorname);
        bloodgroup = (EditText) findViewById(R.id.bloodgroup);
        number = (EditText) findViewById(R.id.number);
        address = (EditText) findViewById(R.id.address);
        submitbtn = (Button) findViewById(R.id.btnInsert);
        user = new User();
    }

    private void getvalues() {
        user.setName(name.getText().toString());
        user.setBloodgroup(bloodgroup.getText().toString());
        user.setNumber(number.getText().toString());
        user.setAddress(address.getText().toString());
    }

         public void btnInsert(View view){
             ref.addValueEventListener(new ValueEventListener() {
                 @Override
                 public void onDataChange(DataSnapshot dataSnapshot) {
                     getvalues();
                     String BloodGroup = bloodgroup.getText().toString();
                     childref = database.getReference(BloodGroup);
                     childref.push().setValue(user);
                     Toast.makeText(DonorActivity.this, "Data Inserted",Toast.LENGTH_SHORT).show();
                 }

                 @Override
                 public void onCancelled(DatabaseError databaseError) {

                 }
             });
    }

    }

