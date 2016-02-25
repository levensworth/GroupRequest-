package com.bassanidevelopment.santiago.grouprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.bassanidevelopment.santiago.grouprequest.model.Form;
import com.bassanidevelopment.santiago.grouprequest.model.User;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {


    private String formKeys;
    private ArrayList<String> arrayList;
    private Firebase baseRef;
    private EditText formName;
    private Button buttonSend;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
         baseRef = new Firebase("https://mula-board-1.firebaseio.com");

        final Firebase newRef = baseRef.child("Form");
        // text to send to firebase




        // list view

        final ListView listView = (ListView) findViewById(R.id.listView);
        // initialize the arrayList
        String[] init = {"example","example","example"};
        arrayList = new ArrayList<>(Arrays.asList(init));

        // ListView adapter
        adapter = new ArrayAdapter<String>(this,R.layout.list_view_item, R.id.textItem,arrayList );
        listView.setAdapter(adapter);

        // end of list view

        newRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });




        // main layout button listener
        formName = (EditText)findViewById(R.id.editTextForm);
        buttonSend = (Button) findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = formName.getText().toString();
                ArrayList<String> user = new ArrayList<String>();
                user.add("santiago");
                Form form = new Form(name, user);
                baseRef.child("User").push().setValue(user);
                String userKeys = baseRef.getKey();

                newRef.push().setValue(form);
                formKeys = newRef.getKey();
                System.out.println(formKeys);
                Toast.makeText(MainActivity.this, "new info", Toast.LENGTH_SHORT);

                //


            }
        });


    }// end of onCreate

}// end of class
