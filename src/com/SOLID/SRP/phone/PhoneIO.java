package com.SOLID.SRP.phone;

public class PhoneIO {
    CallIO caller;
    MassageIO masseger;

    public PhoneIO(CallIO caller, MassageIO masseger) {
        this.caller = caller;
        this.masseger = masseger;
    }
    public void call(String number) {
        caller.makeConnection( number);
    }
    public void abrupt() {
        caller.abruptConnection();
    }
    public void sendMassenge(String massege) {
        masseger.sendMassage( massege);
    }
    public void acceptMassenge() {
        masseger.acceptMassage();
    }
}
