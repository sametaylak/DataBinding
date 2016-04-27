package com.sametaylak.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sametaylak.databinding.Adapters.UserRecyclerAdapter;
import com.sametaylak.databinding.Models.User;
import com.sametaylak.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mUsers;
    UserRecyclerAdapter mUsersRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> userList = new ArrayList();
        userList.add(new User("Samet", "Aylak"));
        userList.add(new User("Yavuz", "Çelenk"));
        userList.add(new User("İbrahim", "Ateş"));
        userList.add(new User("Samet", "Döşemecioğlu"));

        mUsers = (RecyclerView) findViewById(R.id.m_users);
        mUsers.setLayoutManager(new LinearLayoutManager(this));

        mUsersRecyclerAdapter = new UserRecyclerAdapter(userList);
        mUsers.setAdapter(mUsersRecyclerAdapter);

    }


}
