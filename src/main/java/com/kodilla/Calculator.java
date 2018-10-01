package com.kodilla;

public class Calculator {
    public int liczbaA;
    public int  liczbaB;

    public Calculator (int liczbaA, int liczbaB){
        this.liczbaA=liczbaA;
        this.liczbaB=liczbaB;

    }

    public int  dodawanie(){
        return liczbaB  + liczbaA;

    }
    public int odejmowanie(){
        return liczbaA - liczbaB;

    }
    public int getLiczbaA() {
        return liczbaA;
    }

    public int getLiczbaB() {
        return liczbaB;
    }
    public static void main (String args[]){
        Calculator test = new Calculator(3,3);
        System.out.println(test.dodawanie());

    }
}
