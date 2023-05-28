package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();

        items.add(new Item("Vicky Kaushal","vicky@email.com", R.drawable.a));
        items.add(new Item("Shirley Setia", "shirley@email.com", R.drawable.b));
        items.add(new Item("Alia Bhat", "alia@email.com", R.drawable.c));
        items.add(new Item("Arjun Kapoor", "arjun@email.com", R.drawable.d));
        items.add(new Item("Anushka Sharma", "anushka@email.com", R.drawable.e));
        items.add(new Item("Andre Russel", "andre@email.com", R.drawable.f));
        items.add(new Item("Harhbajhan Singh", "harbhajhan@email.com", R.drawable.g));
        items.add(new Item("Siddharth Malhotra", "sid@email.com", R.drawable.h));
        items.add(new Item("Varun Dhavan","varun@email.com", R.drawable.a));
        items.add(new Item("Kiara Advani", "kiara@email.com", R.drawable.b));
        items.add(new Item("Anushka Sen", "anusen@email.com", R.drawable.c));
        items.add(new Item("Ranveer Singh", "ranveer@email.com", R.drawable.d));
        items.add(new Item("Deepika Padukone", "deepika@email.com", R.drawable.e));
        items.add(new Item("Sunil Narine", "sunil@email.com", R.drawable.f));
        items.add(new Item("Navjot Sidhu", "navjot@email.com", R.drawable.g));
        items.add(new Item("Ranbir Kapoor", "ranbir@email.com", R.drawable.h));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}