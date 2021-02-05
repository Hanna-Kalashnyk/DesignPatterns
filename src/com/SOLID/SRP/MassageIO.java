package com.SOLID.SRP;

public class MassageIO implements MassageManager {
    @Override
    public void sendMassage(String massage) {
        System.out.println(massage    + "is sent");
    }

    @Override
    public String acceptMassage() {
        String receivedMassage = "Some received Massage";
        System.out.println("massage is accepted");

        return receivedMassage;
    }
}
