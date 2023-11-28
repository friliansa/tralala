package com.example.senddatamahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import java.util.HashMap;
import java.util.Map;


public class Mahasiswa extends AppCompatActivity {
    private EditText etNama, etNim, etAlamat, etBeratbadan;
    private Button btnKirim;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

        database = FirebaseDatabase.getInstance().getReference();//.child("Users");
//        db = FirebaseFirestore.getInstance();

        // Get a reference to the database
//        FirebaseFirestore db = FirebaseFirestore.getInstance();
//
//
//
//        HashMap<String,String> hashMap = new HashMap<>();
//        hashMap.put("like","Facebook");
//        hashMap.put("hoby","Programming");
//
//        database.setValue(hashMap);
//        // Get a reference to the database
//        database = FirebaseDatabase.getInstance().getReferenceFromUrl("https://mahasiswa-1b382-default-rtdb.firebaseio.com/");
//        database = FirebaseDatabase.getInstance().getReference("pesan");
//
//        // Write data to the database
//        database.child("message").setValue("Hello, Firebase!");

        etNama = findViewById(R.id.etNama);
        etNim = findViewById(R.id.etNim);
        etAlamat = findViewById(R.id.etAlamat);
        etBeratbadan = findViewById(R.id.etBeratbadan);
        btnKirim = findViewById(R.id.btnKirim);


        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String nama = etNama.getText().toString();
                String nim = etNim.getText().toString();
                String alamat = etAlamat.getText().toString();
                String berat = etBeratbadan.getText().toString();

                if (nama.isEmpty() || nim.isEmpty() || alamat.isEmpty() || berat.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Ada data yang belum terisi.", Toast.LENGTH_SHORT).show();
                }else{
//                    database = FirebaseDatabase.getInstance().getReference("mahasiswa");
//                    database.child(nim).child("nim").setValue(nim);
//                    database.child(nim).child("nama").setValue(nama);
//                    database.child(nim).child("alamat").setValue(alamat);
//                    database.child(nim).child("berat").setValue(berat);

                    Toast.makeText(getApplicationContext(), "Data berhasil disimpan.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}