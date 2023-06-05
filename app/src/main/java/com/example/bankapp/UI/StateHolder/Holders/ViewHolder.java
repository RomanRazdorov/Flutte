package com.example.bankapp.UI.StateHolder.Holders;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bankapp.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView numberTextView;
    public TextView balanceTextView;

    public ViewHolder(View itemView) {
        super(itemView);
        numberTextView = itemView.findViewById(R.id.account_number);
        balanceTextView = itemView.findViewById(R.id.account_balance);
    }
}
