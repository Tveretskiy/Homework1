package com.DZkursovik;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;

public class Seller extends User {

    public String regexFIO = "([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)";
    public String regexLogin = "\\A^[A-Za-z\\d_-]+$\\z";
    public String regexPhone = "^(?:\\+7|8)?9(?:\\d{9})$";
    public String regexPassword = "\"^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$\"gm";

    List<Buyer> buyers = new ArrayList<>();

    public Seller(String login, String password) {
        super(login, password);
    }

    public List<Buyer> readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("BuyersRawData.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                UUID id = UUID.randomUUID();

                if (parts[0].matches(regexFIO)) {
                    buyers.add(new Buyer(parts[1], parts[2], parts[0], parts[3], id));
                } else {
                    System.out.println("Data is not valid");
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buyers;
    }

    public void showActiveBuyers() {
        try {
            FileWriter outputfile = new FileWriter("BuyersDataBase.csv");
            CSVWriter writer = new CSVWriter(outputfile);
            Collections.sort(buyers);
            for (Buyer buyer : buyers){
                String[] data = {buyer.name, buyer.phone, buyer.login, buyer.id.toString()};
                writer.writeNext(data);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}