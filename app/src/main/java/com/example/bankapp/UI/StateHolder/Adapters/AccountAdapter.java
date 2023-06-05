package com.example.bankapp.UI.StateHolder.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.recyclerview.widget.RecyclerView;

import com.example.bankapp.Data.Models.Account;
import com.example.bankapp.R;
import com.example.bankapp.UI.StateHolder.Holders.ViewHolder;

import java.util.List;
import java.util.Locale;

public class AccountAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Account> accounts;

    public AccountAdapter(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.account_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Account account = accounts.get(position);
        holder.numberTextView.setText(account.getNumber());
        holder.balanceTextView.setText(String.format(Locale.getDefault(), "%d руб.", account.getBalance()));
    }

    @Override
    public int getItemCount() {
        return accounts.size();
    }
}