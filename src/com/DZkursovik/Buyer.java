package com.DZkursovik;
import java.util.UUID;

public class Buyer extends User implements Comparable<Buyer>{
    public String name;
    public UUID id;
    public String phone;

    public String getName() {
        return name;
    }

    public Buyer(String login, String password, String name, String phone, UUID id) {
        super(login, password);
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    @Override
    public int compareTo(Buyer e) {
        return this.getName().compareTo(e.getName());
    }


}