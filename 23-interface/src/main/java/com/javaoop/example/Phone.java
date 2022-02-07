package com.javaoop.example;

/**
 * Interface Phone berfungsi sebagai penghubung antara class UserHandphone dan class MerkPhone
 */
public interface Phone {

    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void nyalakanPhone();
    void matikanPhone();
    void tambahVolume();
    void kurangVolume();
}
