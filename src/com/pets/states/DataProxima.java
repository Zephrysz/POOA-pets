package com.pets.states;


public class DataProxima implements Situacao {
    private static DataProxima instance = new DataProxima();

    private DataProxima() {}

    public static DataProxima getInstance() {
        return instance;
    }


}
