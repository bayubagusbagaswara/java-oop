package com.javaoop.data;

/**
 * DatabaseError adalah jenis exception error
 */
public class DatabaseError extends Error {

    public DatabaseError(String message) {
        super(message);
    }
}
