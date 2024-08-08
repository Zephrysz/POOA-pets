package com.pets.states;



public class DataLonge implements Situacao {
    private static DataLonge instance = new DataLonge();

    private DataLonge() {}

    public static DataLonge getInstance() {
        return instance;
    }


}
