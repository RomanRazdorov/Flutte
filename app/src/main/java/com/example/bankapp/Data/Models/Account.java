package com.example.bankapp.Data.Models;

public class Account {

    private String number;
    private int balance;

    public Account(String number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}