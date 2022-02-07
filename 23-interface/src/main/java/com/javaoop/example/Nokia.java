package com.javaoop.example;

/**
 * Nokia adalah class konkrit dari interface Phone
 * Jadi setiap class yang menggunakan Interface Phone, maka juga bisa menggunakan class Nokia
 * Contohnya class UserHandphone membutuhkan interface Phone untuk menjalankan fiturnya, maka UserHandphone juga bisa menggunakan class Nokia ini
 * Dengan syarat di class UserHandphone harus memiliki constructor dengan parameter berupa interface Phone
 */
public class Nokia implements Phone {

    private int volume;
    private boolean tombolPowerOn;

    @Override
    public void nyalakanPhone() {
        tombolPowerOn = true;
        System.out.println("Handphone sudah menyala....");
        System.out.println("Selamat datang di Nokia");
    }

    @Override
    public void matikanPhone() {
        tombolPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void tambahVolume() {

        if (tombolPowerOn = true){
            if (this.volume == MAX_VOLUME){
                System.out.println("Volume maksimal " + MAX_VOLUME + "%");
            } else {
                this.volume = this.volume + 10;
                System.out.println("Volume sekarang " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Handphone belum nyala");
        }

    }

    @Override
    public void kurangVolume() {
        if (tombolPowerOn = true){
            if (this.volume == MIN_VOLUME){
                System.out.println("Volume minimal " + MIN_VOLUME + "%");
            } else {
                this.volume = this.volume - 10;
                System.out.println("Volume sekarang " + this.volume + "%");
            }
        } else {
            System.out.println("Handphone belum nyala");
        }
    }

    public int getVolume() {
        return volume;
    }
}
