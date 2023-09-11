package com.example.coffeePole.object;

public class Storage {

    private int stock;

    public Storage(int stock){
        this.stock = stock;
    }

    public boolean check(){
        if(stock>0) return true;
        else return false;
    }

}
