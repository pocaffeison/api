package com.example.pocaffesy.api.distribute;

public class User { //User 와 Money
    private String id;
    private String name;
    private Money money;

    public User(String id, String name){
        this.id = id;
        this.name = name;
    }
    public void setMoney(Money money) {
        this.money = money;
    }
}
