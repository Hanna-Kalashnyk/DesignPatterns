package com.SOLID.SRP;

public class CallIO implements CallManager {
    @Override
    public void makeConnection(String number) {
        System.out.println("IO  makes Connection to "+ number );
    }

    @Override
    public void abruptConnection() {
        System.out.println("IO  abrupt Connection");
    }
}
