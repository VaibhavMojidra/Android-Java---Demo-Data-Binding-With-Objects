package com.vaibhavmojidra.databindingwithobjectsjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.vaibhavmojidra.databindingwithobjectsjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setStudent(new Student(10,"Vaibhav","VaibhavMojidra@gmail.com"));
    }
}