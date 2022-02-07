package com.javaoop.data;

/**
 * BlankException adalah class untuk RuntimeException
 * artinya tidak wajib di try-catch
 */
public class BlankException extends RuntimeException {

    public BlankException(String message) {
        super(message);
    }
}
