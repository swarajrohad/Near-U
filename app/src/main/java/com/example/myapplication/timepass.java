package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

//import com.google.firebase.F
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.UUID;

public class timepass extends AppCompatActivity {

   TextView headline, description,price,brand,producttype,about,origin;
   ImageView productimage,uploadbtn;
   Button submit;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepass);

        headline = findViewById(R.id.headline);
        description = findViewById(R.id.description);
        price = findViewById(R.id.price);
        brand = findViewById(R.id.brand);
        producttype = findViewById(R.id.producttype);
        about = findViewById(R.id.about);
        origin = findViewById(R.id.origin);
        uploadbtn = findViewById(R.id.uploadbtn);
        productimage = findViewById(R.id.productImage);
        submit = findViewById(R.id.submit);


}}