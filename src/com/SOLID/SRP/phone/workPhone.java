package com.SOLID.SRP.phone;

public class workPhone {
    public static void main(String[] args) {
        PhoneIO phone = new PhoneIO(new CallIO(), new MassageIO());
        phone.call("0675497384");
        phone.acceptMassenge();
        phone.abrupt();
        phone.sendMassenge("Interface is under the trunk)))");
    }
}
