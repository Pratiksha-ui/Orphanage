package com.example.fooddonate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    TextInputLayout username,Phone,PostalAddress,Food1,Food2,time;
    Button Donate;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        Phone=findViewById(R.id.Phone);
        PostalAddress=findViewById(R.id.PostalAddress);
        Food1=findViewById(R.id.Food1);
        Food2=findViewById(R.id.Food2);
        time=findViewById(R.id.Time);
        Donate=findViewById(R.id.Donate);

        Donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rootNode = FirebaseDatabase.getInstance();
                reference= rootNode.getReference("food");

                String name = username.getEditText().getText().toString();
                String phoneNo = Phone.getEditText().getText().toString();
                String address = PostalAddress.getEditText().getText().toString();
                String MentionFood = Food1.getEditText().getText().toString();
                String QuantityFood= Food2.getEditText().getText().toString();
                String Time = time.getEditText().getText().toString();

                UserHelperClass helperClass = new UserHelperClass(name,phoneNo,address,MentionFood,QuantityFood,Time);

                reference.child(phoneNo).setValue(helperClass);

                Toast.makeText(getApplicationContext(),"Successfully Donated",Toast.LENGTH_LONG).show();

            }
        });

    }


}