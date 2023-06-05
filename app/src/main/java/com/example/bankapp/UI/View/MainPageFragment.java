package com.example.bankapp.UI.View;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.bankapp.Data.Models.Account;
import com.example.bankapp.UI.StateHolder.Adapters.AccountAdapter;
import com.example.bankapp.databinding.FragmentMainPageBinding;

import java.util.ArrayList;
import java.util.List;


public class MainPageFragment extends Fragment {

    FragmentMainPageBinding mainPageBinding;

    public MainPageFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainPageBinding = FragmentMainPageBinding.inflate(inflater);
        return mainPageBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String username = "Username";
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Sanya", 1000));
        accounts.add(new Account("Nekit", 5000));

        mainPageBinding.username.setText(username);

        AccountAdapter accountAdapter = new AccountAdapter(accounts);
        mainPageBinding.accounts.setAdapter(accountAdapter);
    }
}