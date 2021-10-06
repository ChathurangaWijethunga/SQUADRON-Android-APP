package com.example.squadron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.squadron.databinding.ActivitySubcategoryAddBinding;

public class SubcategoryAddActivity extends AppCompatActivity {

    private ActivitySubcategoryAddBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubcategoryAddBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //handle click, start adminDashboard screen
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SubcategoryAddActivity.this, DashboardAdminActivity.class));
            }
        });
    }
}