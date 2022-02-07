package com.javaoop.example;

public class UserHandphone {

    // Phone is interface
    private Phone phone;

    // constructor with parameter object phone
    public UserHandphone(Phone phone) {
        this.phone = phone;
    }

    public void aktifkanHandphone(){
        this.phone.nyalakanPhone();
    }

    public void matikanHandphone(){
        this.phone.matikanPhone();
    }

    public void volumeNaik(){
        this.phone.tambahVolume();
    }

    public void volumeTurun(){
        this.phone.kurangVolume();
    }
}
