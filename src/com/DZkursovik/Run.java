package com.DZkursovik;
public class Run {

    public static void main(String[] args) {

        Seller seller = new Seller("login", "Password123!");

        seller.readFile();
        seller.showActiveBuyers();
    }
}