package com.example.fooddonate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Clothes extends AppCompatActivity {

    TextInputLayout username,Phone_Cloth,PostalAddress_Cloth,Mention_Cloth,Quantity_Cloth,Donate_Cloth;
    Button Donate;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        username=findViewById(R.id.username);
        Phone_Cloth=findViewById(R.id.Phone_cloth);
        PostalAddress_Cloth=findViewById(R.id.PostalAddress_Cloth);
        Mention_Cloth=findViewById(R.id.MentionCloth);
        Quantity_Cloth=findViewById(R.id.QuantityCloth);
        Donate_Cloth=findViewById(R.id.Donate);

        Donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rootNode = FirebaseDatabase.getInstance();
                reference= rootNode.getReference("clothes");

                String name1 = username.getEditText().getText().toString();
                String phoneNo1 = Phone_Cloth.getEditText().getText().toString();
                String address1 = PostalAddress_Cloth.getEditText().getText().toString();
                String MentionCloth1= Mention_Cloth.getEditText().getText().toString();
                String QuantityCloth1= Quantity_Cloth.getEditText().getText().toString();


                ClothHelperClass clothes  = new ClothHelperClass(name1,phoneNo1,address1,MentionCloth1,QuantityCloth1);

                reference.child(phoneNo1).setValue(clothes);

                Toast.makeText(getApplicationContext(),"Successfully Donated",Toast.LENGTH_LONG).show();

            }
        });

    }
}


