package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.dagger2.ApplicationPack.MyApplication;
import com.example.dagger2.Model.SignupModel;
import com.example.dagger2.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public SignupModel signupModel;


    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


       signupModel = MyApplication.userComponent.signupModel();


       binding.signupButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               signupModel.setEdittextName(binding.edittextName.getText().toString().trim());
               signupModel.setEdittextSurname(binding.edittextSurname.getText().toString().trim());
           }
       });
    }
}